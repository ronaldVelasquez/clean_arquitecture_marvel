package ervelasquez.com.cleanarquitecture.data.datasource;

import android.content.Context;

import ervelasquez.com.cleanarquitecture.data.datasource.database.DatabaseHeroDataStore;
import ervelasquez.com.cleanarquitecture.data.datasource.preference.PreferenceHeroDataStore;
import ervelasquez.com.cleanarquitecture.data.datasource.rest.RestHeroDataStore;

/**
 * Created by RONALD on 24/04/2016.
 */
public class HeroDataStoreFactory {
    public static final int DATABASE = 0;
    public static final int SERVICE_HTTP = 1;
    public static final int PREFERENCES = 2;

    private final Context context;

    public HeroDataStoreFactory(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Contexto del DataStore no inicializado");
        }
        this.context = context.getApplicationContext();
    }

    public HeroDataStore create(int dataSource) {
        HeroDataStore heroDataStore = null;
        switch (dataSource) {
            case DATABASE:
                heroDataStore = new DatabaseHeroDataStore();
                break;
            case SERVICE_HTTP:
                heroDataStore = createServiceDataStore();
                break;
            case PREFERENCES:
                heroDataStore = new PreferenceHeroDataStore(context);
                break;
        }
        return heroDataStore;
    }

    public HeroDataStore createServiceDataStore() {
        return new RestHeroDataStore();
    }

}
