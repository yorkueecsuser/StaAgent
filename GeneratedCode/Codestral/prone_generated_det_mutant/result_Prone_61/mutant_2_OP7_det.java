class GetClassOnClassBug {
    public void showBug(Class<?> cls) {
        boolean ykqdoolv = false;while (ykqdoolv && true && false && true && true && false && false && true && false && false && false && false) {boolean qwaqmzlu = false;}
        System.out.println(cls.getClass()); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassBug bug = new GetClassOnClassBug();
        bug.showBug(String.class);
    }
}