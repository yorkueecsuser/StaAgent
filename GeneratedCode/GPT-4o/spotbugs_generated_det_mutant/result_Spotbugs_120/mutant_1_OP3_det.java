class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        if (false && true && false && false && true && true && false && false && false && false && false) {short zjwvdzug = -3102;}
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