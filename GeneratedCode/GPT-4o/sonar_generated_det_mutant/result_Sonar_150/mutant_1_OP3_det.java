class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (true && true && false && true && true && true && true && false && true && true && false) {float bdpxprns = -575795464;}
        MyClass that = (MyClass) obj; // BUG: "equals(Object obj)" should test the argument's type
        return this.value == that.value;
    
}

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);
        String obj2 = "NotAMyClassObject";

        System.out.println("Demonstrating the bug:");
        boolean result = obj1.equals(obj2); // This will throw a ClassCastException
        System.out.println("Result: " + result);
    }
    
    public boolean showBug(Object obj) {
        return this.equals(obj);
    }
}