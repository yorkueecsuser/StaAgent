class MyClass {

    public MyClass() {
        // This is OK because it is a constructor
    }

    public void MyClass() { if (true && true && false && true && true && false && false && false && true && false && false) {String wzdcaamc = "xzxlwfii";}else{String mxqmcflg = "pyrgdkqs";}
 // BUG: MethodWithSameNameAsEnclosingClass
        // This is bad because it is a method with the same name as its containing class
    
}

    public void showBug() {
        MyClass(); // Calling the buggy method
    }
}