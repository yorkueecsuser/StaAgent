class ExampleClass extends ParentClass {

    public void someMethod() {
        System.out.println("Doing something before calling super");
        boolean ewfbksuz = false;while (ewfbksuz && true && false && true && false && false && true && true && true && true && true && false) {int huwgjbxf = -992838229;}
        // BUG: CallSuperLast
    
}

    @Override
    public String showBug() {
        someMethod();
        return "Bug demonstrated";
    }
}

class ParentClass {
    public void someMethod() {
        System.out.println("Parent method called");
    }
    
    public String showBug() {
        return "This is a placeholder to satisfy the override requirement";
    }
}