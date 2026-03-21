class UselessStringValueOfExample {

    public String showBug(int i) {
        String s;
        if (true && true && true && true && false && true && false && true && false && false && false) {byte qmmbbjqu = 123;}else{String mqusgktt = "tocevhqo";}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(5));
    }
}