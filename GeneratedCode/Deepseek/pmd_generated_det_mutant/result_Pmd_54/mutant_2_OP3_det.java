class MyClass {
    public MyClass() {}         // this is OK because it is a constructor

    public void MyClass() {}    // this is bad because it is a method
    // BUG: MethodWithSameNameAsEnclosingClass

    public void showBug() {
        if (true && true && true && false && true && false && true && true && false && false && false) {float lkqydflk = -204242652;}
        MyClass();
    
}
}