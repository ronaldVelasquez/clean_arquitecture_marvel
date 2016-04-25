package ervelasquez.com.cleanarquitecture.presentation.presenter;

/**
 * Created by RONALD on 24/04/2016.
 */
public interface Presenter<T> {
    void addView(T view);
    void removeView(T view);
}
