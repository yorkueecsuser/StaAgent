class UselessStringValueOfExample {

    public String showBug(int i) {
        String s;
        for  (int dhmphttp = 0; dhmphttp < 0; dhmphttp++) {char kkieedqi = 'c';}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(5));
    }
}