package com.kamijal.android_homework_constraintlayout.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.kamijal.android_homework_constraintlayout.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstPageFragment extends BaseFragment {

    public FirstPageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if(getActivity() == null)
            return;

        ConstraintLayout leadLayout = getActivity().findViewById(R.id.first_page_constraint_layout);
        ImageView leadImage = getActivity().findViewById(R.id.first_page_image);
        leadImage.setImageResource(R.drawable.lead_image);

        setSlideManagerData(leadLayout, R.layout.fragment_first_page_end);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_page_start, container, false);
    }

}
