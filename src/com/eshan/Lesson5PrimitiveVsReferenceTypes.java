package com.eshan;

import java.awt.*; //imported when i used point class
/*main diff between primitive and reference is that primitive data is stored in a location
and no more. Reference types are stored in a location but their address is also stored */
public class Lesson5PrimitiveVsReferenceTypes {

    public static void main(String[] args){
        byte a = 1; //primitive
        byte b = a; //primitive
        a = 2; //this does not update the y value because primitive vars are independent
        System.out.println(b);
        Point point1 = new Point(1, 1);
        Point point2 = point1; //reference types store the reference to the actual data
        point1.x = 2;//this updates point2 because reference types are'nt independent
        System.out.println(point2);
    }

}
