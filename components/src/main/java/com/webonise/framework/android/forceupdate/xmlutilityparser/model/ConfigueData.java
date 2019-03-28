package com.webonise.framework.android.forceupdate.xmlutilityparser.model;

import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.SoftReference;



public class ConfigueData {

    private String fireHoseStream;

    private String bucketRegion;

    private String bucket;

    private String langFilePath;

    private String fireHoseRegion;

    private String bucketUrl;

    private String termsUrl;

    private String privacyUrl;

    private String faqUrl;

    private String contactusUrl;

    private String langFileVer;

    private String profilePic;

    private String fireHosePoolId;

    private String configVersion;

    private String bkgAndroidImg;

    private String bkgiOSImg;

    private String androidVersion;

    private String imgTimeStamp;

    private String androidMinVersion;

    private String iosMinVersion;

    private String iosVersion;

    private SoftReference<String> backgroundImgUrl;

    public String getConfigVersion() {
        return configVersion;
    }

    public void setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
    }

    public String getBkgAndroidImg() {
        return bkgAndroidImg;
    }

    public void setBkgAndroidImg(String bkgAndroidImg) {
        this.bkgAndroidImg = bkgAndroidImg;
    }

    public String getBkgiOSImg() {
        return bkgiOSImg;
    }

    public void setBkgiOSImg(String bkgiOSImg) {
        this.bkgiOSImg = bkgiOSImg;
    }

    public String getAndroidVersion ()
    {
        return TextUtils.isEmpty(androidVersion) ? "0" : androidVersion;
    }

    public void setAndroidVersion (String androidVersion)
    {
        this.androidVersion = androidVersion;
    }

    public String getImgTimeStamp ()
    {
        return imgTimeStamp;
    }

    public void setImgTimeStamp (String imgTimeStamp)
    {
        this.imgTimeStamp = imgTimeStamp;
    }


    public String getAndroidMinVersion ()
    {
        return TextUtils.isEmpty(androidMinVersion) ? "0" : androidMinVersion;
    }

    public void setAndroidMinVersion (String androidMinVersion)
    {
        this.androidMinVersion = androidMinVersion;
    }

    public String getIosMinVersion ()
    {
        return iosMinVersion;
    }

    public void setIosMinVersion (String iosMinVersion)
    {
        this.iosMinVersion = iosMinVersion;
    }

    public String getIosVersion ()
    {
        return iosVersion;
    }

    public void setIosVersion (String iosVersion)
    {
        this.iosVersion = iosVersion;
    }

    public String getFireHoseStream() {
        return fireHoseStream;
    }

    public void setFireHoseStream(String fireHoseStream) {
        this.fireHoseStream = fireHoseStream;
    }

    public String getBucketRegion() {
        return bucketRegion;
    }

    public void setBucketRegion(String bucketRegion) {
        this.bucketRegion = bucketRegion;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getLangFilePath() {
        return langFilePath;
    }

    public void setLangFilePath(String langFilePath) {
        this.langFilePath = langFilePath;
    }

    public String getFireHoseRegion() {
        return fireHoseRegion;
    }

    public void setFireHoseRegion(String fireHoseRegion) {
        this.fireHoseRegion = fireHoseRegion;
    }

    public String getBucketUrl() {
        return bucketUrl;
    }

    public void setBucketUrl(String bucketUrl) {
        this.bucketUrl = bucketUrl;
    }

    public String getTermsUrl() {
        return termsUrl;
    }

    public void setTermsUrl(String termsUrl) {
        this.termsUrl = termsUrl;
    }

    public String getPrivacyUrl() {
        return privacyUrl;
    }

    public void setPrivacyUrl(String privacyUrl) {
        this.privacyUrl = privacyUrl;
    }

    public String getFaqUrl() {
        return faqUrl;
    }

    public void setFaqUrl(String faqUrl) {
        this.faqUrl = faqUrl;
    }

    public String getContactusUrl() {
        return contactusUrl;
    }

    public void setContactusUrl(String contactusUrl) {
        this.contactusUrl = contactusUrl;
    }

    public String getLangFileVer() {
        return langFileVer;
    }

    public void setLangFileVer(String langFileVer) {
        this.langFileVer = langFileVer;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getFireHosePoolId() {
        return fireHosePoolId;
    }

    public void setFireHosePoolId(String fireHosePoolId) {
        this.fireHosePoolId = fireHosePoolId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [configVersion = "+configVersion+", androidVersion = "+androidVersion+", imgTimeStamp = " +
                ""+imgTimeStamp+", bkgAndroidImg = "+bkgAndroidImg+", bkgiOSImg = "+bkgiOSImg+", androidMinVersion = "+
                ""+androidMinVersion+", iosMinVersion = "+iosMinVersion+", iosVersion = "+iosVersion+"]";
    }




}
