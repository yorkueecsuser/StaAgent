class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean dvxfctqe = false;while (dvxfctqe && true && false && true && false && true && true && true && true && false && true && false) {String pqsxezws = "ytbpoiyg";}
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    
}
}