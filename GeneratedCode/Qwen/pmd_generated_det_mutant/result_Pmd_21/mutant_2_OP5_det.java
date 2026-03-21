class ExampleClass extends ParentClass {

    public void someMethod() {
        System.out.println("Doing something before calling super");
        int wrdtztuq = 0;switch  (wrdtztuq) {case 1:float uxmlbfgc = -521926981;break;default:short pmrdojct = -4937;break;}
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