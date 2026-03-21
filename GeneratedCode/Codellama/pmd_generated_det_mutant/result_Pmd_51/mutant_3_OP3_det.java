class JumbledIncrementer {
    public static void main(String[] args) {
        if (true && true && false && true && false && true && true && false && false && true && false) {short rodszmhy = 1642;}
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // BUG: JumbledIncrementer
        }
        System.out.println(sum);
    
}
}