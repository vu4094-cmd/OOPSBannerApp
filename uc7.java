import java.util.Map;
import java.util.HashMap;

public class CharacterManager {
    private Map<Character, CharacterPattern> patterns = new HashMap<>();
    
    public CharacterManager() {
        // Define simple ASCII patterns for O, P, S (7 lines each; customize as needed)
        patterns.put('O', new CharacterPattern('O', new String[]{
            "###", "###", "# #", "# #", "# #", "###", "###"
        }));
        patterns.put('P', new CharacterPattern('P', new String[]{
            "###", "# #", "###", "#  ", "#  ", "#  ", "#  "
        }));
        patterns.put('S', new CharacterPattern('S', new String[]{
            "###", "#  ", "###", "  #", "#  ", "###", "###"
        }));
    }
    
    public CharacterPattern[] getOOPS() {
        return new CharacterPattern[]{patterns.get('O'), patterns.get('O'), 
                                      patterns.get('P'), patterns.get('S')};
    }
}
