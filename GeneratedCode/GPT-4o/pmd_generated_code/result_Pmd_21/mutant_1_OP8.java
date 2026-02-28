class CallSuperLastExample {

    // Demonstrates the CallSuperLast bug
    public void onPause() {
        System.out.println("Doing some important operations before pause.");
        foo();
        superPause(); // BUG: CallSuperLast
    }

    private void foo() {
        System.out.println("foo method execution.");
    }

    // Simulating a super call
    private void superPause() {
        System.out.println("Super onPause called.");
    }

    public String showBug() {
        onPause();
        return "Bug demonstrated: super method called last instead of first.";
    }

    public static void main(String[] args) {
        CallSuperLastExample example = new CallSuperLastExample();
        System.out.println(example.showBug());
    }
}

// Mutant code begins here
class CallSuperLastExampleMutant {

    // Demonstrates the CallSuperLast bug with a renamed variable
    public void onPause() {
        System.out.println("Doing some important operations before pause.");
        bar();
        superPause(); // BUG: CallSuperLast
    }

    private void bar() {
        System.out.println("bar method execution.");
    }

    // Simulating a super call
    private void superPause() {
        System.out.println("Super onPause called.");
    }

    public String showBug() {
        onPause();
        return "Bug demonstrated: super method called last instead of first.";
    }

    public static void main(String[] args) {
        CallSuperLastExampleMutant example = new CallSuperLastExampleMutant();
        System.out.println(example.showBug());
    }
}
// Mutant code ends here