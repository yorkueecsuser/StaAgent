class BuggyConditionalStructure {
    private void doSomething() {
        System.out.println("Doing something...");
    }

    private void doOneMoreThing() {
        System.out.println("Doing one more thing...");
    }

    public void showBug(int a, int i) {
        // Bug: All branches in a conditional structure should not have exactly the same implementation
        if (a > 12) {  // Noncompliant
            doOneMoreThing();
        } else {
            doOneMoreThing();
        }

        int b = a > 12? 4 : 4;  // Noncompliant

        switch (i) {  // Noncompliant
            case 1:
            case 2:
            case 3:
                doSomething();
                break;
            default:
                doSomething();
        }
    }
}