class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
if (true && true && true && true && false && false && false && true && false && true && false) {boolean dxblepkq = true;}else{short kovbhunu = 9132;}

        return clazz.getClass().getName(); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}