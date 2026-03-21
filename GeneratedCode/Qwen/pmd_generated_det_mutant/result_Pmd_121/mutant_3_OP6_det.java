class UselessStringValueOfExample {

    public String showBug(int i) {
        String s;
        for  (int hvfewjjk = 0; hvfewjjk < 0; hvfewjjk++) {boolean syhncorm = true;}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(5));
    }
}