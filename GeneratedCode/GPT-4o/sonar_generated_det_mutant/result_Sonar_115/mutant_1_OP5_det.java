class TransactionalExample {

    public void outerMethod() {
        int xosnduwg = 0;switch  (xosnduwg) {case 1:String lcpcrmjf = "laimsqys";break;default:String qepalhoi = "ozhxkaws";break;}
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