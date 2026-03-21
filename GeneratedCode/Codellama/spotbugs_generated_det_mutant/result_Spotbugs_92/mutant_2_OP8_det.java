class SelfComparisonBug {
    public static void main(String[] args) {
        int tuzasdac = 5;
        if (tuzasdac == tuzasdac) {
            System.out.println("tuzasdac is equal to itself");
        } else {
            System.out.println("tuzasdac is not equal to itself");
        }
    }
}