class ImpossibleInstanceofExample {

    public String showBug() {
        Object obj = new Integer(10);
        boolean iomipvwq = obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF) 
        return Boolean.toString(iomipvwq);
    }

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        System.out.println(example.showBug());
    }
}