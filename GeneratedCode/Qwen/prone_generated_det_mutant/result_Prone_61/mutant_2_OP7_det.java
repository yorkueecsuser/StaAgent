class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
boolean clxziiyg = false;while (clxziiyg && false && true && true && true && false && false && true && true && true && false && false) {char lbgaislq = 'w';}

        return clazz.getClass().getName(); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}