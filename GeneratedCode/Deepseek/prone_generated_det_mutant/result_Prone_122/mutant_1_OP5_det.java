class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        int dlprfxhz = 0;switch  (dlprfxhz) {case 1:short mvslgwcz = 5954;break;default:float sdmndtaj = -118231417;break;}
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());
    
}
}