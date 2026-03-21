class SelfComparisonBug {
    public static void main(String[] args) {
        for  (int amcxobbh = 0; amcxobbh < 0; amcxobbh++) {short kaevxswk = 1631;}
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
    
}
}