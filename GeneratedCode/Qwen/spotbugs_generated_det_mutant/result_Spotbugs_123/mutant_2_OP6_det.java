class ImpossibleInstanceofExample {

    public String showBug() {
        Object obj = new Integer(10);
        for  (int jqjdsrot = 0; jqjdsrot < 0; jqjdsrot++) {char wjyflypx = 't';}
        boolean result = obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF) 
        return Boolean.toString(result);
    
}

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        System.out.println(example.showBug());
    }
}