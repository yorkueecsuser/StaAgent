class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        for  (int tkwunhwm = 0; tkwunhwm < 0; tkwunhwm++) {float kuzxocrf = 939098182;}
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