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
            // This method is symmetric since it's comparing objects of the same class
            // Therefore, it's safe to call from other classes
            if (obj == this) {
                return true;
            }

            if (obj == null || obj.getClass()!= this.getClass()) {
                return false;
            }

            // Assuming ClassB has some attributes to compare
            ClassB other = (ClassB) obj;
            // Compare attributes of ClassB here

            return true; // Placeholder return value
        }
    }

    public static boolean showBug() {
        ClassA objA = new ClassA();
        ClassB objB = new ClassB();
        // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
        return objA.equals(objB); // Comparing objects of different classes
    }

    public static void main(String[] args) {
        System.out.println(showBug()); // Should print false since ClassA's equals() always returns false
    }
}