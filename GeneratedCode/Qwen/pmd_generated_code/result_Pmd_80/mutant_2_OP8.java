class CaseChangeExample {

    public boolean showBug(String buz) {
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        return answer1;
    }

    public boolean showBug2(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        return answer2;
    }

    public static void main(String[] args) {
        CaseChangeExample example = new CaseChangeExample();
        System.out.println(example.showBug("baz"));
        System.out.println(example.showBug2("baz"));

        // Mutant code
        String x = "baz";
        boolean c = x.toUpperCase().equals("BAZ");
        System.out.println(c);

        String y = "baz";
        boolean d = y.toUpperCase().equalsIgnoreCase("BAZ");
        System.out.println(d);
    }
}