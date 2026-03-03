public class OOPSUC7 {
    public class OOPSBannerApp {

    public static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize the character and its banner representation.
         * * @param character The character to represent.
         * @param pattern   An array of 7 strings representing the character's visual banner.
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * @return The character associated with this pattern.
         */
        public char getCharacter() {
            return character;
        }

        /**
         * @return The 7-line string array representing the banner pattern.
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        // Define patterns for 'O', 'P', and 'S'
        String[] patternO = {
                " ****** ",
                " *    * ",
                " *    * ",
                " *    * ",
                " *    * ",
                " *    * ",
                " ****** "
        };

        String[] patternP = {
                " *******",
                " *     *",
                " *     *",
                " *******",
                " *      ",
                " *      ",
                " *      "
        };

        String[] patternS = {
                " *****  ",
                " *      ",
                " *      ",
                " *****  ",
                "      * ",
                "      * ",
                " *****  "
        };

        // UC7: Using an Array of Objects to manage multiple characters
        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', patternO),
                new CharacterPatternMap('O', patternO),
                new CharacterPatternMap('P', patternP),
                new CharacterPatternMap('S', patternS)
        };

        displayBanner(patterns);
    }

    /**
     * Assembles and displays the banner by iterating through the character mappings.
     * Uses StringBuilder for efficient line construction.
     * * @param bannerItems Array of CharacterPatternMap objects to be displayed.
     */
    public static void displayBanner(CharacterPatternMap[] bannerItems) {
        int rows = 7; // Fixed height for our banner characters

        for (int i = 0; i < rows; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (CharacterPatternMap item : bannerItems) {
                // Append the specific row for the current character + spacing
                lineBuilder.append(item.getPattern()[i]).append(" ");
            }
            System.out.println(lineBuilder.toString());
        }
    }
}
}
