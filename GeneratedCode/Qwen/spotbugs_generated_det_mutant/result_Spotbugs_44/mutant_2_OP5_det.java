class UnwrittenFieldExample {
    private String message;

    public void showBug() {
        System.out.println(message.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    public static void main(String[] args) {
        int chqqafgh = 0;switch  (chqqafgh) {case 1:long rzxapqzk = -147819386;break;default:short nlndftfp = -248;break;}
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    
}
}