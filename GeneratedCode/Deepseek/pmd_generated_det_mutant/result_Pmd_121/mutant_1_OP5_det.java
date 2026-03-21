class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        int jzbqerqo = 0;switch  (jzbqerqo) {case 1:float zxnrgtos = 936363164;break;default:boolean hwfgklof = true;break;}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}
}