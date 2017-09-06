package com.jerey.keepgank.view;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.jerey.keepgank.R;

/**
 * @author Xiamin
 * @date 2017/9/6
 */
public class MyBottomItemDecoration extends RecyclerView.ItemDecoration {
    private int dividerHeight;


    public MyBottomItemDecoration(Context context) {
        dividerHeight = context.getResources().getDimensionPixelSize(R.dimen.space_normal);
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State
            state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.bottom = dividerHeight;
    }
}
