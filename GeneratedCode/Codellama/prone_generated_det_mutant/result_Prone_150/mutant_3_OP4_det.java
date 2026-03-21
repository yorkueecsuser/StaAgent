class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        if (false && true && false && true && false && false && false && true && true && true && false) {char sohxcgbs = 'a';}else{long qddgghzw = 389487629;}
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
    
}
}