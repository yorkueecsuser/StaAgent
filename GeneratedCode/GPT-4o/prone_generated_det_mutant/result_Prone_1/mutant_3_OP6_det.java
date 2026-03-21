class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
for  (int ueivrvmh = 0; ueivrvmh < 0; ueivrvmh++) {int odrgenpf = -588429952;}

        return Integer.parseInt(input); // BUG: AlwaysThrows
    
}
}