class CaseChangeExample {

    public boolean showBug(String buz) {
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        return answer1;
    }

    public boolean showBug2(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        return answer2;
    }

    // Mutated code for showBug method
    public boolean showBug(String x) {
        boolean y = x.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        return y;
    }

    // Mutated code for showBug2 method
    public boolean showBug2(String z) {
        boolean w = z.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        return w;
    }

    public static void main(String[] args) {
        CaseChangeExample example = new CaseChangeExample();
        System.out.println(example.showBug("baz"));
        System.out.println(example.showBug2("baz"));
        
        // Testing mutated methods
        System.out.println(example.showBug("baz"));
        System.out.println(example.showBug2("baz"));
    }
}