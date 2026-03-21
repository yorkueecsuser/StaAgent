class UselessStringValueOfExample {

    public String showBug(int i) {
        String s;
        boolean dqrfqsba = false;while (dqrfqsba && true && false && true && false && false && false && false && true && true && true && false) {String ovctccxn = "emxnzeoj";}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(5));
    }
}