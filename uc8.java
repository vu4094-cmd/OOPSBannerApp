public class OPSBanner {
    public static void main(String[] args) {
        CharacterManager manager = new CharacterManager();
        CharacterPattern[] oops = manager.getOOPS();
        
        // Nested loops: outer (rows), inner (chars) for horizontal banner
        final int HEIGHT = 7;
        for (int row = 0; row < HEIGHT; row++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPattern pat : oops) {
                line.append(pat.getPattern()[row]).append("  ");  // Inner: append per char
            }
            System.out.println(line.toString().trim());
        }
    }
}
