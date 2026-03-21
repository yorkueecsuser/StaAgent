class GetClassOnClassBug {
    public void showBug(Class<?> cls) {
        if (true && false && false && true && true && false && true && true && true && false && false) {short pxmvxqrp = -8990;}else{double kaigrqek = -781779182;}
        System.out.println(cls.getClass()); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassBug bug = new GetClassOnClassBug();
        bug.showBug(String.class);
    }
}