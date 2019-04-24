package com.webonise.framework.android.components;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ForceUpdate {

    private String showUpgrade;

    public Retrofit connectAndGetApiData(String url) {
        Retrofit retrofit = null;
        ;
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

    public String checkAppVersion(String baseUrl, final int appversion){
       Retrofit retrofit= connectAndGetApiData(baseUrl);


        ForceUpgardeApiService forceUpgardeApiService = retrofit.create(ForceUpgardeApiService.class);

        Call<AppUpgradeModel> call = forceUpgardeApiService.getAppVersionForUpgrade(Constants.OS_TYPE);
        call.enqueue(new Callback<AppUpgradeModel>() {
            @Override
            public void onResponse(Call<AppUpgradeModel> call, Response<AppUpgradeModel> response) {

                if(response != null && response.body() != null) {

                     showUpgrade=showForceUpdateDialog(response,appversion);

                }

            }
            @Override
            public void onFailure(Call<AppUpgradeModel> call, Throwable throwable) {

            }
        });

        return showUpgrade;

    }


    public String showForceUpdateDialog(Response<AppUpgradeModel> response,final int appversion) {
        String showUpgrade = null;

        AppUpgradeModel appUpgradeModel = response.body();
        if (appUpgradeModel != null) {


            int latestAppVersion = appUpgradeModel.getData().getTools().getLatestVersion();
            int minimumAppVersion = appUpgradeModel.getData().getTools().getMinimumVersion();

            int currentVersion = appversion;
            if ((minimumAppVersion <= currentVersion) && (currentVersion < latestAppVersion)) {
                showUpgrade = "yes";
            } else if (currentVersion < minimumAppVersion) {
                showUpgrade = "no";
            }else{
                showUpgrade = "equal";
            }
        }

        return showUpgrade;


    }

}
