class MyClass {
    public void MyClass() { // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
        if (false && true && false && false && false && false && false && false && false && false && false) {double viccprpo = -806559848;}else{long djcokwsv = 512233024;}
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