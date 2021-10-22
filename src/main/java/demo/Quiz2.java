package demo;

import java.util.ArrayList;
import java.util.List;

// Java Async/Sync/threading related:
// 1) What's the printed result
// 2) "add" method signature, how to make it async?
// 3) Refactor the code to get the result faster
public class Quiz2 {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        long start = System.currentTimeMillis();

        List<Long> results = new ArrayList<>();
        results.add(cal.add(1, 2));
        results.add(cal.add(2, 4));

        System.out.println(results.stream().reduce(Long::sum).get());
        System.out.println("took " + (System.currentTimeMillis() - start) + " ms.");
    }
}

class Calculator {
    long add(long op1, long op2) {
        // Simulate a long running operation
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return op1 + op2;
    }
}

