package com.tw;

import java.util.Arrays;

public class StringCalculator {

    public int add(String string) {
        if (!string.contains(",") && !string.contains("\n")) {
            return string.isEmpty() ? 0 : Integer.parseInt(string);
        }

        String[] lines = string.split("[,\n]");

        return lines[0].contains("//") ?
                Arrays.stream(lines[1].split(lines[0].substring(2)))
                        .mapToInt(Integer::parseInt).sum() :
                Arrays.stream(lines).mapToInt(Integer::parseInt).sum();
    }
}
