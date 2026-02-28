class SelfComparisonExample {

    public int showBug(int z) { // Renamed 'input' to 'z'
        int localVar = z;
        if (localVar == localVar) { // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        SelfComparisonExample x = new SelfComparisonExample(); // Renamed 'example' to 'x'
        int y = x.showBug(10); // Renamed 'result' to 'y'
        System.out.println("Result of self comparison: " + y);
    }
}