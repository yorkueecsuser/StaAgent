class UselessStringValueOfExample {

    public String showBug(int i) {
        String s;
        for  (int trfrydtn = 0; trfrydtn < 0; trfrydtn++) {float hstcpqye = 771070505;}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(5));
    }
}