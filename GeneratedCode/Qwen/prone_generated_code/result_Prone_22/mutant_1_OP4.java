class ComparingThisWithNullExample {

    public boolean showBug() {
        // BUG: ComparingThisWithNull
        return this == null; // This line contains the bug

        // Unreachable if-else statement mutation
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code in showBug()");
        } else {
            // Some other unreachable code
            System.out.println("This is also unreachable code in showBug()");
        }
    }

    public boolean showBug2() {
        // BUG: ComparingThisWithNull
        return this!= null; // This line also contains the bug

        // Unreachable if-else statement mutation
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code in showBug2()");
        } else {
            // Some other unreachable code
            System.out.println("This is also unreachable code in showBug2()");
        }
    }

    private boolean getCondition() {
        // This method returns a condition that is always false at runtime
        return false;
    }

    public static void main(String[] args) {
        ComparingThisWithNullExample example = new ComparingThisWithNullExample();
        System.out.println("showBug() result: " + example.showBug());
        System.out.println("showBug2() result: " + example.showBug2());
    }
}