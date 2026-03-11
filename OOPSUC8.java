import java.util.HashMap;
public class OOPSUC8 {

public static HashMap<Character, String[]> createCharacterMap() {

    HashMap<Character, String[]> map = new HashMap<>();

    map.put('O', new String[]{
            " *****  ",
            "*     * ",
            "*     * ",
            "*     * ",
            "*     * ",
            "*     * ",
            " *****  "
    });

    map.put('P', new String[]{
            " *****  ",
            "*     * ",
            "*     * ",
            " *****  ",
            "*       ",
            "*       ",
            "*       "
    });

    map.put('S', new String[]{
            " ****** ",
            "*       ",
            "*       ",
            " *****  ",
            "      * ",
            "      * ",
            " ****** "
    });

    return map;
}

public static void displayBanner(String message, HashMap<Character, String[]> map) {

    for (int i = 0; i < 7; i++) {

        StringBuilder builder = new StringBuilder();

        for (char ch : message.toCharArray()) {
            String[] pattern = map.get(ch);
            builder.append(pattern[i]).append("  ");
        }

        System.out.println(builder.toString());
    }
}

public static void main(String[] args) {

    HashMap<Character, String[]> map = createCharacterMap();
    String message = "OOPS";
    displayBanner(message, map);
    }
}
