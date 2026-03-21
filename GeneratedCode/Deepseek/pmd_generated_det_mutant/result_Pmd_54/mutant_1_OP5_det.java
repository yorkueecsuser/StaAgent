class MyClass {
    public MyClass() {}         // this is OK because it is a constructor

    public void MyClass() {}    // this is bad because it is a method
    // BUG: MethodWithSameNameAsEnclosingClass

    public void showBug() {
        int wvejgpbj = 0;switch  (wvejgpbj) {case 1:long hrwnqfsa = -176743768;break;default:boolean mdpaysjn = true;break;}
        MyClass();
    
}
}