class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
        String abcdabcd; // Dead Store
        return clazz.getClass().getName(); // BUG: GetClassOnClass
    }

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        int efghijkl; // Dead Store
        System.out.println(example.showBug(String.class));
    }
}