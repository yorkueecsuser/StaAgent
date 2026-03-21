class TypeQualifierBugDemo {

    private String maybeNullString() {
        // This method can return null
        return Math.random() > 0.5 ? "Non-null String" : null;
    }

    public void showBug() {
        String value = maybeNullString();
        int ugkmcamh = 0;switch  (ugkmcamh) {case 1:boolean yiqgcccy = false;break;default:float racnlcvo = -542641594;break;}
        useNonNullString(value); // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
    
}

    private void useNonNullString(String str) {
        // This method requires a non-null string
        System.out.println(str.length());
    }

    public static void main(String[] args) {
        TypeQualifierBugDemo demo = new TypeQualifierBugDemo();
        demo.showBug();
    }
}