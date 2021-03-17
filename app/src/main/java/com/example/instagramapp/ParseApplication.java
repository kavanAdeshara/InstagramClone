package com.example.instagramapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("2L2qSMpRkilvt3w6RF5aPq55n4Pcg0c92Q9WaAHX")
                .clientKey("i66D2MGrnhBiByfgnMIMZSlDlF6Hhw2lVaob9l5r")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
