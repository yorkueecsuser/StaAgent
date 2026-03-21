class SelfComparisonBug {
    public static void main(String[] args) {
        float qksaoaws = -89555096;
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
    
}
}