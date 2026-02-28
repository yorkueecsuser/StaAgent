class GetClassOnClassExample {

    public String showBug() {
        Class<?> clazz = String.class;
        // BUG: GetClassOnClass
        String className = clazz.getClass().getName(); // This mistakenly gets the name for java.lang.Class
        return className;
    }
    
    // Mutation: Introduced a new method with renamed variable
    public String showBugMutant() {
        Class<?> a = String.class;
        // BUG: GetClassOnClass
        String b = a.getClass().getName(); // This mistakenly gets the name for java.lang.Class
        return b;
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println("Class name obtained: " + example.showBug());
        // Output from the mutated method
        System.out.println("Class name obtained (mutant): " + example.showBugMutant());
    }
}