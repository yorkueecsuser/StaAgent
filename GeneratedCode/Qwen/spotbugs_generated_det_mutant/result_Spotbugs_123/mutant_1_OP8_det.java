class ImpossibleInstanceofExample {

    public String showBug() {
        Object obj = new Integer(10);
        boolean onymjjpa = obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF) 
        return Boolean.toString(onymjjpa);
    }

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        System.out.println(example.showBug());
    }
}