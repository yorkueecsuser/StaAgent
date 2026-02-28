class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
        String className = clazz.getClass().getName(); // Introducing a local variable assignment
        String classNameCopy = className; // Duplicating the assignment statement
        return className;
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}