package com.webonise.framework.android.forceupdate.touchId;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.provider.Settings;

@TargetApi(Build.VERSION_CODES.M)
public class TouchIdUtility {

    public static boolean isDeviceHasFingerPrintHardware(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            FingerprintManager manager = (FingerprintManager) context.getSystemService(Context.FINGERPRINT_SERVICE);
            return manager.isHardwareDetected();
        }
        return false;
    }

    public static boolean isDeviceHasFingerSettedUp(Context context) {
        if (isDeviceHasFingerPrintHardware(context)) {
            FingerprintManager manager = (FingerprintManager) context.getSystemService(Context.FINGERPRINT_SERVICE);
            return manager.hasEnrolledFingerprints();
        }
        return false;
    }

    public static void openSettingsForFP(Context context) {
        Intent intent = new Intent(Settings.ACTION_SETTINGS);
        context.startActivity(intent);
    }


}
