package com.amar.AbstractFactoryPattern;

import com.amar.FactoryPattern.Shape;

/**
 * Created with IntelliJ IDEA.
 * User: amarendra
 * Date: 24/09/14
 * Time: 11:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
