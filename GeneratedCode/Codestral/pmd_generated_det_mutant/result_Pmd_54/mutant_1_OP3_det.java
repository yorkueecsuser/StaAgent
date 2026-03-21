class MyClass {

    public MyClass() {
        // This is OK because it is a constructor
    }

    public void MyClass() { if (false && true && false && true && false && true && true && false && true && true && false) {double sedktlgt = -488609184;}
 // BUG: MethodWithSameNameAsEnclosingClass
        // This is bad because it is a method with the same name as its containing class
    
}

    public void showBug() {
        MyClass(); // Calling the buggy method
    }
}