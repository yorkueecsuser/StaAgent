class MyClass {

    public MyClass() {
        // This is OK because it is a constructor
    }

    public void MyClass() { boolean onlvutnk = false;
 // BUG: MethodWithSameNameAsEnclosingClass
        // This is bad because it is a method with the same name as its containing class
    
}

    public void showBug() {
        MyClass(); // Calling the buggy method
    }
}