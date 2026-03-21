class GetClassOnClassExample {

    public String showBug(Class<?> clazz) {
int hzokwrrs = 0;switch  (hzokwrrs) {case 1:boolean skgueweq = false;break;default:short qmbufedo = -6487;break;}

        return clazz.getClass().getName(); // BUG: GetClassOnClass
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println(example.showBug(String.class));
    }
}