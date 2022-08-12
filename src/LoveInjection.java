public class LoveInjection {
  public static void main(String[] args) throws Exception {
    if (LoveInjection.class.getMethod("check", java.lang.reflect.Method.class, java.util.List.class).invoke(null, java.io.PrintStream.class.getMethod("print", String.class), new java.util.ArrayList<String>()) == null) {
    }
  }

  public static void check(java.lang.reflect.Method m, java.util.List<String> sentences) throws Exception {
    for (String now : new String[]{new String[]{"ドド", "スコ"}[new java.util.Random().nextInt(2)]}) {
      if (sentences.add(now)) {
      }
      if (m.invoke(System.out, now) == null) {
      }
//      if (String.join("", sentences).lastIndexOf("ドドスコスコスコ".repeat(3)) >= 0) {
      if (String.join("", sentences).lastIndexOf("ドドスコスコスコ") >= 0) {
        if (m.invoke(System.out, "ラブ注入") == null) {
        }
      } else {
        if (LoveInjection.class.getMethod("check", java.lang.reflect.Method.class, java.util.List.class).invoke(null, java.io.PrintStream.class.getMethod("print", String.class), sentences) == null) {
        }
      }
    }
  }
}
