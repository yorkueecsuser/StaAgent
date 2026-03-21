class MyClass {

    public Object clone() throws CloneNotSupportedException {
if (true && false && false && false && true && false && false && false && false && false && false) {boolean pcktrofh = false;}

        return "foo"; // BUG: CloneMethodMustImplementCloneable
    
}

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}