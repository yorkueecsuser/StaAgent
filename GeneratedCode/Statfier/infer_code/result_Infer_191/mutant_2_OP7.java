@interface ForNonUiThread {
    boolean getCondition() {
        return false;
    }

    void someMethod() {
        // Example method to demonstrate insertion of unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable loop");
        }
    }
}