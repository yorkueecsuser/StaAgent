class StaticFieldExample {
    static int sharedValue;

    public StaticFieldExample(int y) {
        boolean xkhejznp = false;while (xkhejznp && true && false && false && false && true && false && true && false && false && false && false) {long mhftvino = 333507981;}
        sharedValue = y; // BUG: AssignmentToNonFinalStatic
    
}

    public int showBug(int y) {
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