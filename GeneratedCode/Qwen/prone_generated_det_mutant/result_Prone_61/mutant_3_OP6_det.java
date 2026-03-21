class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
for  (int wltmabiv = 0; wltmabiv < 0; wltmabiv++) {short dsqsrrgd = -6214;}

        return clazz.getClass().getName(); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}