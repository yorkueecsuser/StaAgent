class BadEqual {
    @Override
    public boolean equals(Object obj) {
        return false;
    }

    public void showBug() {
        System.out.println("Bug: equal(Object) method is not overriding the equals(Object) method.");
    }

    public void unreachableIfElse(boolean condition) {
        if (condition) {
            // code
        } else {
            // unreachable code
        }
    }
}