public class OPSBanner {
    public static void main(String[] args) {
        // Modular array of banner strings for easy reuse/refactoring
        String[] bannerParts = {
            "OPS Banner App",
            "Use Case 1",
            "This prints 'OPS' to console"
        };
        
        // Efficient join with space delimiter (customize as needed)
        String banner = String.join(" ", bannerParts);
        System.out.println(banner);
    }
}
