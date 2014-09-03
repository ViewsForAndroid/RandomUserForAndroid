package com.viewsforandroid.randomuserforandroid.utils;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import org.jetbrains.annotations.Nullable;

/**
 * Util class for perfoming common operations related to fragments.
 */
public class Fragments {

    public static void replace(FragmentActivity activity, Fragment f, int container) {
        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(container, f)
                .commit();
    }

    public static void replace(FragmentActivity activity, Fragment f, int container, String tag) {
        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(container, f, tag)
                .commit();
    }

    @Nullable
    public static Fragment findByTag(FragmentActivity activity, String tag) {
        return activity.getSupportFragmentManager().findFragmentByTag(tag);
    }

    @Nullable
    public static Fragment findyById(FragmentActivity activity, int id) {
        return activity.getSupportFragmentManager().findFragmentById(id);
    }

    public static Bundle intentToFragmentArguments(Intent intent) {
        Bundle arguments = new Bundle();
        if (intent == null) {
            return arguments;
        }

        final Uri data = intent.getData();
        if (data != null) {
            arguments.putParcelable("_uri", data);
        }

        final Bundle extras = intent.getExtras();
        if (extras != null) {
            arguments.putAll(intent.getExtras());
        }

        return arguments;
    }

    public static Intent fragmentArgumentsToIntent(Bundle arguments) {
        Intent intent = new Intent();
        if (arguments == null) {
            return intent;
        }

        final Uri data = arguments.getParcelable("_uri");
        if (data != null) {
            intent.setData(data);
        }

        intent.putExtras(arguments);
        intent.removeExtra("_uri");
        return intent;
    }

    private Fragments() {
        // No instances!
    }

}