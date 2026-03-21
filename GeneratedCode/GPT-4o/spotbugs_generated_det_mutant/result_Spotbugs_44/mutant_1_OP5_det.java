class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        int cpicurlf = 0;switch  (cpicurlf) {case 1:short rmyimkxb = -1521;break;default:String fvcetihp = "ojmkqipx";break;}
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    
}

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}