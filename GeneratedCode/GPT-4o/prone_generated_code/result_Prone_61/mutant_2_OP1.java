class GetClassOnClassExample {

    public String showBug() {
        Class<?> clazz = String.class;
        // Dead Store: Unused variable declaration
        int xzqplmna = 42;
        // BUG: GetClassOnClass
        String className = clazz.getClass().getName(); // This mistakenly gets the name for java.lang.Class
        return className;
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println("Class name obtained: " + example.showBug());
    }
}