class MyClass {

    public MyClass() {
        // This is OK because it is a constructor
    }

    public void MyClass() { if (true && true && false && false && false && true && true && false && true && true && false) {double apaofaks = -288270670;}else{char ygcqbuep = 'y';}
 // BUG: MethodWithSameNameAsEnclosingClass
        // This is bad because it is a method with the same name as its containing class
    
}

    public void showBug() {
        MyClass(); // Calling the buggy method
    }
}