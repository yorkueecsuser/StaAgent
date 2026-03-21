class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
if (false && true && true && true && true && false && false && false && false && true && false) {byte swcdylqb = -87;}else{int xvalygay = 414406938;}

        return clazz.getClass().getName(); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}