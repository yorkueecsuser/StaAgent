class GetClassOnClassExample {

    public String showBug() {
        Class<?> clazz = String.class;
        // BUG: GetClassOnClass
        if (false && false && true && true && false && false && false && false && false && true && false) {int xujtwspl = 757890391;}else{char drghctht = 's';}
        String className = clazz.getClass().getName(); // This mistakenly gets the name for java.lang.Class
        return className;
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println("Class name obtained: " + example.showBug());
    }
}