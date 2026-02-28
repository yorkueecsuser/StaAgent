class DoubleCheckedLockingBug {
    Object baz = null;

    Object bar() {
        boolean unreachableCondition = false; // Mutant: Unreachable for loop

        if (baz == null) {
            // Mutant: Adding an unreachable for loop
            for (int i = 0; unreachableCondition; i++) {
                System.out.println("This line should never be executed");
            }

            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
            }
        }
        return baz;
    }

    public Object showBug() {
        return bar();
    }
}