package com.hertogsem.flappybird;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;

public class Player implements GameObject {

    private Rect rectangle;
    private int color;
    private Paint p;


    public Player(Rect rectangle, Paint p) {
        this.rectangle = rectangle;
        this.color = color;
        this.p = p;
    }

    @Override
    public void update(long time, int width, int height) {

    }

    /**
     * Updates the point the player will be drawn at.
     * @param point
     * Point is the middle of the player.
     */
    public void update(Point point) {


        rectangle.set(point.x - rectangle.width()/2, point.y - rectangle.height() / 2, point.x + rectangle.width()/2, point.y + rectangle.height() / 2);
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        paint.setColor(Color.BLUE);
        canvas.drawRect(rectangle, paint);
    }

    public Rect getRectangle() {
        return rectangle;
    }
}
