package com.projects.easyregx.models;

public enum RxOptions {
    NUMBERS("0-9"),
    LETTERS("a-zA-Z"),
    SYMBOLS("^~"),
    SPACE(" ");

    private String string;
    RxOptions(String s) {
        this.string = s;
    }

    public String getValue() {
        return string;
    }
}
