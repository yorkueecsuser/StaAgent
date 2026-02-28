class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        char c1 = 'a';
        char c2 = 'a';
        StringBuilder sb1 = new StringBuilder(c1);  // Duplication Mutation
        StringBuilder sb2 = new StringBuilder(c2);  // Duplication Mutation
        System.out.println(sb1.toString());
        System.out.println(sb2.toString());
    }
}