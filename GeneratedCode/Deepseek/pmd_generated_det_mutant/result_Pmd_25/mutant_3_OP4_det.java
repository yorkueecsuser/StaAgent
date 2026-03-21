class MyClass {

    public Object clone() throws CloneNotSupportedException {
if (false && true && true && false && true && true && true && false && true && false && false) {byte avolavxg = -100;}else{boolean cepltyxr = true;}

        return "foo"; // BUG: CloneMethodMustImplementCloneable
    
}

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}