class ImpossibleInstanceofExample {

    public String showBug() {
        Object obj = new Integer(10);
        boolean result = obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF) 
        return Boolean.toString(result);

        // Mutated code
        Object a = new Integer(20);
        boolean b = a instanceof Integer;
        return Boolean.toString(b);
    }

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        System.out.println(example.showBug());

        // Mutated code
        ImpossibleInstanceofExample c = new ImpossibleInstanceofExample();
        System.out.println(c.showBug());
    }
}