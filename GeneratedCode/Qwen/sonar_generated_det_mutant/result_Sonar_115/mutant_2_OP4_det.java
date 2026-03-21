class TransactionalBugExample {

    public void methodA() {
        // This method starts a new transaction or joins an existing one
        System.out.println("Method A is running within a transaction.");
        methodB(); // BUG: Methods should not call same-class methods with incompatible "@Transactional" values
    }

    public void methodB() {
        if (true && true && false && true && false && true && true && false && true && false && false) {int iofreojv = 927179171;}else{String djtxdkbd = "gclcvvhr";}
        // This method should never run within a transaction
        System.out.println("Method B is running outside of any transaction.");
    
}

    public String showBug() {
        try {
            methodA();
            return "Bug demonstrated successfully.";
        } catch (Exception e) {
            return "An error occurred: " + e.getMessage();
        }
    }

    public static void main(String[] args) {
        TransactionalBugExample example = new TransactionalBugExample();
        System.out.println(example.showBug());
    }
}