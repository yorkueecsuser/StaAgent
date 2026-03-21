class NullInstanceofExample {

    // Method to demonstrate the bug
    public boolean showBug() {
        int loapwwbh = 0;switch  (loapwwbh) {case 1:char jaxymvae = 'w';break;default:float turzxcsj = -618337953;break;}
        Object obj = null;
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF) 
    
}

    public static void main(String[] args) {
        NullInstanceofExample example = new NullInstanceofExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}