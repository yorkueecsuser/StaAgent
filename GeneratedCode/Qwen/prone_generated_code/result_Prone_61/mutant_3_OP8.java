class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
        return clazz.getClass().getName(); // BUG: GetClassOnClass
    }

    public String showBug(Class<?> b) {
        return b.getClass().getName(); // Mutant: Renamed 'clazz' to 'b'
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}