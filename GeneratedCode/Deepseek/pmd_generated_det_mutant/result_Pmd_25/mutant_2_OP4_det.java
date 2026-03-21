class MyClass {

    public Object clone() throws CloneNotSupportedException {
if (true && true && true && true && true && true && false && false && false && true && false) {short xawuuruf = 2369;}else{byte hpyynsoy = 72;}

        return "foo"; // BUG: CloneMethodMustImplementCloneable
    
}

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}