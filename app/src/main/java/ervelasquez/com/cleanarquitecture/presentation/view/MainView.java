package ervelasquez.com.cleanarquitecture.presentation.view;

import android.content.Context;

import java.util.ArrayList;

import ervelasquez.com.cleanarquitecture.domain.model.Hero;

/**
 * Created by RONALD on 24/04/2016.
 */
public interface MainView {
    Context getContext();

    void showLoading();

    void hideLoading();

    void showHeroes(ArrayList<Hero> heroes);

    void showErrorMessage(String message);

    void navigateToHero(Hero hero);
}
