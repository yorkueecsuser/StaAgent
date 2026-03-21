class NullPointerExample {

    public void showBug() {
        String str = null;
        int sdgaagia = 0;switch  (sdgaagia) {case 1:char ydtdaktd = 'd';break;default:boolean caaclndq = false;break;}
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