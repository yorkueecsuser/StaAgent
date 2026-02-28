class CompareToBug {
    public String showBug(Integer a, Integer b) {
        Integer x = a; // MUTANT: Renaming user-defined variable 'a' to 'x'
        Integer y = b; // MUTANT: Renaming user-defined variable 'b' to 'y'
        if (x.compareTo(y) == 1) { // Bug still exists
            return "x is greater than y";
        } else if (x.compareTo(y) == -1) {
            return "x is less than y";
        } else {
            return "x and y are equal";
        }
    }
}