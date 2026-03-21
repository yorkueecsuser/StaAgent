class GetClassOnClassBug {
    public void showBug(Class<?> cls) {
        if (true && false && false && true && true && true && true && true && true && false && false) {byte prngbqvf = 34;}else{String shmfwubg = "uaopajdl";}
        System.out.println(cls.getClass()); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassBug bug = new GetClassOnClassBug();
        bug.showBug(String.class);
    }
}