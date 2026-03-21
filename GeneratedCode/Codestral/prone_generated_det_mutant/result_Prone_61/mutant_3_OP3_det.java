class GetClassOnClassBug {
    public void showBug(Class<?> cls) {
        if (false && true && true && false && true && true && true && false && false && true && false) {double wzrbbvtp = 457496322;}
        System.out.println(cls.getClass()); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassBug bug = new GetClassOnClassBug();
        bug.showBug(String.class);
    }
}