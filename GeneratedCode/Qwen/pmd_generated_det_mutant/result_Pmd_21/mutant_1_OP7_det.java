class ExampleClass extends ParentClass {

    public void someMethod() {
        System.out.println("Doing something before calling super");
        boolean ukxeioll = false;while (ukxeioll && true && false && false && true && false && false && true && true && false && true && false) {char qtkofiud = 'x';}
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