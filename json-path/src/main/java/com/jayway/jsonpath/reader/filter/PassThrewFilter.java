package com.jayway.jsonpath.reader.filter;

/**
 * Created by IntelliJ IDEA.
 * User: kallestenflo
 * Date: 11/4/11
 * Time: 10:15 PM
 */
public class PassThrewFilter extends Filter {

    public PassThrewFilter(String condition) {
        super(condition);
    }

    public Object filter(Object obj) {
        return obj;
    }
}
