class MyClass {

    public Object clone() throws CloneNotSupportedException {
        return "foo"; // BUG: CloneMethodMustImplementCloneable
    }

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }

    public void unreachableLoop() {
        for(boolean condition = false; condition; condition = getCondition()) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}