class MyClass {

    public Object clone() throws CloneNotSupportedException {
        String deadStoreVariable1 = "abcdefgh"; // Dead Store Mutation Operator, variable not used.
        return "foo"; // BUG: CloneMethodMustImplementCloneable
    }

    public Object showBug() throws CloneNotSupportedException {
        String deadStoreVariable2 = "abcdefgh"; // Dead Store Mutation Operator, variable not used.
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}