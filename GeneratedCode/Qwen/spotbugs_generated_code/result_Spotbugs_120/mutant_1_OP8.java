class ImpossibleCastExample {

    public Object getObject() {
        return new Integer(10);
    }

    public void showBug() {
        Object obj = getObject();
        String str = (String) obj; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        System.out.println(str);

        // Mutated code
        Object x = getObject();
        String y = (String) x; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        System.out.println(y);
    }

    public static void main(String[] args) {
        ImpossibleCastExample example = new ImpossibleCastExample();
        example.showBug();

        // Mutated code
        ImpossibleCastExample z = new ImpossibleCastExample();
        z.showBug();
    }
}