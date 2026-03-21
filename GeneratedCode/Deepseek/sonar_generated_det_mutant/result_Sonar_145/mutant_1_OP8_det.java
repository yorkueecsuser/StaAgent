class ArrayBugExample {
    public void showBug() {
        int[] wfzaobxt = {1, 2, 3};
        System.out.println(wfzaobxt.hashCode());  // BUG: "hashCode" and "toString" should not be called on wfzaobxt instances
        System.out.println(wfzaobxt.toString());  // BUG: "hashCode" and "toString" should not be called on wfzaobxt instances
    }
}