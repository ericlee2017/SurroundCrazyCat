package com.czy.surroundcrazycat.View;

public class Point {

    private int x, y;

    public  enum STATUS {STATUS_OFF, STATUS_IN, STATUS_ON}

    private STATUS status;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
