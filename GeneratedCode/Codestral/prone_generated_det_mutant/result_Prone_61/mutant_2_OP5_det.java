class GetClassOnClassBug {
    public void showBug(Class<?> cls) {
        int enofmahc = 0;switch  (enofmahc) {case 1:double umvfmocm = 270911365;break;default:int hsmdiafj = 912501251;break;}
        System.out.println(cls.getClass()); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassBug bug = new GetClassOnClassBug();
        bug.showBug(String.class);
    }
}