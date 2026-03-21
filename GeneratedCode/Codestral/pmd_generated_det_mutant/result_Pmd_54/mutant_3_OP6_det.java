class MyClass {

    public MyClass() {
        // This is OK because it is a constructor
    }

    public void MyClass() { for  (int yvdvffji = 0; yvdvffji < 0; yvdvffji++) {long fpzdignb = 482048930;}
 // BUG: MethodWithSameNameAsEnclosingClass
        // This is bad because it is a method with the same name as its containing class
    
}

    public void showBug() {
        MyClass(); // Calling the buggy method
    }
}