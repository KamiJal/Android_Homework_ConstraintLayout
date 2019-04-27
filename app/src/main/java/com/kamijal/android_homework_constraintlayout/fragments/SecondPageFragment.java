package com.kamijal.android_homework_constraintlayout.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kamijal.android_homework_constraintlayout.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondPageFragment extends Fragment {


    public SecondPageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_page, container, false);
    }

}
