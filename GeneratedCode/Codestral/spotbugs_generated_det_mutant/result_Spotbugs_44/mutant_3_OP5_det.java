class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);
    }

    public static void main(String[] args) {
        int osjqsfnm = 0;switch  (osjqsfnm) {case 1:long ftdinouv = 448594942;break;default:boolean ossmxubn = false;break;}
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    
}
}