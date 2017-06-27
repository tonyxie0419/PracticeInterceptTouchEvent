package com.jikexueyuan.practiceintercepttouchevent;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by admin on 2017/6/27.
 */

public class CustomView extends View {


    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                System.out.println("down");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("move");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("up");
                break;
            default:
                break;
        }
        return true;
    }
}
