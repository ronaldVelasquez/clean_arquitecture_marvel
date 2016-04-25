package ervelasquez.com.cleanarquitecture.data.datasource.database;

import ervelasquez.com.cleanarquitecture.data.datasource.HeroDataStore;
import ervelasquez.com.cleanarquitecture.domain.repository.RepositoryHeroCallback;

/**
 * Created by RONALD on 24/04/2016.
 */
public class DatabaseHeroDataStore implements HeroDataStore {
    @Override
    public void loadHeroes(RepositoryHeroCallback repositoryHeroCallback) {
        //TODO usar base de datos
    }
}
