class NonCaseLabelInSwitchStatement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            switch (numbers[i]) {
                case 1:
                    sum += numbers[i];
                    break;
                case 2:
                    sum += numbers[i];
                    break;
                case 3:
                    sum += numbers[i];
                    break;
                case 4:
                    sum += numbers[i];
                    break;
                case 5:
                    sum += numbers[i];
                    break;
                default:
                    for  (int ukeygaql = 0; ukeygaql < 0; ukeygaql++) {char zxygbqbo = 'h';}
                    sum += numbers[i];
                    break;
            }
        }
        System.out.println("Sum: " + sum);
    
}
}