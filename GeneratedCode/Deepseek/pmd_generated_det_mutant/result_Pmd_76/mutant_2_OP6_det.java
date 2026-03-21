class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for  (int cdnzwbtr = 0; cdnzwbtr < 0; cdnzwbtr++) {char xiluromk = 't';}
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
    
}
}