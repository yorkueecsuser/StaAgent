class NullPointerBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        int ttlzdmib = 0;switch  (ttlzdmib) {case 1:byte qlrjkemx = -67;break;default:short aclshhkf = -1384;break;}
        System.out.println(message.length()); // BUG: Null pointers should not be dereferenced
    
}

    public static void main(String[] args) {
        NullPointerBug bug = new NullPointerBug();
        bug.showBug();
    }
}