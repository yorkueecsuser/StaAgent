class RandomCastBug {
public int showBug() {
    double rand = Math.random();
    int casted =(int)rand;
    casted =(int)rand;
    return casted;
}
}