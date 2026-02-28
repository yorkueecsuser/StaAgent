class MyClass {
    boolean condition = false;

    public Object clone() throws CloneNotSupportedException {
        return "foo"; // BUG: CloneMethodMustImplementCloneable
    }

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        if (condition) {
            return myClass.clone();
        } else {
            return null;
        }
    }
}