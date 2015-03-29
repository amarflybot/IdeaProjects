package com.amar.DecoratorPattern;

/**
 * Created with IntelliJ IDEA.
 * User: amarendra
 * Date: 25/09/14
 * Time: 12:11 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
