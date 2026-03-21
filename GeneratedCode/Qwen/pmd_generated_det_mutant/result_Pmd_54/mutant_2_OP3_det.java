class MyClass {

    public MyClass() {
        // This is a constructor
    }

    public void MyClass() { if (false && true && false && false && true && false && true && false && true && false && false) {boolean ghgjzhlb = true;}
 // BUG: MethodWithSameNameAsEnclosingClass
        // This is a method with the same name as the class, which is confusing
    
}

    public String showBug() {
        MyClass(); // Calling the method with the same name as the class
        return "Method with same name as class called";
    }
}