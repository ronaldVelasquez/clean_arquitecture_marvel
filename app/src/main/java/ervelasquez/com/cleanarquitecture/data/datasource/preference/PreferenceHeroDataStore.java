package ervelasquez.com.cleanarquitecture.data.datasource.preference;

import android.content.Context;

import ervelasquez.com.cleanarquitecture.data.datasource.HeroDataStore;
import ervelasquez.com.cleanarquitecture.domain.repository.RepositoryHeroCallback;

/**
 * Created by RONALD on 24/04/2016.
 */
public class PreferenceHeroDataStore implements HeroDataStore{
    private Context context;

    public PreferenceHeroDataStore(Context context) {
        this.context = context;
    }

    @Override
    public void loadHeroes(RepositoryHeroCallback repositoryHeroCallback) {

    }
}
