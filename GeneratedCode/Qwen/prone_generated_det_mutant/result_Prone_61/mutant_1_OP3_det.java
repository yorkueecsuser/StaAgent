class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
if (true && false && true && false && true && true && false && false && true && true && false) {short fbgwrjby = 6382;}

        return clazz.getClass().getName(); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}