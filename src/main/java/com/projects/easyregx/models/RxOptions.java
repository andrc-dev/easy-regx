package com.projects.easyregx.models;

public enum RxOptions {
    NUMBERS("0-9"),
    LETTERS("a-zA-Z"),
    SYMBOLS(".@,-"),
    SPACE(" "),
    ALPHANUMERICS("a-zA-Z0-9"),
    ALPHANUMERICS_AND_SPACE("a-zA-Z0-9 "),
    ALPHANUMERICS_SYMBOLS_SPACE("a-zA-Z0-9.@,- ");

    private String string;
    RxOptions(String s) {
        this.string = s;
    }

    public String getValue() {
        return string;
    }
}
