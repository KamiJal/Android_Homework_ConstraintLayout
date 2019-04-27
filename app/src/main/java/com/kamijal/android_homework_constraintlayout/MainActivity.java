package com.kamijal.android_homework_constraintlayout;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.kamijal.android_homework_constraintlayout.fragments.BaseFragment;
import com.kamijal.android_homework_constraintlayout.fragments.LeadFragment;
import com.kamijal.android_homework_constraintlayout.util.ConstraintSlideManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private static ConstraintSlideManager slideManager;
    private BottomNavigationView bottomNav;
    private int currentFragment = 0;
    private List<BaseFragment> fragments = new ArrayList<>();

    public MainActivity() {
        slideManager = new ConstraintSlideManager();
    }

    public static ConstraintSlideManager getSlideManager() {
        return slideManager;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFragments();

        bottomNav = findViewById(R.id.main_bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(this);

        getSupportFragmentManager().beginTransaction().add(R.id.main_fragment_container, fragments.get(currentFragment)).commit();

        //slideManager.slide(fragments.get(0).getFragmentConstraintLayoutId(), fragments.get(0).getEndLayoutId());
//        slideManager.slide((ConstraintLayout) findViewById(R.id.main_constraint_layout), R.layout.activity_main);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        String name = null;
        switch (menuItem.getItemId()) {
            case R.id.menu_left: {

                if (currentFragment == 0)
                    break;

                name = "menu_left";
                currentFragment--;
            }
            break;
            case R.id.menu_right: {

                if (currentFragment == fragments.size() - 1)
                    break;

                name = "menu_right";
                currentFragment++;
            }
            break;
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_container, fragments.get(currentFragment)).addToBackStack(name).commit();
        return true;
    }

    private void initFragments(){
        fragments.add(new LeadFragment());
    }
}
