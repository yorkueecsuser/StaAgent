class MyClass {

    public MyClass() {
        // This is a constructor
    }

    public void MyClass() { if (true && true && false && true && false && true && false && true && true && true && false) {float zbgzmicc = 583224412;}
 // BUG: MethodWithSameNameAsEnclosingClass
        // This is a method with the same name as the class, which is confusing
    
}

    public String showBug() {
        MyClass(); // Calling the method with the same name as the class
        return "Method with same name as class called";
    }
}