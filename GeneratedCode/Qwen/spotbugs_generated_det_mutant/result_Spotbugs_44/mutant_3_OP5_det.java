class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    public static void main(String[] args) {
        int omxinytg = 0;switch  (omxinytg) {case 1:long atclkmku = 875821535;break;default:char rebbxmko = 'l';break;}
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    
}
}