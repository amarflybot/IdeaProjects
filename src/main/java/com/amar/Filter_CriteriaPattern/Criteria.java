package com.amar.Filter_CriteriaPattern;

/**
 * Created with IntelliJ IDEA.
 * User: amarendra
 * Date: 25/09/14
 * Time: 12:04 AM
 * To change this template use File | Settings | File Templates.
 */
import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
