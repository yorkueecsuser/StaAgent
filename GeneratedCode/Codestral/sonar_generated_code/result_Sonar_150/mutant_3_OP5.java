class MyClass {
    private String value;

    public MyClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        MyClass that = (MyClass) obj;
        // Adding an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This case will never be reached
                System.out.println("Unreachable case");
                break;
        }
        return this.value.equals(that.value);
    }

    public void showBug() {
        Object obj = "I'm not a MyClass instance";
        boolean equals = this.equals(obj); // This will throw a ClassCastException
    }

    // Dynamic method that returns an unreachable value
    private int getUnreachableValue() {
        return -1; // This will always return a value that is not 1
    }
}