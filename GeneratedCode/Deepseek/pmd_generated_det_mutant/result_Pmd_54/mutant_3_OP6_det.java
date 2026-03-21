class MyClass {
    public MyClass() {}         // this is OK because it is a constructor

    public void MyClass() {}    // this is bad because it is a method
    // BUG: MethodWithSameNameAsEnclosingClass

    public void showBug() {
        for  (int boeszpec = 0; boeszpec < 0; boeszpec++) {byte fmxqjhqp = -104;}
        MyClass();
    
}
}