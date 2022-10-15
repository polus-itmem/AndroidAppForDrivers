package com.example.polushack;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

public class MainApplication extends Application {
    /**
     * Replace "your_api_key" with a valid developer key.
     * You can get it at the <a href="https://developer.tech.yandex.ru/">...</a> website.
     */
    private final String MAPKIT_API_KEY = "be55ca7c-21a8-4d9c-8414-5edac8731bda";

    @Override
    public void onCreate() {
        super.onCreate();
        // Set the api key before calling initialize on MapKitFactory.
        MapKitFactory.setApiKey(MAPKIT_API_KEY);
    }
}
