package com.justin.rpg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View {
    float posY;
    float posX;
    private int iconWeight;
    private int iconHeight;

    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint =new Paint();
        canvas.drawLine(500,0,0,600,paint);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.dog);
        iconWeight = bitmap.getWidth();
        iconHeight = bitmap.getHeight();
        canvas.drawBitmap(bitmap,posX,posY,paint);
        Log.d("weight: ","weight"+iconWeight);
    }

    public float getPosY() {
        return posY;
    }

    public float getPosX() {
        return posX;
    }

    public void setPosY(float posY) {
        if (posY>0&&posY<iconHeight-100){
            this.posY=posY;
        }
    }

    public void setPosX(float posX) {
        if (posX>0&&posX<1200) {
            this.posX = posX;
        }
    }
}
