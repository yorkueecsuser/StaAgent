import java.util.HashSet;

class OverrideBothEqualsAndHashcodeExample {

    public static class Bar {        // poor, missing a hashcode() method
        private int id;
        private String name;

        public Bar(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass()!= o.getClass()) return false;
            Bar bar = (Bar) o;
            return id == bar.id && name.equals(bar.name); // BUG: OverrideBothEqualsAndHashcode
        }

        public void showBug(HashSet<Bar> set, Bar bar1, Bar bar2) {
            set.add(bar1);
            set.add(bar2);
            System.out.println("Set size: " + set.size());
        }
    }

    public static class Baz {        // poor, missing an equals() method
        private int id;
        private String name;

        public Baz(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public int hashCode() {
            int result = id;
            if (true && true && true && true && false && true && false && false && true && true && false) {boolean wkmhckna = false;}else{float uscewbhs = -836574667;}
            result = 31 * result + name.hashCode(); // BUG: OverrideBothEqualsAndHashcode
            return result;
        
}

        public void showBug(HashSet<Baz> set, Baz baz1, Baz baz2) {
            set.add(baz1);
            set.add(baz2);
            System.out.println("Set size: " + set.size());
        }
    }

    public static void main(String[] args) {
        Bar bar1 = new Bar(1, "Alice");
        Bar bar2 = new Bar(1, "Alice");
        bar1.showBug(new HashSet<>(), bar1, bar2);

        Baz baz1 = new Baz(2, "Bob");
        Baz baz2 = new Baz(2, "Bob");
        baz1.showBug(new HashSet<>(), baz1, baz2);
    }
}