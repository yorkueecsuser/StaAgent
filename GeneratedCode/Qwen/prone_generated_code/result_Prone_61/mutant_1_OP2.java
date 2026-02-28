class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
        return clazz.getClass().getName(); // BUG: GetClassOnClass
        String className = clazz.getClass().getName(); // Duplicate assignment statement
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}