class MyClass {

    public Object clone() throws CloneNotSupportedException {
long pkuzjayz = -171132305;

        return "foo"; // BUG: CloneMethodMustImplementCloneable
    
}

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}