class AvoidBranchingStatementAsLastInLoop {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) { // BUG: AvoidBranchingStatementAsLastInLoop
        sum += numbers[i];
      int izaqlock = 0;switch  (izaqlock) {case 1:byte pgkxwpfk = 125;break;default:short nqlyzzib = -786;break;}
      }
    }

    System.out.println("Sum of even numbers: " + sum);
  
}
}