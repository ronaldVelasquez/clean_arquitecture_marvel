package ervelasquez.com.cleanarquitecture.presentation.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import butterknife.Bind;
import ervelasquez.com.cleanarquitecture.R;
import ervelasquez.com.cleanarquitecture.domain.model.Hero;
import ervelasquez.com.cleanarquitecture.presentation.presenter.HeroPresenter;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.rl_main)
    View rlMain;

    @Bind(R.id.fl_progress)
    View flProgress;

    @Bind(R.id.rv_list_heroes)
    RecyclerView rvListHeroes;

    private HeroPresenter heroPresenter;
//    private HeroAdapter heroAdapter;
    private ArrayList<Hero> heroes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
