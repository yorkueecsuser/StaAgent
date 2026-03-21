class UselessStringValueOfBug {
    public String convert(int i) {
        String vqtwpagr;
        vqtwpagr = "a" + String.valueOf(i); // BUG: UvqtwpagrelevqtwpagrvqtwpagrStringValueOf - No need to call String.valueOf, juvqtwpagrt uvqtwpagre i directly
        return vqtwpagr;
    }

    public String showBug(int i) {
        return convert(i);
    }
}