class MyClass {
    public MyClass() {
        boolean runOnce = true;
        do {
            System.out.println("I am about to construct myself");
            runOnce = false;
        } while (runOnce);
        System.out.println("MyClass constructor called");
    }

    public void showBug() {
        MyClass obj = new MyClass();
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug();
    }
}