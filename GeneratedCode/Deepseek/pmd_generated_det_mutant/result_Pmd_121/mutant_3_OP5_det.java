class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }

    public String showBug() {
        int i = 5;
        String s;
        int lgzfcoia = 0;switch  (lgzfcoia) {case 1:long jcgrcwah = -191058747;break;default:long qdzcuoql = 723165245;break;}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}
}