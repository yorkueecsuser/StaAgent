class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);

        // Mutated code
        Object x = new Integer(20);
        String y = (String) x; // This is another impossible downcast, but not the focus of the bug
        System.out.println(y);
    }

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();

        // Mutated code
        ImpossibleDowncastExample z = new ImpossibleDowncastExample();
        z.showBug();
    }
}