package com.viewsforandroid.randomuserforandroid;

import android.app.Application;
import com.google.common.base.Preconditions;
import com.viewsforandroid.randomuserforandroid.inject.Injector;
import com.viewsforandroid.randomuserforandroid.inject.ObjectGraphProvider;
import com.viewsforandroid.randomuserforandroid.inject.modules.Modules;
import dagger.ObjectGraph;
import org.jetbrains.annotations.NotNull;

public class RandomUserApplication extends Application implements Injector, ObjectGraphProvider {

    private ObjectGraph objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();
        initDagger();
    }

    @Override
    public void inject(@NotNull Object target) {
        Preconditions.checkNotNull(target);
        objectGraph.inject(target);
    }

    @Override
    public ObjectGraph getObjectGraph() {
        return objectGraph;
    }

    private void initDagger() {
        objectGraph = ObjectGraph.create(Modules.list(this));
        objectGraph.inject(this);
    }

}
