package com.mateuszkoslacz.moviper.rxpresenter;

import com.mateuszkoslacz.moviper.base.interactor.BaseRxInteractor;
import com.mateuszkoslacz.moviper.base.routing.BaseRxRouting;
import com.mateuszkoslacz.moviper.presenterbus.Moviper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Created by bwilk on 12/20/16.
 */

public class ViperRxPresenterTest {

    @Mock
    BaseRxRouting baseRxRouting;

    @Mock
    BaseRxInteractor baseRxInteractor;

    @InjectMocks
    CustomPresenter presenter = new CustomPresenter();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void cleanUp() {
        Moviper.getInstance().unregister(presenter);
    }

    @Test
    public void routingShouldAttachOnPresenterAttach() {
        presenter.attachView(Mockito.any());
        Mockito.verify(baseRxRouting).attach(Mockito.any());
    }

    @Test
    public void routingShouldDetachOnPresenterDetach() {
        presenter.detachView(false);
        Mockito.verify(baseRxRouting).detach(false);
    }

    @Test
    public void routingShouldNotBeAttachedBeforePresenterAttach() {
        Mockito.verify(baseRxRouting, Mockito.never()).attach(Mockito.any());
    }

    @Test
    public void routingShouldNotBeDetachedBeforePresenterDetach() {
        Mockito.verify(baseRxRouting, Mockito.never()).detach(false);
    }

    @Test
    public void interactorShouldAttachAfterPresenterAttach() {
        presenter.attachView(Mockito.any());
        Mockito.verify(baseRxInteractor).attach();
    }

    @Test
    public void interactorShouldDetachOnPresenterDetach() {
        presenter.detachView(false);
        Mockito.verify(baseRxInteractor).detach(false);
    }

    @Test
    public void interactorShouldNotBeAttachedBeforePresenterAttach() {
        Mockito.verify(baseRxInteractor, Mockito.never()).attach();
    }

    @Test
    public void interactorShouldNotBeDetachedBeforePresenterDetach() {
        Mockito.verify(baseRxInteractor, Mockito.never()).detach(false);
    }
}
