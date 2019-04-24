package com.webonise.framework.android.components;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class  AppUpgradeModel {


    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("success")
    @Expose
    private Boolean success;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }


    public class Data {
        @SerializedName(Constants.TOOLS)
        @Expose
        private Tools tools;

        public Tools getTools() {
            return tools;
        }

        public void setTools(Tools tools) {
            this.tools = tools;
        }

    }

    public class Tools {
        @SerializedName(Constants.PLATFORM)
        @Expose
        private String platform;
        @SerializedName(Constants.MIN_VERSION)
        @Expose
        private int minimumVersion;
        @SerializedName(Constants.Latest_VERSION)
        @Expose
        private int latestVersion;


        public int getMinimumVersion() {
            return minimumVersion;
        }

        public void setMinimumVersion(int minimumVersion) {
            this.minimumVersion = minimumVersion;
        }

        public int getLatestVersion() {
            return latestVersion;
        }

        public void setLatestVersion(int latestVersion) {
            this.latestVersion = latestVersion;
        }


        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }



        @Override
        public String toString() {
            return "Tools{" +
                    "platform='" + platform + '\'' +
                    ", minimumVersion='" + minimumVersion + '\'' +
                    ", latestVersion='" + latestVersion + '\'' + '}';

        }
    }
}