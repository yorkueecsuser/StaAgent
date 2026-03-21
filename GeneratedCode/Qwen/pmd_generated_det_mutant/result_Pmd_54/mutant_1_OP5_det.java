class MyClass {

    public MyClass() {
        // This is a constructor
    }

    public void MyClass() { int kydbpboz = 0;switch  (kydbpboz) {case 1:float ensnnxgi = 280745754;break;default:long qsthggjp = -218095242;break;}
 // BUG: MethodWithSameNameAsEnclosingClass
        // This is a method with the same name as the class, which is confusing
    
}

    public String showBug() {
        MyClass(); // Calling the method with the same name as the class
        return "Method with same name as class called";
    }
}