package com.job.staticfactory;

public class PersonFactory {
    public static Person getPerson(String arg) {
        if (arg.equalsIgnoreCase("chinese")) {
            return new Chinese();
        } else {
            return new American();
        }
    }
}
