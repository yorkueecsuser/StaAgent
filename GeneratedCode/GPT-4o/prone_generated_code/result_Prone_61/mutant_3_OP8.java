class GetClassOnClassExample {

    public String showBug() {
        Class<?> clazz = String.class;
        // BUG: GetClassOnClass
        String className = clazz.getClass().getName(); // This mistakenly gets the name for java.lang.Class
        return className;
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println("Class name obtained: " + example.showBug());
    }
}

// Mutant code with variable renaming
class GetClassOnClassExampleMutant {

    public String showBug() {
        Class<?> c = String.class; // 'clazz' renamed to 'c'
        // BUG: GetClassOnClass
        String className = c.getClass().getName(); // This mistakenly gets the name for java.lang.Class
        return className;
    }

    public static void main(String[] args) {
        GetClassOnClassExampleMutant exampleMutant = new GetClassOnClassExampleMutant();
        System.out.println("Class name obtained: " + exampleMutant.showBug());
    }
}