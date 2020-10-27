package com.pd.com;

import com.pd.function.Paint;

import java.awt.*;

/**
 * @Classname Tank
 * @Description TODO
 * @Date 2020-10-27 19:57
 * @Created by houhoudadi
 */
public class Tank implements Paint {

    private static final int WIDTH = 20;
    private static final int HEIGHT = 20;
    public static final int SPEED = 2;
    private int x;
    private int y;
    private int width;
    private int height;
    private Dir dir = Dir.UP;

    public Tank() {
        this(200,200,WIDTH,HEIGHT);
    }

    public Tank(int x, int y) {
        this(x,y,WIDTH,HEIGHT);
    }

    public Tank(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(x,y,20,20);
        switch (dir){
            case UP:
                y -=SPEED;break;
            case DOWN :
                y +=SPEED;break;
            case LEFT:
                x -=SPEED;break;
            case RIGHT :
                x +=SPEED;break;
            default:
                break;
        }
    }
}
