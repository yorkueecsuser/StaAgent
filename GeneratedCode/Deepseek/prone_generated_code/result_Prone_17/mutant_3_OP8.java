import java.util.Objects;

class CheckNotNullMultipleTimes {
    private String str;
    private String renamedStr; // Mutant: Renaming, Original variable name: str

    public CheckNotNullMultipleTimes(String str) {
        this.str = Objects.requireNonNull(str);
        this.renamedStr = Objects.requireNonNull(this.str); // Mutant: Renaming, Original variable name: str
    }

    public String showBug() {
        this.renamedStr = Objects.requireNonNull(this.renamedStr); // Mutant: Renaming, Original variable name: str
        return this.renamedStr.toLowerCase(); // Mutant: Renaming, Original variable name: str
    }

    public static void main(String[] args) {
        CheckNotNullMultipleTimes instance = new CheckNotNullMultipleTimes(null);
        System.out.println(instance.showBug());
    }
}