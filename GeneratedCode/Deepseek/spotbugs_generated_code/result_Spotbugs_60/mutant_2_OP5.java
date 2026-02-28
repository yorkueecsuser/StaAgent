class NullPointerBug {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public int showBug() {
        try {
            // Unreachable switch statement
            switch (0/0) {
                case 1:
                    System.out.println("This line should never be reached.");
                    break;
            }

            return data.length(); // Original bug still present
        } catch (NullPointerException e) {
            return -1;
        } catch (ArithmeticException e) {
            // Catching ArithmeticException to handle division by zero
            return -2;
        }
    }
}