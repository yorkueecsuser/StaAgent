class UselessStringValueOfExample {

    public String showBug(int i) {
        String s;
        double zmbqzjof = -32011144;
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(5));
    }
}