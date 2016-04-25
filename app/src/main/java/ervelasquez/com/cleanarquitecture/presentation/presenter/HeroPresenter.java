package ervelasquez.com.cleanarquitecture.presentation.presenter;

import java.util.ArrayList;

import ervelasquez.com.cleanarquitecture.data.datasource.HeroDataStoreFactory;
import ervelasquez.com.cleanarquitecture.data.datasource.mapper.HeroDataMapper;
import ervelasquez.com.cleanarquitecture.data.repository.HeroDataRepository;
import ervelasquez.com.cleanarquitecture.domain.interactor.HeroCallback;
import ervelasquez.com.cleanarquitecture.domain.interactor.HeroInteractor;
import ervelasquez.com.cleanarquitecture.domain.model.Hero;
import ervelasquez.com.cleanarquitecture.domain.repository.HeroRepository;
import ervelasquez.com.cleanarquitecture.presentation.view.MainView;

/**
 * Created by RONALD on 24/04/2016.
 */
public class HeroPresenter implements Presenter<MainView>, HeroCallback {
    private MainView view;
    private HeroInteractor heroInteractor;

    public void loadHeroes() {
        view.showLoading();
        heroInteractor.loadHeroes(this);
    }

    public void selectHero(Hero hero) {
        this.view.navigateToHero(hero);
    }


    @Override
    public void addView(MainView view) {
        this.view = view;
        HeroRepository heroRepository = new HeroDataRepository(new HeroDataStoreFactory(this.view.getContext()), new HeroDataMapper());
        heroInteractor = new HeroInteractor(heroRepository);
    }

    @Override
    public void removeView(MainView view) {
        this.view = null;
    }

    @Override
    public void onHeroSuccess(ArrayList<Hero> heroes) {
        this.view.hideLoading();
        this.view.showHeroes(heroes);
    }

    @Override
    public void onHeroError(String message) {
        this.view.hideLoading();
        this.view.showErrorMessage(message);
    }
}
