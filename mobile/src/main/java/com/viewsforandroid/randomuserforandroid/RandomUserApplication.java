package com.viewsforandroid.randomuserforandroid;

import android.app.Application;
import com.viewsforandroid.randomuserforandroid.inject.Injector;
import com.viewsforandroid.randomuserforandroid.inject.ObjectGraphProvider;
import dagger.ObjectGraph;
import org.jetbrains.annotations.NotNull;

public class RandomUserApplication extends Application implements Injector, ObjectGraphProvider {

    @Override
    public void inject(@NotNull Object target) {

    }

    @Override
    public ObjectGraph getObjectGraph() {
        return null;
    }

}
