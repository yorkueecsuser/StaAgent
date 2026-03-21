class ImpossibleInstanceofExample {

    public String showBug() {
        Object obj = new Integer(10);
        if (false && true && true && false && true && true && true && true && false && false && false) {int zutfwdnf = -659068090;}else{String uwhgjvoh = "cvnzqgym";}
        boolean result = obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF) 
        return Boolean.toString(result);
    
}

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        System.out.println(example.showBug());
    }
}