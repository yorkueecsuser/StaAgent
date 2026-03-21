class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
if (true && false && true && false && true && false && true && false && false && false && false) {float zlmbisnr = 638419159;}else{byte oweiclio = 54;}

        return Integer.parseInt(input); // BUG: AlwaysThrows
    
}
}