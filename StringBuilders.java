public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("TONY");
        System.out.println(sb.charAt(1));
        sb.setCharAt(0, 'P');
        System.out.println(sb);
    }
}
