class TransactionalExample {

    public void outerMethod() {
        int rvbicsji = 0;switch  (rvbicsji) {case 1:int ozzjnftz = 979743812;break;default:String nsmucrnj = "wzrovwee";break;}
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