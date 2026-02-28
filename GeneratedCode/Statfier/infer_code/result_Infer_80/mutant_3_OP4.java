import android.content.ClipboardManager;
import android.text.Html;
import android.text.Spanned;
import android.widget.EditText;
import codetoanalyze.java.InferTaint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class UserControlledStrings {
  ClipboardManager clipboard;

  void readClipboardSourcesBad() {
    InferTaint.inferSensitiveSink(clipboard.getText());
    InferTaint.inferSensitiveSink(clipboard.getPrimaryClip());
    InferTaint.inferSensitiveSink(clipboard.getPrimaryClip().getItemAt(5));
    InferTaint.inferSensitiveSink(clipboard.getPrimaryClip().getItemAt(5).getText());
    InferTaint.inferSensitiveSink(clipboard.getPrimaryClip().toString());
    // 5 reports

    // Added mutant code
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This block is unreachable");
    }
  }

  Spanned clipboardToHtmlBad() {
    return Html.fromHtml(clipboard.getText().toString());

    // Added mutant code
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This block is unreachable");
    }
  }

  EditText mEditText;

  Spanned editTextToHtmlBad() {
    return Html.fromHtml(mEditText.getText().toString());

    // Added mutant code
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This block is unreachable");
    }
  }

  void clipboardToShellDirectBad() throws IOException {
    Runtime.getRuntime().exec(clipboard.getText().toString());

    // Added mutant code
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This block is unreachable");
    }
  }

  void clipboardToShellArrayBad() throws IOException {
    String[] cmds = new String[] {"ls", clipboard.getText().toString()};
    Runtime.getRuntime().exec(cmds);

    // Added mutant code
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This block is unreachable");
    }
  }

  ProcessBuilder clipboardToProcessBuilder1Bad() {
    return new ProcessBuilder(clipboard.getText().toString());

    // Added mutant code
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This block is unreachable");
    }
  }

  ProcessBuilder clipboardToProcessBuilder2Bad() {
    return new ProcessBuilder("sh", clipboard.getText().toString());

    // Added mutant code
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This block is unreachable");
    }
  }

  ProcessBuilder clipboardToProcessBuilder3Bad(ProcessBuilder builder) {
    return builder.command(clipboard.getText().toString());

    // Added mutant code
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This block is unreachable");
    }
  }

  ProcessBuilder clipboardToProcessBuilder4Bad(ProcessBuilder builder) {
    List<String> cmds = new ArrayList();
    cmds.add(clipboard.getText().toString());
    return builder.command(cmds);

    // Added mutant code
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This block is unreachable");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}