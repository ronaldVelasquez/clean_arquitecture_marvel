package ervelasquez.com.cleanarquitecture.data.repository;

import ervelasquez.com.cleanarquitecture.data.datasource.HeroDataStoreFactory;
import ervelasquez.com.cleanarquitecture.data.datasource.mapper.HeroDataMapper;
import ervelasquez.com.cleanarquitecture.domain.interactor.HeroCallback;
import ervelasquez.com.cleanarquitecture.domain.repository.HeroRepository;

/**
 * Created by RONALD on 24/04/2016.
 */
public class HeroDataRepository implements HeroRepository{
    private final HeroDataStoreFactory heroDataStoreFactory;
    private final HeroDataMapper heroDataMapper;

    public HeroDataRepository(HeroDataStoreFactory heroDataStoreFactory, HeroDataMapper heroDataMapper) {
        this.heroDataStoreFactory = heroDataStoreFactory;
        this.heroDataMapper = heroDataMapper;
    }

    @Override
    public void loadPlaces(HeroCallback heroCallback) {

    }
}
