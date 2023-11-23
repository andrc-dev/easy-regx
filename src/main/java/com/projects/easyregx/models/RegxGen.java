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

    public String createRegex(String rxType) {
        String expression;
        switch (rxType) {
            case "all":
                expression = createRegex(RxOptions.ALPHANUMERICS_SYMBOLS_SPACE);
                break;
            case "alphanum+space":
                expression = createRegex(RxOptions.ALPHANUMERICS_AND_SPACE);
                break;
            case "alphanum":
                expression = createRegex(RxOptions.ALPHANUMERICS);
                break;
            case "num":
                expression = createRegex(RxOptions.NUMBERS);
                break;
            case "letters":
                expression = createRegex(RxOptions.LETTERS);
                break;
            case "symbols":
                expression = createRegex(RxOptions.SYMBOLS);
                break;
            case "space":
                expression = createRegex(RxOptions.SPACE);
                break;
            default:
                return "Select at least one option.";
        }
        return expression;
    }
}
