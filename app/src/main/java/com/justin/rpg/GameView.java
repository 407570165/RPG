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
    Monkey monkey;
    float posY;
    float posX=400;
    private int iconWeight;
    private int iconHeight;
    Bitmap bitmap;
    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (monkey==null){
            monkey=new Monkey(this);
            bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.dog);
        }
        super.onDraw(canvas);
        Paint paint =new Paint();
        canvas.drawLine(500,0,0,600,paint);
        iconWeight = bitmap.getWidth();
        iconHeight = bitmap.getHeight();
        canvas.drawBitmap(bitmap,monkey.getX(),monkey.getY(),paint);
        Log.d("weight: ","weight"+iconWeight);
    }

    public float getPosY() {
        return posY;
    }

    public float getPosX() {
        return posX;
    }
    public void moveLeft(){
        if (monkey.getX()>0)
            monkey.setDirection(Monkey.DIRECTION_LEFT);
    }
    public void moveRight(){
        if (monkey.getX()<getWidth()-50)
            monkey.setDirection(Monkey.DIRECTION_RIGHT);

    }
    public void moveUp(){
        if (monkey.getY()>0){
            monkey.setDirection(Monkey.DIRECTION_UP);
        }
    }
    public void moveDown(){
        if (monkey.getY()<getHeight()-100)
            monkey.setDirection(Monkey.DIRECTION_DOWN);
    }
   /* public void setPosY(float posY) {
        if (posY>0&&posY<1500){
            this.posY=posY;
            invalidate();
        }
    }
    public void setPosX(float posX) {
        if (posX>0&&posX<1200) {
            this.posX = posX;
            invalidate();
        }
    }*/
}
