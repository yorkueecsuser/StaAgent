class Main {

    // This field is always set to null
    private String nullField = null;

    // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public String showBug() {
int prgoqgtj = 0;switch  (prgoqgtj) {case 1:long xeqemman = -143765678;break;default:String zgerrcco = "xlvrimeh";break;}

        return nullField;
    
}

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.showBug());
    }
}