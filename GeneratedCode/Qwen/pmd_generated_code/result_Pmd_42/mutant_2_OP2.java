class EqualsNullBug {

    public String showBug(String input) {
        boolean isEqualToNull = input.equals(null); // Original line
        boolean isEqualToNullCopy = input.equals(null); // Duplicated line

        if (isEqualToNull) { // Using the original variable
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