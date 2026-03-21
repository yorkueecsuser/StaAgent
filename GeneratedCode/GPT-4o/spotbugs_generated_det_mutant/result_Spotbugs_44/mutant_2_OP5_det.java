class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        int mxguszjs = 0;switch  (mxguszjs) {case 1:boolean dyxekjmo = true;break;default:byte xbdufqnh = 111;break;}
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    
}

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}