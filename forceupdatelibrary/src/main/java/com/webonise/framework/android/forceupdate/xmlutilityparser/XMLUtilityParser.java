package com.webonise.framework.android.forceupdate.xmlutilityparser;

import android.text.TextUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import java.io.File;
import java.io.FileInputStream;

import xmlutilityparser.framework.webonise.com.xmlutilityparserlibrary.xmlutilityparser.model.ConfigueData;


public class XMLUtilityParser {

    private  XmlPullParserFactory mXMLPullParserFactory;
    private XmlPullParser mXMLPullParser;
    private File mConfigFile;
    public ConfigueData configueData;


    public XMLUtilityParser( File configFile) {
        mConfigFile = configFile;
        configueData=new ConfigueData();
        try {
            mXMLPullParserFactory = XmlPullParserFactory.newInstance();
            mXMLPullParser = mXMLPullParserFactory.newPullParser();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
    }

    public ConfigueData getAppConfigData() {

        int instanceCount = 0;
        String name = null;
        try {
            mXMLPullParser.setInput(new FileInputStream(mConfigFile), null);
            int event = mXMLPullParser.getEventType();
            while (event != XmlPullParser.END_DOCUMENT) {
                if(event == XmlPullParser.START_TAG) {
                    name = mXMLPullParser.getName();
                }
                switch (event) {
                    case XmlPullParser.START_TAG:
                        if(!name.isEmpty()) {
                            switch(name) {
                                case "instance":

                                    break;
                                case "api":

                                    break;
                            }
                        }
                        break;

                    case XmlPullParser.END_TAG:
                        name = "";
                        break;
                    case XmlPullParser.TEXT:
                        if(!TextUtils.isEmpty(name)) {
                            switch (name) {
                                case "configVersion":
                                    configueData.setConfigVersion(mXMLPullParser.getText());
                                    break;
                                case "imgTimeStamp":
                                    configueData.setImgTimeStamp(mXMLPullParser.getText());
                                    break;
                                case "bkgAndroidImg":
                                    configueData.setBkgAndroidImg(mXMLPullParser.getText());
                                    break;
                                case "androidVersion":
                                    configueData.setAndroidVersion(mXMLPullParser.getText());
                                    break;
                                case "androidMinVersion":
                                    configueData.setAndroidMinVersion(mXMLPullParser.getText());
                                    break;
                                case "profilePic":
                                    configueData.setProfilePic(mXMLPullParser.getText());
                                    break;
                                case "bucket":
                                    configueData.setBucket(mXMLPullParser.getText());
                                    break;
                                case "bucketUrl":
                                    configueData.setBucketUrl(mXMLPullParser.getText());
                                    break;
                                case "bucketRegion":
                                    configueData.setBucketRegion(mXMLPullParser.getText());
                                    break;
                                case "termsUrl":
                                    configueData.setTermsUrl(mXMLPullParser.getText());
                                    break;
                                case "privacyUrl":
                                    configueData.setPrivacyUrl(mXMLPullParser.getText());
                                    break;
                                case "faqUrl":
                                    configueData.setFaqUrl(mXMLPullParser.getText());
                                    break;
                                case "contactusUrl":
                                    configueData.setContactusUrl(mXMLPullParser.getText());
                                    break;
                                case "fireHosePoolId":
                                    configueData.setFireHosePoolId(mXMLPullParser.getText());
                                    break;
                                case "fireHoseStream":
                                    configueData.setFireHoseStream(mXMLPullParser.getText());
                                    break;
                                case "fireHoseRegion":
                                    configueData.setFireHoseRegion(mXMLPullParser.getText());
                                    break;
                                case "baseUrl":

                                    break;
                                case "appIntro":

                                    break;
                                case "friends" :

                                    break;
                                case "master":

                                    break;
                                case "playerAuth":

                                    break;
                                case "playerProfile":

                                    break;
                                case "playerResetPwd":

                                    break;
                                case "playerVerify":

                                    break;
                                case "products":

                                    break;
                                case "playerChallenge":

                                    break;
                                case "challengeResults":

                                    break;
                                case "skillgames":

                                    break;
                                case "sportsEvents":

                                    break;
                                case "transactions":

                                    break;
                                case "gidxPayment":

                                    break;
                                case "webGidx":

                                    break;
                                case "webPayment":
                                    break;
                                case "webPayout":
                                    break;
                                case "webPendingTransaction":
                                    break;
                                case "faceoffWeb":
                                    break;
                                case "userHistory":
                                    break;
                                case "leaderboards":
                                    break;
                                case "langFilePath":
                                    configueData.setLangFilePath(mXMLPullParser.getText());
                                    break;
                                case "langFileVer":
                                    configueData.setLangFileVer(mXMLPullParser.getText());
                                    break;
                            }
                        }
                        break;
                }
                event = mXMLPullParser.next();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return configueData;
    }

}
