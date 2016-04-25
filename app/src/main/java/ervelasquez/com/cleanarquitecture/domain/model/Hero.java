package ervelasquez.com.cleanarquitecture.domain.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by RONALD on 24/04/2016.
 */
public class Hero implements Parcelable {
    private int id;
    private String realName;
    private String heroName;
    private String photo;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.realName);
        dest.writeString(this.heroName);
        dest.writeString(this.photo);
        dest.writeString(this.description);
    }

    public Hero() {
    }

    protected Hero(Parcel in) {
        this.id = in.readInt();
        this.realName = in.readString();
        this.heroName = in.readString();
        this.photo = in.readString();
        this.description = in.readString();
    }

    public static final Parcelable.Creator<Hero> CREATOR = new Parcelable.Creator<Hero>() {
        @Override
        public Hero createFromParcel(Parcel source) {
            return new Hero(source);
        }

        @Override
        public Hero[] newArray(int size) {
            return new Hero[size];
        }
    };
}
