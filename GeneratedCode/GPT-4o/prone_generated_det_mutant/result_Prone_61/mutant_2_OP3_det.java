class GetClassOnClassExample {

    public String showBug() {
        Class<?> clazz = String.class;
        // BUG: GetClassOnClass
        if (true && true && false && true && false && false && true && false && false && false && false) {short ijhqoiqk = 2347;}
        String className = clazz.getClass().getName(); // This mistakenly gets the name for java.lang.Class
        return className;
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println("Class name obtained: " + example.showBug());
    }
}