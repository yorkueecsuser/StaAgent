class CovariantArrayExample {

    public void showBug(Object[] array, Integer value) {
        // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        array[0] = value; // This line stores an Integer into an Object array, which is technically correct but demonstrates the potential issue

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case");
                break;
            case 1:
                // This case is always executed
                System.out.println("This is the reachable case");
                break;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the first case in the switch unreachable
        return false;
    }

    public static void main(String[] args) {
        CovariantArrayExample example = new CovariantArrayExample();
        String[] stringArray = {"Hello"};
        try {
            example.showBug(stringArray, 123); // This will cause ArrayStoreException at runtime
        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException: " + e.getMessage());
        }
    }
}