class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
int dofyqcrw = 0;switch  (dofyqcrw) {case 1:char sbkwaiqr = 'y';break;default:double knsjtzbr = 78661690;break;}

        return clazz.getClass().getName(); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}