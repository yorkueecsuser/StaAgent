class NullPointerExample {

    public void showBug() {
        String str = null;
        int svswrbsf = 0;switch  (svswrbsf) {case 1:long pzehnhif = -993501855;break;default:String aqcdrdgg = "idcnhhhy";break;}
        int length = str.length(); // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
    
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            example.showBug();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}