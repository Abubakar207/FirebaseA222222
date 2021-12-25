package com.example.firebase_auth;

import android.app.Application;

public class FirebaseApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        com.google.firebase.FirebaseApp.initializeApp(this);
    }
}