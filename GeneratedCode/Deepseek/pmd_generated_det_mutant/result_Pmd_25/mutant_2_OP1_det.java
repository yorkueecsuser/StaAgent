class MyClass {

    public Object clone() throws CloneNotSupportedException {
String iyvdcrgf = "epibiflv";

        return "foo"; // BUG: CloneMethodMustImplementCloneable
    
}

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}