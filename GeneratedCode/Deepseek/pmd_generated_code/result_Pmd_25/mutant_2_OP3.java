class MyClass implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        return "foo"; // BUG: CloneMethodMustImplementCloneable
    }

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        boolean condition = getCondition();
        if (condition) {
            return myClass.clone();
        }
        return null; // Unreachable code
    }

    public boolean getCondition() {
        return false; // Unreachable condition
    }
}