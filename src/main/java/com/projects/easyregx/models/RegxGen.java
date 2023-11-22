package com.projects.easyregx.models;

public class RegxGen {

    private static RegxGen INSTANCE;

    private RegxGen() {
        System.out.println("RegxGen instantiated.");
    }

    public static RegxGen getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RegxGen();
        }
        return INSTANCE;
    }

    public String createRegex(RxOptions rxOptions) {
        return "/^[" + rxOptions.getValue() + "]*$/";
    }
}
