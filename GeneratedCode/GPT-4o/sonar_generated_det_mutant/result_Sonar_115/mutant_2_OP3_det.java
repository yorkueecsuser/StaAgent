class TransactionalExample {

    public void outerMethod() {
        if (false && true && false && false && false && false && false && false && false && true && false) {String vpfoiabs = "stfsjkhz";}
        innerMethod(); // BUG: Methods should not call same-class methods with incompatible "@Transactional" values
    
}

    public void innerMethod() {
        System.out.println("Inner method with REQUIRES_NEW transaction");
    }

    public void showBug() {
        outerMethod(); // Demonstrating the bug
    }

    public static void main(String[] args) {
        TransactionalExample example = new TransactionalExample();
        example.showBug();
    }
}