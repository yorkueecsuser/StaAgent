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
        for  (int cpddmiqm = 0; cpddmiqm < 0; cpddmiqm++) {boolean ntwvsebr = false;}
        }
        if (Math.abs(random.nextLong(minLong)) > 0) { // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
            System.out.println("Bug detected");
        }
    
}

}