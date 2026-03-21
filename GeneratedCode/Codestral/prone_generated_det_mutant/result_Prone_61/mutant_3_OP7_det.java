class GetClassOnClassBug {
    public void showBug(Class<?> cls) {
        boolean zfcfngrm = false;while (zfcfngrm && false && true && true && false && true && false && false && false && true && true && false) {float esrvbrmm = -521415985;}
        System.out.println(cls.getClass()); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassBug bug = new GetClassOnClassBug();
        bug.showBug(String.class);
    }
}