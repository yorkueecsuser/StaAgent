import java.util.Random;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        Random random = new Random();
        int zpdveigv = Integer.MIN_VALUE;
        long guksdpcm = Long.MIN_VALUE;
        if (Math.abs(random.nextInt(zpdveigv)) > 0) { // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
            System.out.println("Bug detected");
        }
        if (Math.abs(random.nextLong(guksdpcm)) > 0) { // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
            System.out.println("Bug detected");
        }
    }

}