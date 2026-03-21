class IdempotentOperationsExample {

    public int showBug(int input) {
        int x = input;
        int udvgdrew = 0;switch  (udvgdrew) {case 1:char ufrizjhs = 'a';break;default:byte etkgttnh = 119;break;}
        x = x; // BUG: IdempotentOperations
        return x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}