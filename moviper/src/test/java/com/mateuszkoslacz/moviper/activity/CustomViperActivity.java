package com.mateuszkoslacz.moviper.activity;

import android.support.annotation.NonNull;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;
import com.hannesdorfmann.mosby.mvp.delegate.ActivityMvpDelegate;
import com.mateuszkoslacz.moviper.base.view.activity.ViperActivity;

/**
 * Created by bwilk on 12/20/16.
 */

public class CustomViperActivity extends ViperActivity<MvpView, MvpPresenter<MvpView>> {

    private ActivityMvpDelegate<MvpView, MvpPresenter<MvpView>> mvpDelegate;

    @NonNull
    @Override
    public MvpPresenter<MvpView> createPresenter() {
        return null;
    }

    @NonNull
    @Override
    protected ActivityMvpDelegate<MvpView, MvpPresenter<MvpView>> getMvpDelegate() {
        return mvpDelegate;
    }

    public void setMvpDelegate(ActivityMvpDelegate<MvpView, MvpPresenter<MvpView>> delegate) {
        mvpDelegate = delegate;
    }
}
