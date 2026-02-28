class MyClass {

    public Object clone() throws CloneNotSupportedException {
        return "foo"; // BUG: CloneMethodMustImplementCloneable
    }

    public Object showBug() throws CloneNotSupportedException {
        MyClass renamedClass = new MyClass();
        return renamedClass.clone();
    }
}