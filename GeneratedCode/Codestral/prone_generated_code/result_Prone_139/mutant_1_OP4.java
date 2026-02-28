class ProtoBugDemo {
    public static class Bar {
        public static final int NAME_FIELD_NUMBER = 1;
        //... other implementation details...
    }

    public static class Foo {
        public static final int NAME_FIELD_NUMBER = 1;
        public int getBarNameFieldNumber() {
            return Bar.NAME_FIELD_NUMBER;
        }
        //... other implementation details...
    }

    private static boolean getUnreachableCondition() {
        return false; // This method always returns false, making the condition unreachable
    }

    public int showBug(Foo foo) {
        int barNameFieldNumber = foo.getBarNameFieldNumber();

        // Newly added unreachable if-else branch
        if (getUnreachableCondition()) { // Using a method call that returns false to make the condition unreachable
            System.out.println("This code is unreachable");
        } else {
            // Continue with the original code
        }

        return barNameFieldNumber;
    }
}