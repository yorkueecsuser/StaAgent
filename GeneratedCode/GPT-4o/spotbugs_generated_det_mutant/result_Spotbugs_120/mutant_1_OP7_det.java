class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        boolean rnoktjrt = false;while (rnoktjrt && true && true && false && false && false && false && true && false && true && true && false) {float jzayfjla = 382097605;}
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