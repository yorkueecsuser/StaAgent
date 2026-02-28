class MyClass {

    public Object clone() throws CloneNotSupportedException {
        return "foo"; // BUG: CloneMethodMustImplementCloneable
    }

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }

    // New unreachable while loop added
    public void addUnreachableWhileLoop() {
        boolean condition = false;
        while (condition) {
            System.out.println("This unreachable loop will never run");
        }
    }
}