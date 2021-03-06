package com.mateuszkoslacz.moviper.rxsample.viper.routing;

import android.app.Activity;
import android.support.annotation.NonNull;

import com.mateuszkoslacz.moviper.base.routing.ActivityBaseRxRouting;
import com.mateuszkoslacz.moviper.rxsample.viper.contract.FullscreenPhotoContract;

public class FullscreenPhotoRouting
        extends ActivityBaseRxRouting
        implements FullscreenPhotoContract.Routing {

    public FullscreenPhotoRouting(@NonNull Activity activity) {
        super(activity);
    }
}
