class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
if (true && true && true && true && true && true && false && true && false && false && false) {byte onpqkopr = 108;}

        return clazz.getClass().getName(); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}