import java.util.Random;

class FinalizeBug {
    public void showBug() {
        System.gc(); // Force garbage collection to make sure finalize() is called
        Bar b = new Bar();

        // Dead Store Mutant:
        int deadStoreVariable = generateRandomNumber();

        try {
            b.finalize(); // BUG: AvoidCallingFinalize
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }

    private class Bar {
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("finalize() method called");
        }
    }
}