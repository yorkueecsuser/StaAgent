class MyClass {

    public Object clone() throws CloneNotSupportedException {
        String a1b2c3d4; // Mutation: Dead Store
        return "foo"; // BUG: CloneMethodMustImplementCloneable
    }

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}