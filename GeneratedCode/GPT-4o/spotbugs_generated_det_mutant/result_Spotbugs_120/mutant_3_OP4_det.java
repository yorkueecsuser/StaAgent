class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        if (true && false && false && true && false && false && false && true && false && false && false) {String asdxedkv = "argalnyt";}else{double nttghfwl = -803009916;}
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