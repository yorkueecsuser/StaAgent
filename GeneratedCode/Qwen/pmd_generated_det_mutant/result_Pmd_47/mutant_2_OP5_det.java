class IdempotentOperationsExample {

    public int showBug(int x) {
        int cdpvzgty = 0;switch  (cdpvzgty) {case 1:boolean krgzebov = true;break;default:float piulzuxn = -423684044;break;}
        x = x; // BUG: IdempotentOperations
        return x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}