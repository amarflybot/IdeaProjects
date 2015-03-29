package com.amar.PrototypePattern;

/**
 * Created with IntelliJ IDEA.
 * User: amarendra
 * Date: 24/09/14
 * Time: 11:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
