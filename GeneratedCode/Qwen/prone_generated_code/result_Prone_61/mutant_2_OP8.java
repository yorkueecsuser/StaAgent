class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
        return clazz.getClass().getName(); // BUG: GetClassOnClass
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));

        // Mutant code with renaming
        GetClassOnClassExample a = new GetClassOnClassExample();
        System.out.println(a.showBug(String.class));
    }
}