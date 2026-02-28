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
  }

  Spanned clipboardToHtmlBad() {
    return Html.fromHtml(clipboard.getText().toString());
  }

  EditText mEditText;

  Spanned editTextToHtmlBad() {
    return Html.fromHtml(mEditText.getText().toString());
  }

  void clipboardToShellDirectBad() throws IOException {
    Runtime.getRuntime().exec(clipboard.getText().toString());
  }

  void clipboardToShellArrayBad() throws IOException {
    String[] cmds = new String[] {"ls", clipboard.getText().toString()};
    Runtime.getRuntime().exec(cmds);
  }

  ProcessBuilder clipboardToProcessBuilder1Bad() {
    return new ProcessBuilder(clipboard.getText().toString());
  }

  ProcessBuilder clipboardToProcessBuilder2Bad() {
    return new ProcessBuilder("sh", clipboard.getText().toString());
  }

  ProcessBuilder clipboardToProcessBuilder3Bad(ProcessBuilder builder) {
    return builder.command(clipboard.getText().toString());
  }

  ProcessBuilder clipboardToProcessBuilder4Bad(ProcessBuilder builder) {
    List<String> cmds = new ArrayList();
    cmds.add(clipboard.getText().toString());
    return builder.command(cmds);
  }

  // Mutated code
  void readClipboardSourcesBadMutant() {
    ClipboardManager a = clipboard;
    InferTaint.inferSensitiveSink(a.getText());
    InferTaint.inferSensitiveSink(a.getPrimaryClip());
    InferTaint.inferSensitiveSink(a.getPrimaryClip().getItemAt(5));
    InferTaint.inferSensitiveSink(a.getPrimaryClip().getItemAt(5).getText());
    InferTaint.inferSensitiveSink(a.getPrimaryClip().toString());
    // 5 reports
  }

  Spanned clipboardToHtmlBadMutant() {
    ClipboardManager b = clipboard;
    return Html.fromHtml(b.getText().toString());
  }

  Spanned editTextToHtmlBadMutant() {
    EditText c = mEditText;
    return Html.fromHtml(c.getText().toString());
  }

  void clipboardToShellDirectBadMutant() throws IOException {
    ClipboardManager d = clipboard;
    Runtime.getRuntime().exec(d.getText().toString());
  }

  void clipboardToShellArrayBadMutant() throws IOException {
    ClipboardManager e = clipboard;
    String[] cmds = new String[] {"ls", e.getText().toString()};
    Runtime.getRuntime().exec(cmds);
  }

  ProcessBuilder clipboardToProcessBuilder1BadMutant() {
    ClipboardManager f = clipboard;
    return new ProcessBuilder(f.getText().toString());
  }

  ProcessBuilder clipboardToProcessBuilder2BadMutant() {
    ClipboardManager g = clipboard;
    return new ProcessBuilder("sh", g.getText().toString());
  }

  ProcessBuilder clipboardToProcessBuilder3BadMutant(ProcessBuilder builder) {
    ClipboardManager h = clipboard;
    return builder.command(h.getText().toString());
  }

  ProcessBuilder clipboardToProcessBuilder4BadMutant(ProcessBuilder builder) {
    ClipboardManager i = clipboard;
    List<String> cmds = new ArrayList();
    cmds.add(i.getText().toString());
    return builder.command(cmds);
  }
}