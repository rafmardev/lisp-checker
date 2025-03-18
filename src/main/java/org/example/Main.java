package org.example;

import org.example.checker.LispChecker;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test 1: " + LispChecker.isParenthesisClosed("()"));
        System.out.println("Test 2: " + LispChecker.isParenthesisClosed("(()))"));
        System.out.println("Test 3: " + LispChecker.isParenthesisClosed("((()))"));
        System.out.println("Test 4: " + LispChecker.isParenthesisClosed("(a + b)"));
        System.out.println("Test 5: " + LispChecker.isParenthesisClosed("(1 + (2 * 3))"));
        System.out.println("Test 6: " + LispChecker.isParenthesisClosed("((a + b) * (c + d))"));
        System.out.println("Test 7: " + LispChecker.isParenthesisClosed("(("));
        System.out.println("Test 8: " + LispChecker.isParenthesisClosed("))"));
        System.out.println("Test 9: " + LispChecker.isParenthesisClosed("(a) + (b)"));
        System.out.println("Test 10: " + LispChecker.isParenthesisClosed("(((((a)))))"));
    }
}