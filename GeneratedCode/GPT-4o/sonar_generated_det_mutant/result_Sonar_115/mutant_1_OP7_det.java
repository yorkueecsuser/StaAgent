class TransactionalExample {

    public void outerMethod() {
        boolean acthuxiy = false;while (acthuxiy && true && false && true && true && false && false && false && false && false && false && false) {double tujeklza = 721504552;}
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