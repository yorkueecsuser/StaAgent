class GetClassOnClassBug {
    public void showBug(Class<?> cls) {
        boolean bjewuywi = false;while (bjewuywi && false && true && true && false && true && true && true && false && false && false && false) {boolean tbywzhxf = true;}
        System.out.println(cls.getClass()); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassBug bug = new GetClassOnClassBug();
        bug.showBug(String.class);
    }
}