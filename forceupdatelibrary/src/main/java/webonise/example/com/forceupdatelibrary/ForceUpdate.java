package webonise.example.com.forceupdatelibrary;

public class ForceUpdate {

   public String checkFortheForceUpdate(String latestAppVersion, String minimumAppVersion,String appVersion){
       String showUpgrade=null;
       int latestVersion = Integer.parseInt(latestAppVersion.replace(".", ""));
       int minimumVersion = Integer.parseInt(minimumAppVersion.replace(".", ""));
       int currentVersion = Integer.parseInt(appVersion.replace(".", ""));
       if ((minimumVersion <= currentVersion) && (currentVersion < latestVersion)) {
            showUpgrade="yes";
       } else if (currentVersion < minimumVersion) {
            showUpgrade="no";
       }else{
           showUpgrade="nope";
       }
       return showUpgrade;
    }


}
