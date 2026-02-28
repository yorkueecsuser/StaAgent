class BuggyCode {
    static class ClassA {
        @Override
        public boolean equals(Object obj) {
            return false;
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
            return true;
        }
    }

    public static boolean showBug() {
        ClassA objA = new ClassA();
        ClassB objB = new ClassB();

        // Inserted unreachable if statement
        if (getUnreachableCondition()) {
            // This block of code is unreachable
            System.out.println("This line will never be executed");
        }

        return objA.equals(objB);
    }

    // Method to return a dynamically determined condition
    private static boolean getUnreachableCondition() {
        return false; // Always return false to make the condition unreachable
    }

    public static void main(String[] args) {
        System.out.println(showBug()); // Should print false since ClassA's equals() always returns false
    }
}