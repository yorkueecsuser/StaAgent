class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        
        // Added do-while loop that iterates once
        int i = 0;
        do {
            String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
            System.out.println(str);
            i++;
        } while (i < 1);

        // Original code left intact
        // String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        // System.out.println(str);
    }

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}