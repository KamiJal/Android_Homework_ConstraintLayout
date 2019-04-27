package com.kamijal.android_homework_constraintlayout.fragments;

import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;

import com.kamijal.android_homework_constraintlayout.MainActivity;

public abstract class BaseFragment extends Fragment {

    protected void setSlideManagerData(ConstraintLayout constraintLayout, int endLayoutId) {
        MainActivity.getSlideManager().slide(getContext(), constraintLayout, endLayoutId);
    }
}
