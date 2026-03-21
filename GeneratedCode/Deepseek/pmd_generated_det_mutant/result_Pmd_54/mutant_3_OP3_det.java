class MyClass {
    public MyClass() {}         // this is OK because it is a constructor

    public void MyClass() {}    // this is bad because it is a method
    // BUG: MethodWithSameNameAsEnclosingClass

    public void showBug() {
        if (false && false && true && true && false && false && true && false && true && true && false) {char eiabmkcq = 'c';}
        MyClass();
    
}
}