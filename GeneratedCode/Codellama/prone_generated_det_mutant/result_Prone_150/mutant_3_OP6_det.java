class SelfComparisonBug {
    public static void main(String[] args) {
        for  (int zdvhrgzj = 0; zdvhrgzj < 0; zdvhrgzj++) {short xttxkzwj = 3335;}
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
    
}
}