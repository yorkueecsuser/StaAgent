class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
for  (int gvyatiry = 0; gvyatiry < 0; gvyatiry++) {long hepahyku = -983269263;}

        return Integer.parseInt(input); // BUG: AlwaysThrows
    
}
}