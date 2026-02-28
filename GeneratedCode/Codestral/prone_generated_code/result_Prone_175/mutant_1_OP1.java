import java.util.Random;

class WrongOneofBug {

    enum BlahCase {
        FOO, BAR
    }

    class Blah {
        private BlahCase blahCase;
        private String foo;
        private String bar;

        public BlahCase getBlahCase() {
            return blahCase;
        }

        public String getFoo() {
            return foo;
        }

        public String getBar() {
            return bar;
        }

        public void setBlahCase(BlahCase blahCase) {
            this.blahCase = blahCase;
        }

        public void setFoo(String foo) {
            this.foo = foo;
        }

        public void setBar(String bar) {
            this.bar = bar;
        }
    }

    public Object showBug(Blah foo) {
        // Dead Store Mutation
        String deadStoreVariable = generateRandomString(8); // Generating a random string of 8 characters

        switch (foo.getBlahCase()) {
            case FOO:
                return foo.getFoo();
            case BAR:
                return foo.getFoo(); // BUG: WrongOneof, should be foo.getBar()
        }
        return null;
    }

    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();

        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(rnd.nextInt(characters.length())));
        }

        return result.toString();
    }
}