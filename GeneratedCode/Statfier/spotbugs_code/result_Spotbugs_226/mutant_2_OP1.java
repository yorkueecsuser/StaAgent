public interface Insecure {

  static final int[] CreditCardNumbers = new int[5];

  // Dead store mutation
  static final String abcdefgh = "unusedVariable";
}