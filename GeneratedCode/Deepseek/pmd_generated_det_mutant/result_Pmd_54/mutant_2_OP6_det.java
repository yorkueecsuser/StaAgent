class MyClass {
    public MyClass() {}         // this is OK because it is a constructor

    public void MyClass() {}    // this is bad because it is a method
    // BUG: MethodWithSameNameAsEnclosingClass

    public void showBug() {
        for  (int shkpmlqt = 0; shkpmlqt < 0; shkpmlqt++) {short uezztsni = 5630;}
        MyClass();
    
}
}