package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseUser;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("cPAsDKvR8f1JWqEB1ed4eEpRh7M2ddRDQCYB6rJf")
                .clientKey("827tv4hQ6XiXEXTQMpyuyq91SRtSu2q2jWcKlNA4")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
