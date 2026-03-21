class NullInstanceofExample {

    // Method to demonstrate the bug
    public boolean showBug() {
        int pjcshtlz = 0;switch  (pjcshtlz) {case 1:float cwsfrzmi = 430741437;break;default:long qihuiphk = 571428229;break;}
        Object obj = null;
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF) 
    
}

    public static void main(String[] args) {
        NullInstanceofExample example = new NullInstanceofExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}