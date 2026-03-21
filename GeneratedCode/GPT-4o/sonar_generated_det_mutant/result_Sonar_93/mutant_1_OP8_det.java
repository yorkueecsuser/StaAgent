class OperatorMisuseExample {

    public int showBug() {
        int xheycucn = -5;
        int xdqjhybd = 3;

        xheycucn =- xdqjhybd;  // BUG: Non-existent operators like "=+" should not be used
        xheycucn =+ xdqjhybd;  // BUG: Non-existent operators like "=+" should not be used

        return xheycucn;
    }

    public static void main(String[] args) {
        OperatorMisuseExample example = new OperatorMisuseExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}