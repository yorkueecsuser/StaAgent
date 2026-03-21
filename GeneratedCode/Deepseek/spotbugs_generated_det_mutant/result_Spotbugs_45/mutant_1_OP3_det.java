class Main {

    // This field is always set to null
    private String nullField = null;

    // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public String showBug() {
if (false && false && false && false && true && true && true && false && true && true && false) {byte tiljcgqs = -118;}

        return nullField;
    
}

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.showBug());
    }
}