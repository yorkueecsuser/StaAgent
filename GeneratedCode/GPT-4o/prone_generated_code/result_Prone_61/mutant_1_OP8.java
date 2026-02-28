class GetClassOnClassExample {

    public String showBug() {
        Class<?> clazz = String.class;
        // BUG: GetClassOnClass
        String className = clazz.getClass().getName(); // This mistakenly gets the name for java.lang.Class
        return className;
    }

    // Mutant code
    public String showBugMutant() {
        Class<?> a = String.class; // Renamed 'clazz' to 'a'
        // BUG: GetClassOnClass
        String b = a.getClass().getName(); // Renamed 'className' to 'b'
        return b;
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println("Class name obtained: " + example.showBug());
        
        // Output for the mutant
        System.out.println("Class name obtained from mutant: " + example.showBugMutant());
    }
}