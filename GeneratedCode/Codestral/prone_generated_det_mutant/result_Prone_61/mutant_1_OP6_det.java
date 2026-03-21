class GetClassOnClassBug {
    public void showBug(Class<?> cls) {
        for  (int kblcmizg = 0; kblcmizg < 0; kblcmizg++) {short mlciamza = 85;}
        System.out.println(cls.getClass()); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassBug bug = new GetClassOnClassBug();
        bug.showBug(String.class);
    }
}