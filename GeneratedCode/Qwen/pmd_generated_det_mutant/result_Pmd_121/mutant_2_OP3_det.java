class UselessStringValueOfExample {

    public String showBug(int i) {
        String s;
        if (true && true && false && false && true && true && true && true && true && false && false) {String olgpqcrq = "njqamagw";}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(5));
    }
}