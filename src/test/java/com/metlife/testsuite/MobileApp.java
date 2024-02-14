package com.metlife.testsuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.NetworkSpeed;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URL;

public class MobileApp
{

    public static void main(String[] args) throws MalformedURLException
    {
        UiAutomator2Options options=new UiAutomator2Options()
                .setNetworkSpeed(NetworkSpeed.EDGE.name())
        .setApp("C:\\Users\\Administrator\\Downloads\\KA.apk");
        AndroidDriver driver=new AndroidDriver(new URL("127.0.0.1:4723)"),options);
//driver.pressKey(new KeyEvent(AndroidKey.HOME));
//driver.openNotifications();
    }
}
