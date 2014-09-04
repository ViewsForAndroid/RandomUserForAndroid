package com.viewsforandroid.randomuserforandroid.inject.modules;

import com.viewsforandroid.randomuserforandroid.RandomUserApplication;
import dagger.Module;

@Module(
        includes = {
                // Modules
        },
        injects = {
                RandomUserApplication.class
        },
        library = true,
        complete = true
)
public class RandomUserAppModule {

    private RandomUserApplication app;

    public RandomUserAppModule(RandomUserApplication app) {
        this.app = app;
    }

}
