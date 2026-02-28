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

// Mutant Code: Duplicate a randomly selected assignment statement
class CallSuperLastExampleMutant {

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

        // Duplicate assignment statement (example of a mutation)
        CallSuperLastExampleMutant mutantExample = new CallSuperLastExampleMutant();
        CallSuperLastExampleMutant mutantExampleDuplicate = mutantExample; // Duplicated assignment
        System.out.println(mutantExample.showBug());
    }
}