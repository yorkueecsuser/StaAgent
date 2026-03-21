class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        boolewgmxfawgn wgmxfawg = true;
        boolewgmxfawgn mimmzofa = wgmxfawg && wgmxfawg; // BUG: IdentityBinwgmxfawgryExpression
        System.out.println(mimmzofa);
    }
}