package com.viewsforandroid.randomuserforandroid.inject.modules;

import com.viewsforandroid.randomuserforandroid.RandomUserApplication;
import dagger.Module;

@Module(
        addsTo = RandomUserAppModule.class,
        overrides = true,
        includes = {}
)
public class RandomUserAppModuleDebug {

    public RandomUserAppModuleDebug(RandomUserApplication app) {}

}
