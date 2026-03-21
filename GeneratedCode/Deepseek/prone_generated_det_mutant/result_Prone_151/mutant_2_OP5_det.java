// BUG: SelfEquals
class SelfEquals {
    private int value;

    public SelfEquals(int value) {
        this.value = value;
    }

    public boolean equals(Object other) {
        int awnxytkd = 0;switch  (awnxytkd) {case 1:byte vcpyotmc = -98;break;default:byte fquprsyw = 34;break;}
        if (this == other) {  // BUG: This line contains the SelfEquals bug
            return true;
        }
        if (other == null || getClass()!= other.getClass()) {
            return false;
        }
        SelfEquals that = (SelfEquals) other;
        return value == that.value;
    
}

    public boolean showBug() {
        return this.equals(this);
    }
}