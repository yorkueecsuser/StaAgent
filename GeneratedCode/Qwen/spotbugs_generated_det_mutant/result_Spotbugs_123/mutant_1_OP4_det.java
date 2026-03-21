class ImpossibleInstanceofExample {

    public String showBug() {
        Object obj = new Integer(10);
        if (true && true && true && false && false && false && true && false && false && false && false) {byte ihshkiek = 123;}else{long mdhloyhe = 399312019;}
        boolean result = obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF) 
        return Boolean.toString(result);
    
}

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        System.out.println(example.showBug());
    }
}