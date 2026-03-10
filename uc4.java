public class OPSBanner {
    public static void main(String[] args) {
        // Centralized array for banner lines (easy to style or extend)
        String[] bannerLines = {
            "OPS Banner App",
            "Use Case 4: Array & Loops",
            "Efficient printing with loop traversal",
            "Replaces individual print statements"
        };
        
        // Loop to print each line (enhanced for-each for readability)
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
