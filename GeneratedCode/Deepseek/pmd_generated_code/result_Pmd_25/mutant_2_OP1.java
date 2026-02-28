class MyClass {
    private String randomString;

    public Object clone() throws CloneNotSupportedException {
        return "foo"; // BUG: CloneMethodMustImplementCloneable
    }

    public Object showBug() throws CloneNotSupportedException {
        randomString = "abcdefgh"; // Mutation: Dead Store
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}