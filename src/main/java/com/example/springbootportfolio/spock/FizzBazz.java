package com.example.springbootportfolio.spock;

public class FizzBazz {
    public String calc(int x) {
        if (x % 15 == 0) return "Fizz Buzz";
        if (x % 3 == 0) return "Fizz";
        if (x % 5 == 0) return "Buzz";
        return String.valueOf(x);
    }
}
