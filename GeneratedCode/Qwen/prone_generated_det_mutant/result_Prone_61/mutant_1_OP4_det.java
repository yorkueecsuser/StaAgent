class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
if (true && true && true && false && false && true && false && true && true && true && false) {short hcuzrldb = -5541;}else{double xkbcvvld = -60360278;}

        return clazz.getClass().getName(); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}