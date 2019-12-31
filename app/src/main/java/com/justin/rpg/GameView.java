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
    float posX=400;
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
    public void moveLeft(){
        if (posX>50)
            posX-=50;
            invalidate();
    }
    public void moveRight(){
        if (posX<1200)
            posX+=50;
            invalidate();
    }
    public void setPosY(float posY) {
        if (posY>0&&posY<1500){
            this.posY=posY;
        }
    }

    public void setPosX(float posX) {
        if (posX>0&&posX<1200) {
            this.posX = posX;
        }
    }
}
