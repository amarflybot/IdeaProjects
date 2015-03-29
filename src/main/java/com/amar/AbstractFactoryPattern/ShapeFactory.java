package com.amar.AbstractFactoryPattern;

/**
 * Created with IntelliJ IDEA.
 * User: amarendra
 * Date: 24/09/14
 * Time: 11:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return (Shape) new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return (Shape) new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return (Shape) new Square();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}

