class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        String ilvtgqym = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(ilvtgqym);
    }

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}