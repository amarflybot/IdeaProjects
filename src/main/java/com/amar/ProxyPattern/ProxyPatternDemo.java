package com.amar.ProxyPattern;

/**
 * Created with IntelliJ IDEA.
 * User: amarendra
 * Date: 25/09/14
 * Time: 12:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");
        //image will not be loaded from disk
        image.display();
    }
}
