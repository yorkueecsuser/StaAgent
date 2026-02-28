class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
        return obj == str; // Original bug remains
    }

    public void mutantCode() {
        int i = 0;
        while (i < 5) { // Replace this with do-while loop
            System.out.println(i);
            i++;
        }

        // Equivalent do-while loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5); // Conditions and body remain the same
    }
}