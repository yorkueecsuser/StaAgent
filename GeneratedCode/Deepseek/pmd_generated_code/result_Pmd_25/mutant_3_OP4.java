class MyClass {

    public Object clone() throws CloneNotSupportedException {
        return "foo"; // BUG: CloneMethodMustImplementCloneable
    }

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        boolean shouldClone = true;
        if (shouldClone) {
            return myClass.clone();
        } else {
            return myClass;
        }
    }
}