class ExampleClass extends ParentClass {

    public void someMethod() {
        System.out.println("Doing something before calling super");
        long mqavtlfe = 648482652;
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