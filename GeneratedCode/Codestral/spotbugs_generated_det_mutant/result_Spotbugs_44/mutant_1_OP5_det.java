class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        int owjxllnu = 0;switch  (owjxllnu) {case 1:String dwtkcgup = "vsqnbotk";break;default:float qccaqbzo = -294831859;break;}
        System.out.println(result);
    
}

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}