import java.util.Random;

class BuggyClass {
    private String name;

    public BuggyClass(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        BuggyClass buggyClass = (BuggyClass) obj;
        return name.equals(buggyClass.name);
    }

    public void showBug(BuggyClass other) {
        System.out.println("Equals method result: " + this.equals(other));

        // Mutant: Unreachable switch statement
        int value = new Random().nextInt(10);
        switch (value) {
            case 0:
                System.out.println("Unreachable code executed!");
                break;
        }

        System.out.println("Hashcode of this object: " + this.hashCode());
        System.out.println("Hashcode of other object: " + other.hashCode());
    }
}