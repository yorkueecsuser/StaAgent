class GetClassOnClassBug {
    public void showBug(Class<?> cls) {
        for  (int bidsydxz = 0; bidsydxz < 0; bidsydxz++) {long bbshrjup = -892221540;}
        System.out.println(cls.getClass()); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassBug bug = new GetClassOnClassBug();
        bug.showBug(String.class);
    }
}