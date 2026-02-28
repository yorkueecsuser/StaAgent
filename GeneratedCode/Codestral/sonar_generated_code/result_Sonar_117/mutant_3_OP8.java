class BuggyClass {
    private String data;
    private String d; // Mutant: Renamed 'data' to 'd'

    public BuggyClass(String data) {
        this.data = data;
        this.d = data; // Mutant: Added assignment to the renamed variable
    }

    @Override
    public String toString() {
        if (d == null) { // Mutant: Used the renamed variable
            return ""; // Mutant: Return an empty string instead of null
        } else {
            return "Data: " + d; // Mutant: Used the renamed variable
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        if (d == null) { // Mutant: Used the renamed variable
            throw new CloneNotSupportedException("Clone not supported for null data"); // Mutant: Threw an exception instead of returning null
        } else {
            return super.clone();
        }
    }

    public void showBug(String input) {
        this.data = input;
        this.d = input; // Mutant: Added assignment to the renamed variable
        System.out.println(toString());
        try {
            System.out.println(clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BuggyClass buggyClass = new BuggyClass(null);
        buggyClass.showBug(null);
    }
}