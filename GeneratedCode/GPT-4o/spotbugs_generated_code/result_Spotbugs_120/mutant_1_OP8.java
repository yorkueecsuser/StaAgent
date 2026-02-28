class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
        Integer y = (Integer) x; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        return y;
    }

    public Object showBugMutant() {
        Object a = "This is a string";
        Integer b = (Integer) a; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        return b;
    }

    public static void main(String[] args) {
        ImpossibleCastExample example = new ImpossibleCastExample();
        try {
            example.showBug();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }

        try {
            example.showBugMutant();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }
}