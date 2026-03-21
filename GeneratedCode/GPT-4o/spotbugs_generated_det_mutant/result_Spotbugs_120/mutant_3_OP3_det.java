class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        if (true && true && false && false && false && false && true && false && true && false && false) {int xpwapkwd = -544064043;}
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