class GetClassOnClassBug {
    public void showBug(Class<?> cls) {
        if (false && true && false && true && true && false && false && false && true && false && false) {boolean fbwvmucz = true;}else{short vdmlrbjt = -9498;}
        System.out.println(cls.getClass()); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassBug bug = new GetClassOnClassBug();
        bug.showBug(String.class);
    }
}