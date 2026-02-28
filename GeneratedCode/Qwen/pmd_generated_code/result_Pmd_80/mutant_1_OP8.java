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

        // Mutant 1: Renaming 'buz' to 'a' in showBug method
        String a = "baz";
        boolean c = a.toUpperCase().equals("BAZ");
        System.out.println(c);

        // Mutant 2: Renaming 'answer2' to 'b' in showBug2 method
        String d = "baz";
        boolean b = d.toUpperCase().equalsIgnoreCase("BAZ");
        System.out.println(b);
    }
}