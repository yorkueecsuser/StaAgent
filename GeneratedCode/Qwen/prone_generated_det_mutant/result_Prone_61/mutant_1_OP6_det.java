class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
for  (int wnjrtmal = 0; wnjrtmal < 0; wnjrtmal++) {double rqjlmjtu = 164562491;}

        return clazz.getClass().getName(); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}