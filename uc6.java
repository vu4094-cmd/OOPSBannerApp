public class OPSBanner {
    public static void main(String[] args) {
        // Invoke helpers for each char (O, P, S) - modular & reusable
        char[] chars = {'O', 'P', 'S'};
        for (char ch : chars) {
            String[] lines = buildBannerLines(ch);
            String banner = createBanner(lines);
            printBanner(banner);
            System.out.println("---");  // Separator
        }
    }
    
    // Insert the three helper methods above here
}
