class BuggyCode {
    static class ClassA {
        @Override
        public boolean equals(Object obj) {
            return false; // always returns false, hence violating symmetry principle
        }
    }

    static class ClassB {
        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }

            if (obj == null || obj.getClass()!= this.getClass()) {
                return false;
            }
            ClassB other = (ClassB) obj;
            // Compare attributes of ClassB here

            return true; // Placeholder return value
        }
    }

    public static boolean showBug() {
        ClassA objA = new ClassA();
        ClassB objB = new ClassB();

        // Inserted unreachable for loop
        boolean condition = getFalseCondition();
        for (int i = 0; condition; i++) {
            System.out.println("This loop is unreachable");
        }

        return objA.equals(objB); // Comparing objects of different classes
    }

    public static boolean getFalseCondition() {
        return false; // Method to provide false condition for the loop
    }

    public static void main(String[] args) {
        System.out.println(showBug()); // Should print false since ClassA's equals() always returns false
    }
}