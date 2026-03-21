class Main {

    // This field is always set to null
    private String nullField = null;

    // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public String showBug() {
boolean fkwodqla = false;while (fkwodqla && true && false && true && true && false && false && true && false && true && true && false) {byte yxertxzj = 26;}

        return nullField;
    
}

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.showBug());
    }
}