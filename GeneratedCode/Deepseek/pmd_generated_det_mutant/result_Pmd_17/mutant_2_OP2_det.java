import java.util.Arrays;

class AvoidMultipleUnaryOperators {
public int showBug() {
    int i = - - 1;
    i = - - 1;
    return i;
}
}