package com.jikexueyuan.practiceintercepttouchevent;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;


/**
 * Created by admin on 2017/6/27.
 */

public class CustomConstraintLayout extends ConstraintLayout {

    public CustomConstraintLayout(Context context) {
        super(context);
    }

    public CustomConstraintLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean intercepted = false;
        //父类容器是否需要拦截事件
        boolean isNeed = true;
        switch (ev.getAction()){
            //父类容器必须返回false，否则将拦截此事件
            case MotionEvent.ACTION_DOWN:
                intercepted = false;
                break;
            case MotionEvent.ACTION_MOVE:
                if (isNeed){
                    intercepted = true;
                }else{
                    intercepted = false;
                }
                break;
            //父类容器必须返回false
            case MotionEvent.ACTION_UP:
                intercepted = false;
                break;
            default:
                break;
        }
        return intercepted;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                System.out.println("parent down");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("parent move");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("parent up");
                break;
            default:
                break;
        }
        return true;
    }
}
