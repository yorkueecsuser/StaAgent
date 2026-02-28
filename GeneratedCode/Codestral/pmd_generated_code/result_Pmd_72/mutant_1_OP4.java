class BuggyEJB {

    private static int CountA = 0;
    private static boolean unreachableCondition = false;

    public void incrementCount() {
        CountA++;
        if (unreachableCondition) {
          System.out.println("This line will never be executed.");
        } else {
          System.out.println("This line will always be executed.");
        }
    }

    public int showBug() {
        return CountA;
    }
}