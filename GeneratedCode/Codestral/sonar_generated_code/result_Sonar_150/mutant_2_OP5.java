class MyClass {
    private String value;

    public MyClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyClass) {
            MyClass that = (MyClass) obj;
            boolean unreachableCondition = getUnreachableCondition(); // Added a method call to dynamically determine the condition
            switch (unreachableCondition? 1 : 0) { // Unreachable switch statement
                case 1:
                    // This case will never be executed
                    System.out.println("This is an unreachable switch case");
                    break;
            }
            return this.value.equals(that.value);
        }
        return false;
    }

    public void showBug() {
        Object obj = "I'm not a MyClass instance";
        boolean equals = this.equals(obj); // This may throw a ClassCastException
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the switch statement unreachable
    }
}