import java.util.Random;

class AlwaysTrueClass {
    private String value;

    public AlwaysTrueClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        return true;
    }

    public String getValue() {
        return value;
    }

    public void showBug(AlwaysTrueClass other) {
        if (this.equals(other)) {
            System.out.println("Bug demonstrated: Both objects are considered equal");
        }
    }

    public void deadStore() {
        Random random = new Random();
        String deadVariable = "";
        for (int i = 0; i < 8; i++) {
            deadVariable += (char) (random.nextInt(26) + 'a');
        }
        // Dead store: The variable 'deadVariable' is never used.
    }
}