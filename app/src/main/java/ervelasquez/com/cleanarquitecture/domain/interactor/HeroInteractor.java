package ervelasquez.com.cleanarquitecture.domain.interactor;

import ervelasquez.com.cleanarquitecture.domain.repository.HeroRepository;

/**
 * Created by RONALD on 24/04/2016.
 */
public class HeroInteractor {
    private HeroRepository heroRepository;

    public HeroInteractor(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public void loadHeroes(final HeroCallback heroCallback){
        heroRepository.loadPlaces(heroCallback);
    }
}
