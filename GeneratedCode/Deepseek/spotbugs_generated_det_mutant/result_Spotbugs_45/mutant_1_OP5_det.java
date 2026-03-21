class Main {

    // This field is always set to null
    private String nullField = null;

    // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public String showBug() {
int sbzmmqdg = 0;switch  (sbzmmqdg) {case 1:byte yagekvqv = 120;break;default:long imtikcao = 231174131;break;}

        return nullField;
    
}

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.showBug());
    }
}