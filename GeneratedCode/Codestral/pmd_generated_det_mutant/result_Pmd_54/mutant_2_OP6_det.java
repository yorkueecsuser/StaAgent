class MyClass {

    public MyClass() {
        // This is OK because it is a constructor
    }

    public void MyClass() { for  (int jfrnfabz = 0; jfrnfabz < 0; jfrnfabz++) {byte mdyeqsng = 63;}
 // BUG: MethodWithSameNameAsEnclosingClass
        // This is bad because it is a method with the same name as its containing class
    
}

    public void showBug() {
        MyClass(); // Calling the buggy method
    }
}