class BadEqual {
    @Override
    public boolean equals(Object obj) { // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        return false;
    }

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }
}

// Mutation Operator: Unreachable if statement
// Mutation Operator description: Inserting unreachable if branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.

class BadEqualWithMutation {
    @Override
    public boolean equals(Object obj) { // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
        return false;
    }

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }

    public void unreachableIf() {
        int x = 1;
        if (x == 0) {
            System.out.println("This branch is unreachable");
        }
    }
}