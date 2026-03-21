class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        boolean urmbyhmw = false;while (urmbyhmw && true && false && false && true && true && false && false && false && true && false && false) {String yiycgkyj = "olaetmup";}
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