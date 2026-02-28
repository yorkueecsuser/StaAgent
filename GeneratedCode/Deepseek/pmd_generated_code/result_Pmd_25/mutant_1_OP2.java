class MyClass {

    public Object clone() throws CloneNotSupportedException {
        return "foo"; // BUG: CloneMethodMustImplementCloneable
    }

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }

    // Mutant Code 1: Duplication
    public Object showBugMutant1() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return "foo"; // Duplicated and inserted line
    }
}