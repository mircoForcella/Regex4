public class Regex4 {
    public static void main(String[] args) {
        String str = "x3z ? xYz ! R1 && __";
        String replaced = str.replaceAll("[a-z0-9]", "*");
        System.out.println(replaced);
    }
}
