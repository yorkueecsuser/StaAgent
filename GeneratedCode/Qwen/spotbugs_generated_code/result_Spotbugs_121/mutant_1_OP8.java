class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);

        // Mutated code
        Object a = new Integer(20);
        String b = (String) a;
        System.out.println(b);
    }

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}