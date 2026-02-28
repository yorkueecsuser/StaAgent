class ImpossibleCastExample {

    public Object getObject() {
        return new Integer(10);
    }

    public void showBug() {
        Object obj = getObject();
        
        // Added a loop that does not affect the existing functionality
        int i = 0;
        while (i < 1) {
            i++;
        }
        
        // Equivalent do-while loop
        int j = 0;
        do {
            j++;
        } while (j < 1);

        String str = (String) obj; // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
        System.out.println(str);
    }

    public static void main(String[] args) {
        ImpossibleCastExample example = new ImpossibleCastExample();
        example.showBug();
    }
}