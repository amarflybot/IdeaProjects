package com.amar.InterpreterPattern;

/**
 * Created with IntelliJ IDEA.
 * User: amarendra
 * Date: 25/09/14
 * Time: 12:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class OrExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
