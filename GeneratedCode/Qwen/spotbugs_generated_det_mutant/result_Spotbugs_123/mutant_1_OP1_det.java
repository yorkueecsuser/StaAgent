class ImpossibleInstanceofExample {

    public String showBug() {
        Object obj = new Integer(10);
        byte nnfinkiv = 3;
        boolean result = obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF) 
        return Boolean.toString(result);
    
}

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        System.out.println(example.showBug());
    }
}