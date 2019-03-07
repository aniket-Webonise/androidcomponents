package com.webonise.framework.android.forceupdate;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ForceUpgardeApiService {

    @GET(Constants.APP_UPGRADE)
    Call<AppUpgradeModel> getAppVersionForUpgrade(@Path(Constants.PLATFORM) String os);
}
