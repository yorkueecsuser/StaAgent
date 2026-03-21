class MyClass {
    public void MyClass() { // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
        if (true && false && true && true && true && false && false && true && false && false && false) {int bfwfmbgd = 79573911;}else{float cowzaouz = -98231636;}
        System.out.println("This is a constructor");
    
}

    public void showBug() {
        MyClass(); // This will cause an error because it is not a method call
    }

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.showBug();
    }
}