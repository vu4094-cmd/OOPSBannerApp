public class OPSBanner {
    public static void main(String[] args) {
        // Compact: declare/init/populate array + join in single statement
        String banner = String.join("\n", new String[] {
            "OPS Banner App",
            "UC4 UC5: Array Init",
            "Compact declaration with String.join",
            "No separate populate steps"
        });
        
        // Enhanced loop traverses and prints (displays final structure)
        for (String line : banner.split("\n")) {
            System.out.println(line);
        }
    }
}
