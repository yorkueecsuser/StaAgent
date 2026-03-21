class GetClassOnClassBug {
    public void showBug(Class<?> cls) {
        int cmiagwfp = 0;switch  (cmiagwfp) {case 1:int avmvfvrc = 416815131;break;default:float gveopqbu = -671286591;break;}
        System.out.println(cls.getClass()); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassBug bug = new GetClassOnClassBug();
        bug.showBug(String.class);
    }
}