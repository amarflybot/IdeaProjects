package com.amar.ProxyPattern;

/**
 * Created with IntelliJ IDEA.
 * User: amarendra
 * Date: 25/09/14
 * Time: 12:21 AM
 * To change this template use File | Settings | File Templates.
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
