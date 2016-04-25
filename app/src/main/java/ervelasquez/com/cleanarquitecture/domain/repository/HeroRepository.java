package ervelasquez.com.cleanarquitecture.domain.repository;

import ervelasquez.com.cleanarquitecture.domain.interactor.HeroCallback;

/**
 * Created by RONALD on 24/04/2016.
 */
public interface HeroRepository {
    void loadPlaces(final HeroCallback heroCallback);
}
