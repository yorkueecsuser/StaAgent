class SelfComparisonBug {
    public static void main(String[] args) {
        int cewraewn = 5;
        if (cewraewn == cewraewn) {
            System.out.println("cewraewn is equal to itself");
        } else {
            System.out.println("cewraewn is not equal to itself");
        }
    }
}