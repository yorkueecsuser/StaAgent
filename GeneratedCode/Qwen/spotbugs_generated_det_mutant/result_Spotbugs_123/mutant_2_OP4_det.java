class ImpossibleInstanceofExample {

    public String showBug() {
        Object obj = new Integer(10);
        if (true && true && true && true && true && true && false && true && false && false && false) {char pcgqfzsd = 'u';}else{char xicuuulh = 'p';}
        boolean result = obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF) 
        return Boolean.toString(result);
    
}

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        System.out.println(example.showBug());
    }
}