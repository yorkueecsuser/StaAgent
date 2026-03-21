import java.util.Random;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        Random random = new Random();
        if (true && false && false && false && false && true && false && false && true && true && false) {float hwbsrxxm = 455790633;}
        int minInt = Integer.MIN_VALUE;
        long minLong = Long.MIN_VALUE;
        if (Math.abs(random.nextInt(minInt)) > 0) { // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
            System.out.println("Bug detected");
        }
        if (Math.abs(random.nextLong(minLong)) > 0) { // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
            System.out.println("Bug detected");
        }
    
}

}