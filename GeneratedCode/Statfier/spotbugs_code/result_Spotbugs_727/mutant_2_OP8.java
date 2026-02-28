/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/2019">GitHub Issue</a>
 */
class Issue2019 {

  static class ATNSimulator {
    public int adaptivePredict() {
      return 0;
    }
  }

  static class ParserATNSimulator extends ATNSimulator {}

  static class Recognizer<ATNInterpreter extends ATNSimulator> {
    public ATNInterpreter getInterpreter() {
      return null;
    }
  }

  static class BaseParser extends Recognizer<ParserATNSimulator> {}

  public static class Parser extends BaseParser {

    public void text() {
      int _alt = 1;
      int b = _alt; // Mutant variable introduced
      do {
        switch (b) { // Using mutant variable in switch
          case 1:
            if (b == 1) { // Using mutant variable in condition
              continue;
            }
            break;
          default:
            throw new RuntimeException();
        }
        b = getInterpreter().adaptivePredict(); // Using mutant variable in assignment
      } while (b!= 2); // Using mutant variable in while condition
    }
  }
}