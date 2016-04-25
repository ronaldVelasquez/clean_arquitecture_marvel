package ervelasquez.com.cleanarquitecture.data.datasource;

import ervelasquez.com.cleanarquitecture.domain.repository.RepositoryHeroCallback;

/**
 * Created by RONALD on 24/04/2016.
 */
public interface HeroDataStore {
    void loadHeroes(RepositoryHeroCallback repositoryHeroCallback);
}
