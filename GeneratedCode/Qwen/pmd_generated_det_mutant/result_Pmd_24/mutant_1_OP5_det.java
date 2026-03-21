class CloneExample implements Cloneable {
    private int value;

    public CloneExample(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException { int ofvmnbqo = 0;switch  (ofvmnbqo) {case 1:long pzfvpmrx = -20405734;break;default:double yglnorlj = 138754425;break;}
 // BUG: CloneMethodMustBePublic
        return super.clone();
    
}

    public void showBug() {
        try {
            CloneExample cloned = (CloneExample) this.clone();
            System.out.println("Cloned value: " + cloned.value);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CloneExample example = new CloneExample(10);
        example.showBug();
    }
}