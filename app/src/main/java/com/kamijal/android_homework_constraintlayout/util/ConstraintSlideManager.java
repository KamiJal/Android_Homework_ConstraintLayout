package com.kamijal.android_homework_constraintlayout.util;

import android.content.Context;
import android.support.constraint.ConstraintLayout;

public class ConstraintSlideManager  {
    private long defaultTimeout = 2;

    public void setTimeout(long timeout) {
        this.defaultTimeout = timeout;
    }

    public void slide(Context context, ConstraintLayout target, int resultSetId) {
        ConstraintSlideTask task = new ConstraintSlideTask();
        task.setTimeout(defaultTimeout);
        task.cloneResultConstraintSet(context, resultSetId);
        task.execute(target);
    }
}
