class MyClass {

    public MyClass() {
        // This is OK because it is a constructor
    }

    public void MyClass() { if (false && true && true && false && true && false && false && true && true && false && false) {int fxzzivwp = -751798336;}else{float edsegqoc = 827725061;}
 // BUG: MethodWithSameNameAsEnclosingClass
        // This is bad because it is a method with the same name as its containing class
    
}

    public void showBug() {
        MyClass(); // Calling the buggy method
    }
}