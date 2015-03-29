package com.amar.FlyweightPattern;

/**
 * Created with IntelliJ IDEA.
 * User: amarendra
 * Date: 25/09/14
 * Time: 12:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class FlyweightPatternDemo {
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Circle circle =
                    (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
