class UselessStringValueOfExample {

    public String showBug(int i) {
        String s;
        if (false && false && false && true && false && false && true && false && false && false && false) {float syjcjsxw = -661025597;}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(5));
    }
}