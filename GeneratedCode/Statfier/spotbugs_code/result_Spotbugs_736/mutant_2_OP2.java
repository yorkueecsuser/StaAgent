class Ideas_2010_10_12 {
  public static void main(String arg[]) {
    long a = 0xFFFFFFFFFFFFL;
    long a_duplicate = 0xFFFFFFFFFFFFL; // Duplicate of the assignment to 'a'

    int i = 0;
    int i_duplicate = 0; // Duplicate of the assignment to 'i'

    i += a;
    i += a; // Duplicate of the assignment to 'i' with 'a'

    for (i = 0; i < a; i++) System.err.println(i);
    for (i_duplicate = 0; i_duplicate < a_duplicate; i_duplicate++) System.err.println(i_duplicate); // Duplicate of the for loop
  }
}