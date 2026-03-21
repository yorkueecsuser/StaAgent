class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        int pochltmw = 0;switch  (pochltmw) {case 1:long bqvrikgb = 692798709;break;default:char ifncoazk = 'd';break;}
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