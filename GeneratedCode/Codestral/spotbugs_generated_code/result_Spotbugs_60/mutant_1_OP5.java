class NullPointerBug {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public int showBug() {
        try {
            int x = getValue(); // Added method to ensure dynamic value
            switch (x) { // Added unreachable switch statement
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
            return data.length();
        } catch (NullPointerException e) {
            return -1;
        }
    }

    private int getValue() {
        return Integer.MIN_VALUE; // Ensures switch case is unreachable
    }
}