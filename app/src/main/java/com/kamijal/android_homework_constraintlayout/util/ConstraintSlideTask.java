package com.kamijal.android_homework_constraintlayout.util;

import android.content.Context;
import android.os.AsyncTask;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.transition.TransitionManager;

import java.util.concurrent.TimeUnit;

public class ConstraintSlideTask extends AsyncTask<ConstraintLayout, Void, ConstraintLayout> {

    private final ConstraintSet resultSet = new ConstraintSet();
    private long timeout;

    void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    void cloneResultConstraintSet(Context context, int constraintLayoutId){
        resultSet.clone(context, constraintLayoutId);
    }

    @Override
    protected void onPostExecute(ConstraintLayout target) {
        TransitionManager.beginDelayedTransition(target);
        resultSet.applyTo(target);
    }

    @Override
    protected ConstraintLayout doInBackground(ConstraintLayout... targets) {
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return targets[0];
    }
}
