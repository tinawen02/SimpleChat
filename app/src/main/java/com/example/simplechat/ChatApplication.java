package com.example.simplechat;

import android.widget.ImageButton;

import com.parse.Parse;

import okhttp3.OkHttpClient;

public class ChatApplication extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
// ...
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("BgMeRhXN4Mfsr4iu7cg2PJPITPJgn9T4meopyWPG") // provided in Lab instructions
                .clientKey("r6fZMD0BL8dZx0pVlYemVJbHwqaBtIRqO19SX40c") // provided in Lab instructions
                .clientBuilder(builder)
                .server("https://parseapi.back4app.com/").build());  // provided in Lab instructions


    }
}
