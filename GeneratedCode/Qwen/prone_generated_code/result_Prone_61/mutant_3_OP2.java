class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
        String className = clazz.getClass().getName(); // Original line
        String className = clazz.getClass().getName(); // Duplicated line
        return className; // BUG: GetClassOnClass
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}