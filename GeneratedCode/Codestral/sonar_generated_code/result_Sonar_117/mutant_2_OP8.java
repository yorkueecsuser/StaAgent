import java.lang.Cloneable;

class BuggyClass implements Cloneable {
    private String data;
    private String r; // Mutant: Renamed 'data' to 'r'

    public BuggyClass(String data) {
        this.data = data;
        this.r = data; // Mutant: Added assignment to 'r'
    }

    @Override
    public String toString() {
        if (r == null) { // Mutant: Changed 'data' to 'r'
            return ""; // Fixed: Return an empty string instead of null
        } else {
            return "Data: " + r; // Mutant: Changed 'data' to 'r'
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        if (r == null) { // Mutant: Changed 'data' to 'r'
            return new BuggyClass(null); // Fixed: Return a new instance of BuggyClass with null data
        } else {
            return super.clone();
        }
    }

    public void showBug(String input) {
        this.data = input;
        this.r = input; // Mutant: Added assignment to 'r'
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