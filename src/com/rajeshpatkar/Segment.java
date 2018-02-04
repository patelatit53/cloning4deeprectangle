package com.rajeshpatkar;

class Segment implements Cloneable {

    private Point p1;
    private Point p2;

    public Segment() {
    }

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(int x, int y) {
        this.p1.setX(x);
        this.p1.setY(y);
    }

    public void setP2(int x, int y) {
        this.p2.setX(x);
        this.p2.setY(y);
    }

    public Point getP2() {
        return p2;
    }

    @Override
    public String toString() {
        return "Segment{" + "p1=" + p1 + ", p2=" + p2 + '}';
    }

    @Override
    public Segment clone() throws CloneNotSupportedException {
        Segment s = (Segment)super.clone();
        s.p1 = this.p1.clone();
        s.p2 = this.p2.clone();
        return s;
    }
}

