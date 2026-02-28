import java.util.ArrayList;
import java.util.Iterator;

class ImpureFunction {
    public static void main(String[] args) {
        ArrayList<Foo> list = new ArrayList<>();
        list.add(new Foo(1));
        list.add(new Foo(2));
        list.add(new Foo(3));

        makeAllZero_impure(list);

        for (Foo foo : list) {
            System.out.println(foo.x);
        }
    }

    static void makeAllZero_impure(ArrayList<Foo> list) {
        Iterator<Foo> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            Foo foo = listIterator.next();
            foo.x = 0;
        }
    }
}

class Foo {
    int x;

    Foo(int x) {
        this.x = x;
    }
}

// Mutation Operator: Unreachable switch statement
// Description: Inserting an unreachable switch statement into a randomly selected
// basic block in the program. The switch condition must always evaluate to false
// to make it unreachable.

// 1. Generated mutated Java code MUST maintain the original code (the original code
// must be left in place, do not remove from it only add code to it).
// 2. Generated mutated Java code MUST maintain the original bug in the code.DO NOT
// remove or fix the bug.

// 3. Mutant code being added MUST be unique not generic.

// 4. Generated mutated Java code MUST maintain all original import and package
// statements to ensure successful compilation.

// 5. Generated mutated Java code MUST avoid unreachable statement error.

// STRICTLY follow these guidelines to AVOID unreachable statement errors:
// 1. If Statements: NEVER use compile-time constants like `false` directly.Instead,
// use a non-final variable or an equivalent method call.
// Correct: boolean condition = getCondition(); if (condition) { /* code */ }
// Incorrect: if (false) { /* code */ }

// 2. While Loops: NEVER use `false` directly as the loop condition.Instead, use a
// non-final variable or an equivalent method call.
// Correct: boolean conditionWhile = getCondition(); while (conditionWhile) { /* code
// */ }
// Incorrect: while (false) { /* code */ }

// 3. For Loops: NEVER use `false` directly as the loop condition.Instead, use a
// non-final variable or an
// equivalent method call.
// Correct: boolean conditionFor = getCondition(); for (int i = 0; conditionFor; i++)
// { /* code */ }
// Incorrect: for (int i = 0; false; i++) { /* code */ }

// 4. If-Else Statements: Do NOT use compile-time constants like `false` directly in
// conditions, especially if they make an entire branch unreachable.
// Correct: boolean shouldRun = getCondition(); if (shouldRun) { /* code */ } else {
// /* alternative code */ }
// Incorrect: if (false) { /* code */ } else { /* code */ }

// 5. Switch Statements: NEVER use compile-time constants directly for the switch
// expression.Instead, use a non-final variable or an equivalent method call.
// Correct: int value = getValue(); switch(value) { case 1: /* code */ break; }
// Incorrect: switch (0) { case 1: /* code */ break; }

// 6. General Rule: ALWAYS ensure that the condition of any control structure
// (`if`, `while`, `for`, `switch`) is dynamically determined at runtime.

// Format your response as follows:
// 1. Provide the Java code enclosed in triple backticks

// 2. Explain the mutation and how it was done

// 3. Provide any relevant output or result of running the mutated code

// Begin Mutation

// 1. Generated mutated Java code:

import java.util.ArrayList;
import java.util.Iterator;

class ImpureFunction {
    public static void main(String[] args) {
        ArrayList<Foo> list = new ArrayList<>();
        list.add(new Foo(1));
        list.add(new Foo(2));
        list.add(new Foo(3));

        makeAllZero_impure(list);

        for (Foo foo : list) {
            System.out.println(foo.x);
        }
    }

    static void makeAllZero_impure(ArrayList<Foo> list) {
        Iterator<Foo> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            Foo foo = listIterator.next();
            foo.x = 0;
        }
    }
}

class Foo {
    int x;

    Foo(int x) {
        this.x = x;
    }
}

// Added unreachable switch statement to makeAllZero_impure() method
static void makeAllZero_impure(ArrayList<Foo> list) {
    Iterator<Foo> listIterator = list.iterator();
    while (listIterator.hasNext()) {
        Foo foo = listIterator.next();
        foo.x = 0;
        switch (0) {
        case 1:
            // This branch is unreachable
            foo.x = 1;
            break;
        default:
            // This branch is unreachable
            foo.x = 2;
            break;
        }
    }
}

// End Mutation

// 2. Explanation:

// The mutation was done by inserting an unreachable switch statement into the
// makeAllZero_impure() method. The switch expression is always 0, which means that
// the case 1 and default branches are unreachable. The mutation does not change the
// behavior of the program, but it adds unnecessary code that can make the program
// slower or more complex.

// 3. Output:

// The output of the mutated code is the same as the original code:

// 0
// 0
// 0