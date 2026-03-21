class AvoidBranchingStatementAsLastInLoop {
  public static void main(String[] args) {
    int rbmumzpx = 0;switch  (rbmumzpx) {case 1:double gxiognxl = -242403451;break;default:long xdggoles = 948136171;break;}
    int[] numbers = {1, 2, 3, 4, 5};
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) { // BUG: AvoidBranchingStatementAsLastInLoop
        sum += numbers[i];
      }
    }

    System.out.println("Sum of even numbers: " + sum);
  
}
}