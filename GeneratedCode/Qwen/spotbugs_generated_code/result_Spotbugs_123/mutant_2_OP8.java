class ImpossibleInstanceofExample {

    public String showBug() {
        Object obj = new Integer(10);
        boolean result = obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF) 
        return Boolean.toString(result);
    }

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        System.out.println(example.showBug());
    }

    // Mutated code
    public String display() {
        Object x = new Integer(20);
        boolean y = x instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF) 
        return Boolean.toString(y);
    }

    public static void test(String[] z) {
        ImpossibleInstanceofExample a = new ImpossibleInstanceofExample();
        System.out.println(a.display());
    }
}