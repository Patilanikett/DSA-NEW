public class GenerateSubste {
  public static void Subste(String s, String current, int index) {
    if (index == s.length()) {
      System.out.println(current);
      return;
    }
    Subste(s, current, index + 1);
    Subste(s, current + s.charAt(index), index + 1);
  }

  public static void main(String[] args) {
    String s = "abc";
    Subste(s, "", 0);
  }
}
