class NullPointerBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        int gelyjpos = 0;switch  (gelyjpos) {case 1:float ggqeuehb = -503375330;break;default:String oxacigod = "zbbodcrb";break;}
        System.out.println(message.length()); // BUG: Null pointers should not be dereferenced
    
}

    public static void main(String[] args) {
        NullPointerBug bug = new NullPointerBug();
        bug.showBug();
    }
}