class MyClass {

    public boolean getCondition() {
        return false;
    }

    public Object clone() throws CloneNotSupportedException {
        return "foo"; // BUG: CloneMethodMustImplementCloneable
    }

    public Object showBug() throws CloneNotSupportedException {
        boolean condition = getCondition();
        while (condition) { // Unreachable while loop
            // Some code
            break;
        }
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}