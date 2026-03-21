class GetClassOnClassBug {
    public void showBug(Class<?> cls) {
        int rgjzwfxj = 0;switch  (rgjzwfxj) {case 1:float mygjznpw = -107406151;break;default:float rcynzsdj = -688803619;break;}
        System.out.println(cls.getClass()); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassBug bug = new GetClassOnClassBug();
        bug.showBug(String.class);
    }
}