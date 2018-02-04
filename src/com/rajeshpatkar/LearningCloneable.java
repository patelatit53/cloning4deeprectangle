package com.rajeshpatkar;

public class LearningCloneable {

    public static void main(String[] args) throws Exception {

        Point pt1 = new Point(5, 5);
        Point pt2 = new Point(10, 5);
        Point pt3 = new Point(5, 10);
        Point pt4 = new Point(10, 10);

        Segment seg1 = new Segment(pt1, pt2);
        Segment seg2 = new Segment(pt2, pt3);
        Segment seg3 = new Segment(pt3, pt4);
        Segment seg4 = new Segment(pt4, pt1);

        Rectangle rect = new Rectangle(seg1, seg2, seg3, seg4);

        Rectangle clonedRect = rect.clone();

        System.out.println("printing the original and cloned"
                + " rectangle objects before modifying\n\n");

        System.out.println("ORG : " + rect);
        System.out.println("CLONED : " + clonedRect);

        System.out.println("\n\nmodifying the cloned Segment... \n\n");

        clonedRect.setS1(23, 45, 12, 56);

        System.out.println("printing the original and cloned segment objects after modification \n\n");
        System.out.println("ORG : " + rect);
        System.out.println("CLONED : " + clonedRect);

    }

}


