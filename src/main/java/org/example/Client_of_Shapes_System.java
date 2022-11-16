package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Client_of_Shapes_System {

    public static void main( String[] args )
    {
        System.out.println( "Client access to Shape system using IShape interface." );
        Client_of_Shapes_System client = new Client_of_Shapes_System();
        client.start();
    }

    public void start() {
        // "program to the IShape interface"
        // Do not create any dependencies on the concrete classes in Shape system.
        // That means, don't use reference types like Circle or Rectangle, instead,
        // use reference of type IShape.
        // Changes to the implementation of Circle do not affect this code as
        // long as the Interface 'contract' is maintained.

        IShape shape1 = new Circle(10,20,25);

        System.out.println("shape1.toString() : " + shape1.toString());
        System.out.println("shape1 is of type :" + shape1.getClass().toString() );
        System.out.println("Area of shape1 = " + shape1.area());
        System.out.println("Calling shape1.draw() ....");
        shape1.draw();;
        System.out.println("Moving shape1.moveTo(22,33)");
        shape1.moveTo(22,33);
        System.out.println("shape1 new location is: ");
        System.out.println("shape1.toString() : " + shape1.toString());

        // Can create ArrayList of ISHape objects to store shapes also.
        ArrayList<IShape> list = new ArrayList<>();
        list.add( new Circle(44,55,6));
        //list.add( new Rectangle(22,44,50,60));  // Rectangle eto be implemented

    }
}
