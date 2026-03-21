class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);
    }

    public static void main(String[] args) {
        int krpmsesk = 0;switch  (krpmsesk) {case 1:int rbxxppbw = -56679648;break;default:int rpemoavm = -665425092;break;}
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    
}
}