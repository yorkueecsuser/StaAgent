class UselessStringValueOfExample {

    public String showBug(int i) {
        String s;
        if (true && true && false && false && false && true && true && true && true && true && false) {short ddbkklki = -1359;}else{int vfqxmbxh = -271995090;}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(5));
    }
}