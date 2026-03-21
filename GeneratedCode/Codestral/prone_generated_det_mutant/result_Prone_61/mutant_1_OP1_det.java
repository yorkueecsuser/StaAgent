class GetClassOnClassBug {
    public void showBug(Class<?> cls) {
        float rtpzqugo = 523305556;
        System.out.println(cls.getClass()); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassBug bug = new GetClassOnClassBug();
        bug.showBug(String.class);
    }
}