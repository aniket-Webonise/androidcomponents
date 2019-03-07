package webonise.example.com.forceupdatelibrary.libraryclass;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import webonise.example.com.forceupdatelibrary.interfaceretrofit.ForceUpgardeApiService;
import webonise.example.com.forceupdatelibrary.model.AppUpgradeModel;
import webonise.example.com.forceupdatelibrary.utility.Constants;

public class ForceUpdate {


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

    public void getTheLatestVersionFromServer(String baseUrl, final int appversion){
       Retrofit retrofit= connectAndGetApiData(baseUrl);


        ForceUpgardeApiService forceUpgardeApiService = retrofit.create(ForceUpgardeApiService.class);

        Call<AppUpgradeModel> call = forceUpgardeApiService.getAppVersionForUpgrade(Constants.OS_TYPE);
        call.enqueue(new Callback<AppUpgradeModel>() {
            @Override
            public void onResponse(Call<AppUpgradeModel> call, Response<AppUpgradeModel> response) {

                if(response != null && response.body() != null) {

                    showForceUpdateDialog(response,appversion);

                }

            }
            @Override
            public void onFailure(Call<AppUpgradeModel> call, Throwable throwable) {

            }
        });

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
