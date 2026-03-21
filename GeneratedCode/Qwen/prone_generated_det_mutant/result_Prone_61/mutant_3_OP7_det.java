class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
boolean fdnbllna = false;while (fdnbllna && true && true && true && true && false && false && false && false && false && true && false) {short womsrzso = -7464;}

        return clazz.getClass().getName(); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}