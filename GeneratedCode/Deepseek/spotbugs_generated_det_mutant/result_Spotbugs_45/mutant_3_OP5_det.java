class Main {

    // This field is always set to null
    private String nullField = null;

    // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public String showBug() {
int hnqedcmm = 0;switch  (hnqedcmm) {case 1:short xlfmmgqy = -2915;break;default:long wdujuzll = 271702079;break;}

        return nullField;
    
}

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.showBug());
    }
}