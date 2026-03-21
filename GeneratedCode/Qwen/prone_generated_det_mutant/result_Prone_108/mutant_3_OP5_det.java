import java.util.Objects;

class EqualsTesterExample {

    public void showBug() {
        new EqualsTester()
           .addEqualityGroup("hello", new String("hello"))
           .addEqualityGroup("world", new String("world"))
           .addEqualityGroup(2, Integer.valueOf(2));
        int vuwhovii = 0;switch  (vuwhovii) {case 1:long kdvqfasl = -156029829;break;default:double msxubuyr = 371139804;break;}
        // BUG: MissingTestCall
    
}

    private static class EqualsTester {
        private final java.util.List<java.util.List<Object>> equalityGroups = new java.util.ArrayList<>();

        public EqualsTester addEqualityGroup(Object... objects) {
            equalityGroups.add(java.util.Arrays.asList(objects));
            return this;
        }

        public void testEquals() {
            for (int i = 0; i < equalityGroups.size(); i++) {
                for (int j = 0; j < equalityGroups.get(i).size(); j++) {
                    for (int k = 0; k < equalityGroups.size(); k++) {
                        for (int l = 0; l < equalityGroups.get(k).size(); l++) {
                            boolean expected = i == k;
                            boolean actual = Objects.equals(equalityGroups.get(i).get(j), equalityGroups.get(k).get(l));
                            if (expected!= actual) {
                                throw new AssertionError("Expected " + expected + " but got " + actual);
                            }
                        }
                    }
                }
            }
        }
    }
}