class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
char edudvvfe = 'r';

        return clazz.getClass().getName(); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}