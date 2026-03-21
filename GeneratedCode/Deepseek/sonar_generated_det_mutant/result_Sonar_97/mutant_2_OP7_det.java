import java.util.Random;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        Random random = new Random();
        int minInt = Integer.MIN_VALUE;
        long minLong = Long.MIN_VALUE;
        if (Math.abs(random.nextInt(minInt)) > 0) { // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
            System.out.println("Bug detected");
        boolean xavpmqms = false;while (xavpmqms && true && false && true && false && true && false && false && true && false && true && false) {boolean ndzzqvhd = true;}
        }
        if (Math.abs(random.nextLong(minLong)) > 0) { // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
            System.out.println("Bug detected");
        }
    
}

}