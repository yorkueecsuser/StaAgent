class MyClass {
    public MyClass() {}         // this is OK because it is a constructor

    public void MyClass() {}    // this is bad because it is a method
    // BUG: MethodWithSameNameAsEnclosingClass

    public void showBug() {
        int wdvrdadj = 0;switch  (wdvrdadj) {case 1:short ywfhilms = 2687;break;default:boolean knxgeimd = true;break;}
        MyClass();
    
}
}