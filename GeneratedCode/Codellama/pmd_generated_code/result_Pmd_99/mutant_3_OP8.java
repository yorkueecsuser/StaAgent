// BUG: AddEmptyString

class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        System.out.println(y);
    }
}

// Renaming: Renaming user-defined variables declared in a program. If there exist multiple variables, we randomly select one for the mutation. The new name of the variable will be in the form of [a-z].

class BuggyCode {
    public static void main(String[] args) {
        int a = 5;
        String b = "" + a;
        System.out.println(b);
    }
}