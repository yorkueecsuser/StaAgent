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

            return true; // Placeholder return value
        }
    }

    public static boolean showBug() {
        ClassA objA = new ClassA();
        ClassB objB = new ClassB();

        // Added a do-while loop that iterates over a range of numbers
        int i = 0;
        do {
            i++;
        } while (i < 5);

        // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
        return objA.equals(objB); // Comparing objects of different classes
    }

    public static void main(String[] args) {
        System.out.println(showBug()); // Should print false since ClassA's equals() always returns false
    }
}