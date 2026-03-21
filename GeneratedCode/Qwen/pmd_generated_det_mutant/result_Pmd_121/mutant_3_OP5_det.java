class UselessStringValueOfExample {

    public String showBug(int i) {
        String s;
        int ggycefgn = 0;switch  (ggycefgn) {case 1:int ezhmecxl = 6860924;break;default:boolean axdqmfkb = true;break;}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(5));
    }
}