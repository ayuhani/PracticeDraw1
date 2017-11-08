package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 综合练习
        // 练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        paint.setColor(Color.WHITE);
        canvas.drawLines(new float[]{150, 80, 150, 500, 150, 500, 950, 500}, paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        canvas.drawRect(180, 495, 260, 500, paint);
        canvas.drawRect(280, 485, 360, 500, paint);
        canvas.drawRect(380, 485, 460, 500, paint);
        canvas.drawRect(480, 300, 560, 500, paint);
        canvas.drawRect(580, 150, 660, 500, paint);
        canvas.drawRect(680, 100, 760, 500, paint);
        canvas.drawRect(780, 350, 860, 500, paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(26);
        canvas.drawText("Froyo", 190, 525, paint);
        canvas.drawText("GB", 308, 525, paint);
        canvas.drawText("ICS", 405, 525, paint);
        canvas.drawText("JB", 505, 525, paint);
        canvas.drawText("KitKat", 585, 525, paint);
        canvas.drawText("L", 710, 525, paint);
        canvas.drawText("M", 810, 525, paint);

        paint.setTextSize(45);
        canvas.drawText("直方图", 490, 650, paint);
    }
}
