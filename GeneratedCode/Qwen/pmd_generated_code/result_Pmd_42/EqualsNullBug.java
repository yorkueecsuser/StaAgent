class EqualsNullBug {

    public String showBug(String input) {
        if (input.equals(null)) { // BUG: EqualsNull
            return "Input is null";
        }
        return "Input is not null";
    }

    public String showBug(String x) {
        if (x.equals(null)) { // MUTANT: Renamed 'input' to 'x'
            return "Input is null";
        }
        return "Input is not null";
    }

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        System.out.println(example.showBug(null));
        System.out.println(example.showBug("Hello"));
    }
}