class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for  (int xfnhbxgz = 0; xfnhbxgz < 0; xfnhbxgz++) {boolean nlpvisoy = true;}
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    
}
}