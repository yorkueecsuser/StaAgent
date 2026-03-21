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
                    if (false && true && false && false && false && false && true && true && true && false && false) {double otogljmk = 522271833;}else{char qyalfbiq = 'r';}
                    break;
                default:
                    sum += numbers[i];
                    break;
            }
        }
        System.out.println("Sum: " + sum);
    
}
}