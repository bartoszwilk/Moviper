package com.mateuszkoslacz.moviper.rxpresenter;

import android.support.annotation.NonNull;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;
import com.mateuszkoslacz.moviper.base.interactor.BaseRxInteractor;
import com.mateuszkoslacz.moviper.base.presenter.BaseRxPresenter;
import com.mateuszkoslacz.moviper.base.routing.BaseRxRouting;
import com.mateuszkoslacz.moviper.iface.interactor.ViperRxInteractor;
import com.mateuszkoslacz.moviper.iface.routing.ViperRxRouting;

/**
 * Created by bwilk on 12/20/16.
 */

public class CustomPresenter
        extends BaseRxPresenter<MvpView,
        ViperRxInteractor,
        ViperRxRouting>
        implements MvpPresenter<MvpView> {

    private BaseRxRouting routing;
    private BaseRxInteractor interactor;

    @NonNull
    @Override
    public ViperRxInteractor createInteractor() {
        return interactor;
    }

    @NonNull
    @Override
    public ViperRxRouting createRouting() {
        return routing;
    }
}
