package com.amar.Filter_CriteriaPattern;

/**
 * Created with IntelliJ IDEA.
 * User: amarendra
 * Date: 25/09/14
 * Time: 12:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name,String gender,String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
}
