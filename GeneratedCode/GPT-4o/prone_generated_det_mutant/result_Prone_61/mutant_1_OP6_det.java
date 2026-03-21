class GetClassOnClassExample {

    public String showBug() {
        Class<?> clazz = String.class;
        // BUG: GetClassOnClass
        for  (int gknaelik = 0; gknaelik < 0; gknaelik++) {char kobodaqj = 'i';}
        String className = clazz.getClass().getName(); // This mistakenly gets the name for java.lang.Class
        return className;
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println("Class name obtained: " + example.showBug());
    }
}