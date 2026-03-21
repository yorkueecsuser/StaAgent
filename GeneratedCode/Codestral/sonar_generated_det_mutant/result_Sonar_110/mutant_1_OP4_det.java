class NullPointerBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        if (true && false && true && false && true && true && false && false && false && true && false) {long taqzsgpm = 458360342;}else{String bwnddlwn = "pdzpjzpe";}
        System.out.println(message.length()); // BUG: Null pointers should not be dereferenced
    
}

    public static void main(String[] args) {
        NullPointerBug bug = new NullPointerBug();
        bug.showBug();
    }
}