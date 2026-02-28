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
            return true; // Placeholder return value
        }
    }

    public static boolean showBug() {
        ClassA objA = new ClassA();
        ClassB objB = new ClassB();

        // Added unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This loop is unreachable as the condition is always false
            System.out.println("Unreachable code");
        }

        return objA.equals(objB); // Comparing objects of different classes
    }

    public static void main(String[] args) {
        System.out.println(showBug()); // Should print false since ClassA's equals() always returns false
    }
}