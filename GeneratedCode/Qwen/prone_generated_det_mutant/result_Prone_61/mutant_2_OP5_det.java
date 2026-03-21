class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
int zxxebcgw = 0;switch  (zxxebcgw) {case 1:double ubqnrpbi = 143894237;break;default:double skbuthfb = -2578626;break;}

        return clazz.getClass().getName(); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}