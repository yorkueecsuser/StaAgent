class BugDemo {
    public static void main(String[] args) {
        int aieqxzxf = -5;
        int xfzuloss = 3;

        aieqxzxf =- xfzuloss;  // BUG: Non-existent operators like "=+" should not be used
        aieqxzxf =+ xfzuloss; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("aieqxzxf = " + aieqxzxf);
    }
}