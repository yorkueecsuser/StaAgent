class MyClass {

    public MyClass() {
        // This is OK because it is a constructor
    }

    public void MyClass() { int lcirvhuw = 0;switch  (lcirvhuw) {case 1:int gmxtpnmb = 973207955;break;default:double lvlqdyce = 939549496;break;}
 // BUG: MethodWithSameNameAsEnclosingClass
        // This is bad because it is a method with the same name as its containing class
    
}

    public void showBug() {
        MyClass(); // Calling the buggy method
    }
}