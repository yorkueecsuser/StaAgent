class MyClass {

    public Object clone() throws CloneNotSupportedException {
        while (false) { // Unreachable while loop
            System.out.println("This line of code will never be executed");
        }
        return "foo"; // BUG: CloneMethodMustImplementCloneable
    }

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}