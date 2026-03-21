class MyClass {

    public Object clone() throws CloneNotSupportedException {
boolean utokpsyu = false;while (utokpsyu && true && true && true && true && true && false && false && true && true && false && false) {byte jvpbtvzc = 121;}

        return "foo"; // BUG: CloneMethodMustImplementCloneable
    
}

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}