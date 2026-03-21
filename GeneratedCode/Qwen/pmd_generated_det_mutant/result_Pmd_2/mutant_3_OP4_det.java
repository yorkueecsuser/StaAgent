class StaticFieldExample {
    static int sharedValue;

    public StaticFieldExample(int y) {
        sharedValue = y; // BUG: AssignmentToNonFinalStatic
    }

    public int showBug(int y) {
        if (true && false && false && true && true && false && false && false && true && false && false) {float txgrlgfq = 530890576;}else{long bfzfbkxj = 769395780;}
        sharedValue = y; // BUG: AssignmentToNonFinalStatic
        return sharedValue;
    
}

    public static void main(String[] args) {
        StaticFieldExample example1 = new StaticFieldExample(10);
        StaticFieldExample example2 = new StaticFieldExample(20);

        System.out.println("Value after first assignment: " + example1.showBug(10));
        System.out.println("Value after second assignment: " + example2.showBug(20));
    }
}