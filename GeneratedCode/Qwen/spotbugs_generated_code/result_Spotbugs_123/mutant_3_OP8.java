class ImpossibleInstanceofExample {

    public String showBug() {
        Object obj = new Integer(10);
        boolean result = obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF) 
        return Boolean.toString(result);

        // Mutated code
        Object z = new Integer(20);
        boolean y = z instanceof String;
        return Boolean.toString(y);
    }

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        System.out.println(example.showBug());

        // Mutated code
        ImpossibleInstanceofExample x = new ImpossibleInstanceofExample();
        System.out.println(x.showBug());
    }
}