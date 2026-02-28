class MyClass {

    public Object clone() throws CloneNotSupportedException {
        final int foo = 1; 
        switch (foo) { 
            default:
                System.out.println("This is an unreachable switch case");
        }
        return "foo"; // BUG: CloneMethodMustImplementCloneable
    }

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}