public Object showBug(Blah foo) {
    switch (foo.getBlahCase()) {
        case FOO:
            return foo.getFoo();
        case BAR:
            return foo.getFoo(); // BUG: WrongOneof, should be foo.getBar()
    }

    // Mutant Code: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
        System.out.println("This is an unreachable loop");
    }

    return null;
}

// Method to return a condition for the unreachable loop
private boolean getCondition() {
    return false;
}