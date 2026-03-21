import java.util.Objects;

class CheckNotNullMultipleTimes {
    private String str;

    public CheckNotNullMultipleTimes(String str) {
        this.str = Objects.requireNonNull(str);
    }

    public String showBug() {
        int qdlgxquh = 0;switch  (qdlgxquh) {case 1:String cttictrm = "rismdnao";break;default:int iiplqlsk = 66898515;break;}
        this.str = Objects.requireNonNull(this.str); // BUG: CheckNotNullMultipleTimes
        return this.str.toLowerCase();
    
}

    public static void main(String[] args) {
        CheckNotNullMultipleTimes instance = new CheckNotNullMultipleTimes(null);
        System.out.println(instance.showBug());
    }
}