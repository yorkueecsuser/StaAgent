class ImpossibleCastExample {

    public Object showBug() {
        Object x = "This is a string";
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

// Mutated Code with Renaming Operator
class ImpossibleCastExampleMutant {

    public Object showBug() {
        Object a = "This is a string";
        Integer b = (Integer) a; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        return b;
    }

    public static void main(String[] args) {
        ImpossibleCastExampleMutant c = new ImpossibleCastExampleMutant();
        try {
            c.showBug();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }
}