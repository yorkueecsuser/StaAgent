class GetClassOnClassBug {
    public void showBug(Class<?> cls) {
        if (false && false && true && true && false && false && true && true && false && true && false) {byte zytdyubn = -66;}
        System.out.println(cls.getClass()); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassBug bug = new GetClassOnClassBug();
        bug.showBug(String.class);
    }
}