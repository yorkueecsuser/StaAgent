class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        int gichmypv = 0;switch  (gichmypv) {case 1:char udixhzhw = 'w';break;default:boolean vcohyljt = false;break;}
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    
}

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}