class MyClass {
    public MyClass() {}         // this is OK because it is a constructor

    public void MyClass() {}    // this is bad because it is a method
    // BUG: MethodWithSameNameAsEnclosingClass

    public void showBug() {
        for  (int mbdbjmhx = 0; mbdbjmhx < 0; mbdbjmhx++) {boolean zdhruglq = false;}
        MyClass();
    
}
}