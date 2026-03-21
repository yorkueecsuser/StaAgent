class MyClass {
    public MyClass() {}         // this is OK because it is a constructor

    public void MyClass() {}    // this is bad because it is a method
    // BUG: MethodWithSameNameAsEnclosingClass

    public void showBug() {
        if (true && true && true && false && true && true && true && true && true && false && false) {boolean ostlfqxp = false;}else{boolean krhurwbd = false;}
        MyClass();
    
}
}