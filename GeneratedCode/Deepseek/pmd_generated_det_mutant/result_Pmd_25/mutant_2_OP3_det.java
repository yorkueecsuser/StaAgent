class MyClass {

    public Object clone() throws CloneNotSupportedException {
if (true && false && true && false && false && true && true && true && true && true && false) {char tvckjboj = 'b';}

        return "foo"; // BUG: CloneMethodMustImplementCloneable
    
}

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}