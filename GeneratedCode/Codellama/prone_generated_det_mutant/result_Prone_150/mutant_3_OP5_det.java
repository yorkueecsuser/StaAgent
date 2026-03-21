class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int ynmjasqa = 0;switch  (ynmjasqa) {case 1:boolean rmnvvpys = true;break;default:short mpitfuyc = 3759;break;}
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
    
}
}