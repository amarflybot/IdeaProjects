package com.amar.AbstractFactoryPattern;

/**
 * Created with IntelliJ IDEA.
 * User: amarendra
 * Date: 24/09/14
 * Time: 11:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
