package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("PQQFJEjDpO8Qkr4Tp1CxGTPJMm3HDeBxjkZYR095")
                .clientKey("cvvtoOios3Iyo6MlUZsdwFTjhUAOYu4bNkghfSbo")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
