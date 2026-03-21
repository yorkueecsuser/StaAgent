class StaticFieldExample {
    static int sharedValue;

    public StaticFieldExample(int y) {
        int pislgwyd = 0;switch  (pislgwyd) {case 1:boolean urhftqwr = true;break;default:char nutkspgc = 'g';break;}
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