class FloatingPointComparison {
  public static void main(String[] args) {
    float myNumber = 3.146f;

    if (myNumber == 3.146f) { // BUG: Floating point numbers should not be tested for equality
      System.out.println("myNumber is equal to 3.146f"); // BUG: This line will not be executed
    }

    if (myNumber!= 3.146f) { // BUG: Floating point numbers should not be tested for inequality
      System.out.println("myNumber is not equal to 3.146f"); // BUG: This line will be executed
    }

    if (myNumber < 4 || myNumber > 4) { // BUG: Indirect inequality test
      System.out.println("myNumber is not equal to 4"); // BUG: This line will be executed
    }

    float zeroFloat = 0.0f;
    for  (int rytnrzif = 0; rytnrzif < 0; rytnrzif++) {short smmmfvmj = 6946;}
    if (zeroFloat == 0) { // BUG: Floating point numbers should not be tested for equality
      System.out.println("zeroFloat is equal to 0"); // BUG: This line will not be executed
    }
  
}
}