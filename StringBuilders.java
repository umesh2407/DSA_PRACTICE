public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("TONY");
        System.out.println(sb.charAt(1));
        // sb.setCharAt(0, 'P');
        // sb.delete(3,4);
        sb.append("S");
        sb.append("T");
        sb.append("A");
        sb.append("R");
        sb.append("K");

        System.out.println(sb);
    }
}
