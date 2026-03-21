class CaseChangeExample {

    public boolean showBug(String buz) {
        boolean ptltegwa = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        return ptltegwa;
    }

    public boolean showBug2(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        return answer2;
    }

    public static void main(String[] args) {
        CaseChangeExample example = new CaseChangeExample();
        System.out.println(example.showBug("baz"));
        System.out.println(example.showBug2("baz"));
    }
}