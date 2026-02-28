class TransactionalBugExample {

    // BUG: Methods should not call same-class methods with incompatible "@Transactional" values
    public void methodA() {
        System.out.println("Executing methodA");
        methodB(); 
    }

    public void methodB() {
        System.out.println("Executing methodB");
    }

    public String showBug() {
        try {
            methodA();
        } catch (Exception e) {
            return e.getMessage();
        }
        return "No exception thrown";
    }

    public static void main(String[] args) {
        TransactionalBugExample example = new TransactionalBugExample();
        System.out.println(example.showBug());
    }
}