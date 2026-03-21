class MyClass {

    public MyClass() {
        // This is a constructor
    }

    public void MyClass() { int itwzlwii = 0;switch  (itwzlwii) {case 1:double jdnnolwi = 900149606;break;default:short rzzautve = 6983;break;}
 // BUG: MethodWithSameNameAsEnclosingClass
        // This is a method with the same name as the class, which is confusing
    
}

    public String showBug() {
        MyClass(); // Calling the method with the same name as the class
        return "Method with same name as class called";
    }
}