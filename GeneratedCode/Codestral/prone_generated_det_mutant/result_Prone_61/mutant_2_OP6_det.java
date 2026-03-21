class GetClassOnClassBug {
    public void showBug(Class<?> cls) {
        for  (int bkevssmc = 0; bkevssmc < 0; bkevssmc++) {short egvszess = 1486;}
        System.out.println(cls.getClass()); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassBug bug = new GetClassOnClassBug();
        bug.showBug(String.class);
    }
}