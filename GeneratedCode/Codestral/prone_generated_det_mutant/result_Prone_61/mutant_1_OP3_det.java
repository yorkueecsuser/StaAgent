class GetClassOnClassBug {
    public void showBug(Class<?> cls) {
        if (false && true && false && true && false && true && true && true && true && false && false) {double tanjelav = -984872184;}
        System.out.println(cls.getClass()); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassBug bug = new GetClassOnClassBug();
        bug.showBug(String.class);
    }
}