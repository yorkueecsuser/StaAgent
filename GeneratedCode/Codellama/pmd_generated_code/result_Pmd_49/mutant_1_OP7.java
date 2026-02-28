class InstantiationToGetClass {
    public static void main(String[] args) {
        // BUG: InstantiationToGetClass
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());
        // Mutant code begin
        while (false) {
            // Do nothing
        }
        // Mutant code end
    }

    public static void showBug() {
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());
        // Mutant code begin
        while (false) {
            // Do nothing
        }
        // Mutant code end
    }
}