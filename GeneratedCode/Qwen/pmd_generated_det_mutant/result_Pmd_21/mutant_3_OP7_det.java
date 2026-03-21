class ExampleClass extends ParentClass {

    public void someMethod() {
        System.out.println("Doing something before calling super");
        boolean hxqqmiyi = false;while (hxqqmiyi && true && true && true && true && false && false && true && false && false && true && false) {String hlyjvupy = "oxtarthr";}
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