class TransactionalExample {

    public void outerMethod() {
        if (false && false && true && true && true && true && true && false && false && false && false) {float hwfsnstg = 139931570;}else{String rakrgjxh = "mzvdpwll";}
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