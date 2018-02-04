package com.rajeshpatkar;

class Rectangle implements Cloneable
{
    Segment s1 ;
    Segment s2 ;
    Segment s3 ;
    Segment s4 ;

    public Rectangle(Segment s1, Segment s2, Segment s3, Segment s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    public Rectangle() {
    }

    public Segment getS1() {
        return s1;
    }

    public void setS1(int x1 , int y1 , int x2 , int y2) {
        this.s1.setP1(x1, y1);
        this.s1.setP2(x2, y2);
    }


    public Segment getS2() {
        return s2;
    }

    public void setS2(int x1 , int y1 , int x2 , int y2) {
        this.s2.setP1(x1, y1);
        this.s2.setP2(x2, y2);
    }

    public Segment getS3() {
        return s3;
    }

    public void setS3(int x1 , int y1 , int x2 , int y2) {
        this.s3.setP1(x1, y1);
        this.s3.setP2(x2, y2);
    }

    public Segment getS4() {
        return s4;
    }
    
    public void setS4(int x1 , int y1 , int x2 , int y2) {
        this.s4.setP1(x1, y1);
        this.s4.setP2(x2, y2);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + ", s4=" + s4 + '}';
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
         Rectangle rect = (Rectangle)super.clone();
         rect.s1 = this.s1.clone();
         rect.s2 = this.s2.clone();
         rect.s3 = this.s3.clone();
         rect.s4 = this.s4.clone();
         return rect;
    }
    
}