class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        for  (int ssozwmcu = 0; ssozwmcu < 0; ssozwmcu++) {char mmvvbkzd = 'v';}
        Integer y = (Integer) x; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        return y;
    
}

    public static void main(String[] args) {
        ImpossibleCastExample example = new ImpossibleCastExample();
        try {
            example.showBug();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }
}