package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 综合练习
        // 练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint = new Paint();
        paint.setAntiAlias(true);

        paint.setColor(Color.parseColor("#ff9800"));
        canvas.drawArc(200, 100, 700, 600, -60, 60, true, paint);

        paint.setColor(Color.parseColor("#0d5302"));
        canvas.drawArc(200, 100, 700, 600, 1, 3, true, paint);

        paint.setColor(Color.parseColor("#673ab7"));
        canvas.drawArc(200, 100, 700, 600, 5, 5, true, paint);

        paint.setColor(Color.parseColor("#9e9e9e"));
        canvas.drawArc(200, 100, 700, 600, 11, 5, true, paint);

        paint.setColor(Color.parseColor("#009688"));
        canvas.drawArc(200, 100, 700, 600, 17, 58, true, paint);

        paint.setColor(Color.parseColor("#03a9f4"));
        canvas.drawArc(200, 100, 700, 600, 76, 103, true, paint);

        paint.setColor(Color.parseColor("#e84e40"));
        canvas.drawArc(185, 85, 685, 585, -180, 119, true, paint);

        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(3);
        paint.setTextSize(25);

        canvas.drawLines(new float[]{150, 100, 270, 100, 270, 100, 290, 130}, paint);
        canvas.drawText("Lolipop", 60, 100, paint);

        canvas.drawLines(new float[]{680, 255, 700, 240, 700, 240, 780, 240}, paint);
        canvas.drawText("Marshmallow", 790, 240, paint);

        canvas.drawLine(700, 360, 780, 360, paint);
        canvas.drawText("Froyo", 790, 360, paint);

        canvas.drawLines(new float[]{698, 382, 725, 382, 725, 382, 750, 400, 750, 400, 780, 400}, paint);
        canvas.drawText("Gingerbread", 790, 400, paint);

        canvas.drawLines(new float[]{693, 410, 725, 410, 725, 410, 750, 430, 750, 430, 780, 430}, paint);
        canvas.drawText("Ice Cream Sandwich", 790, 435, paint);

        canvas.drawLines(new float[]{632, 522, 660, 545, 660, 545, 780, 545}, paint);
        canvas.drawText("Jelly Bean", 790, 545, paint);

        canvas.drawLines(new float[]{160, 560, 260, 560, 260, 560, 283, 538}, paint);
        canvas.drawText("KitKat", 80, 560, paint);

    }
}
