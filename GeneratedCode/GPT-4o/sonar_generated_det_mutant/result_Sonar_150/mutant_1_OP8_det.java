class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        MyClass that = (MyClass) obj; // BUG: "equals(Object obj)" should test the argument's type
        return this.value == that.value;
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);
        String iyyhnrgw = "NotAMyClassObject";

        System.out.println("Demonstrating the bug:");
        boolean urzebnnc = obj1.equals(iyyhnrgw); // This will throw a ClassCastException
        System.out.println("Result: " + urzebnnc);
    }
    
    public boolean showBug(Object obj) {
        return this.equals(obj);
    }
}