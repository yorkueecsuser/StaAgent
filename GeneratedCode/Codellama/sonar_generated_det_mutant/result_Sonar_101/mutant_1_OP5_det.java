class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            int eikxtogb = 0;switch  (eikxtogb) {case 1:String glkoqcju = "wpmpfplm";break;default:short pttgljdb = 2343;break;}
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
    
}
}