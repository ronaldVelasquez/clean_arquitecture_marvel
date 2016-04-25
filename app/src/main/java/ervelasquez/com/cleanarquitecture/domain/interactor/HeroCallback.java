package ervelasquez.com.cleanarquitecture.domain.interactor;

import java.util.ArrayList;

import ervelasquez.com.cleanarquitecture.domain.model.Hero;

/**
 * Created by RONALD on 24/04/2016.
 */
public interface HeroCallback {
    void onHeroSuccess(ArrayList<Hero> heroes);

    void onHeroError(String message);
}
