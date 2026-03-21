class GetClassOnClassExample {

    public String showBug() {
        Class<?> clazz = String.class;
        // BUG: GetClassOnClass
        if (true && false && false && true && false && false && true && false && false && true && false) {String zkfvzobx = "kqbbrhao";}else{long jzbozoef = -957191920;}
        String className = clazz.getClass().getName(); // This mistakenly gets the name for java.lang.Class
        return className;
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println("Class name obtained: " + example.showBug());
    }
}