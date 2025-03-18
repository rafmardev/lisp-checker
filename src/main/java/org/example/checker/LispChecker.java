package org.example.checker;

public class LispChecker {
    public static boolean isParenthesisClosed (String code) {
        int count = 0;
        for(char c : code.toCharArray()) {
            if (c == '(') {
                count ++;
            } else if (c == ')') {
                count --;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }
}
