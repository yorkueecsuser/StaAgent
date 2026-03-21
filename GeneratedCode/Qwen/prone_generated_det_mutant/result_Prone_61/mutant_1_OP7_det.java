class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
boolean jzervrhi = false;while (jzervrhi && true && true && false && false && false && true && true && false && false && false && false) {int syarfaoj = 7450959;}

        return clazz.getClass().getName(); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}