package com.viewsforandroid.randomuserforandroid.inject.modules;

import com.viewsforandroid.randomuserforandroid.RandomUserApplication;

public class Modules {

    public static Object[] list(RandomUserApplication app) {
        return new Object[] {
                new RandomUserAppModule(app),
        };
    }

    private Modules() {
        // No instances
    }

}
