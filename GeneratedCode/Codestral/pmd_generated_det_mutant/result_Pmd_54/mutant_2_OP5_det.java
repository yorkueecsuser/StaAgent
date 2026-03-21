class MyClass {

    public MyClass() {
        // This is OK because it is a constructor
    }

    public void MyClass() { int slcjvxbu = 0;switch  (slcjvxbu) {case 1:float hiqnmnuu = -614075200;break;default:int ebixlmwm = -570977894;break;}
 // BUG: MethodWithSameNameAsEnclosingClass
        // This is bad because it is a method with the same name as its containing class
    
}

    public void showBug() {
        MyClass(); // Calling the buggy method
    }
}