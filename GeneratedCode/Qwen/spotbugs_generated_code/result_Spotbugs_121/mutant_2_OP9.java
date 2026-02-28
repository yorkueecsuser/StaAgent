class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);

        // Added do-while loop that does not affect the existing code
        int i = 0;
        do {
            i++;
        } while (i < 1);
    }

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}