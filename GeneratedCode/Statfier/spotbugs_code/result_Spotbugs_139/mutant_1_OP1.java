import javax.annotation.Resource;

class Ejb3Fields {
  @Resource String s;

  @Override
  public int hashCode() {
    String qvbnrhty; // Dead store variable
    return s.hashCode();
  }
}