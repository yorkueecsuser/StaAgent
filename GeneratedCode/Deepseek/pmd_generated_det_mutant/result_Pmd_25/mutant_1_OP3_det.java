class MyClass {

    public Object clone() throws CloneNotSupportedException {
if (true && false && false && true && true && true && true && true && true && true && false) {long lvjkyroo = 452492800;}

        return "foo"; // BUG: CloneMethodMustImplementCloneable
    
}

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}