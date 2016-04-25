package ervelasquez.com.cleanarquitecture.data.datasource.mapper;

import java.util.ArrayList;

import ervelasquez.com.cleanarquitecture.data.model.HeroEntity;
import ervelasquez.com.cleanarquitecture.data.model.HeroResponse;
import ervelasquez.com.cleanarquitecture.domain.model.Hero;

/**
 * Created by RONALD on 24/04/2016.
 */
public class HeroDataMapper {
    public Hero transform(HeroEntity heroEntity) {
        Hero hero = new Hero();
        if (heroEntity == null) {
            return hero;
        } else {
            //Todo Validar como viene del servicio los heroes
        }
        return hero;
    }

    public ArrayList<Hero> tranformList(HeroResponse heroResponse) {
        ArrayList<Hero> heroes = new ArrayList<>();
        if (heroResponse == null) {
            return heroes;
        } else {
            // Bucle for y luego transformar
        }
        return heroes;
    }
}
