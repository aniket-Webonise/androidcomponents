package webonise.example.com.forceupdatelibrary.interfaceretrofit;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import webonise.example.com.forceupdatelibrary.model.AppUpgradeModel;
import webonise.example.com.forceupdatelibrary.utility.Constants;

public interface ForceUpgardeApiService {

    @GET(Constants.APP_UPGRADE)
    Call<AppUpgradeModel> getAppVersionForUpgrade(@Path(Constants.PLATFORM) String os);
}
