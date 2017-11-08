package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //  练习内容：使用 canvas.drawPath() 方法画心形

        Paint paint = new Paint();
        Path path = new Path();
        paint.setAntiAlias(true);
        path.addArc(200, 100, 500, 400, 135, 225);
        path.arcTo(500, 100, 800, 400, -180, 225, false);
        path.lineTo(500, 600);

        canvas.drawPath(path, paint);
    }
}
