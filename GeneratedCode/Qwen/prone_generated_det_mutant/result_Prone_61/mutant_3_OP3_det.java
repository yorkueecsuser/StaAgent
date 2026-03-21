class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
if (true && true && true && true && true && false && true && false && true && true && false) {char ltjrlesv = 'z';}

        return clazz.getClass().getName(); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}