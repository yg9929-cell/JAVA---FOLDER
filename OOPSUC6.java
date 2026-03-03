public class OOPSUC6 {
     // Method to build letter O
    static String[] buildO() {
        return new String[]{
                String.join("", " ", "*","*","*","*","*"," ", " "),
                String.join("", "*"," "," "," "," "," ","*"," "),
                String.join("", "*"," "," "," "," "," ","*"," "),
                String.join("", "*"," "," "," "," "," ","*"," "),
                String.join("", "*"," "," "," "," "," ","*"," "),
                String.join("", "*"," "," "," "," "," ","*"," "),
                String.join("", " ", "*","*","*","*","*"," ", " ")
        };
    }

    // Method to build letter P
    static String[] buildP() {
        return new String[]{
                String.join("", "*","*","*","*","*","*"," "," "),
                String.join("", "*"," "," "," "," "," ","*"," "),
                String.join("", "*"," "," "," "," "," ","*"," "),
                String.join("", "*","*","*","*","*","*"," "," "),
                String.join("", "*"," "," "," "," "," "," "," "),
                String.join("", "*"," "," "," "," "," "," "," "),
                String.join("", "*"," "," "," "," "," "," "," ")
        };
    }

    // Method to build letter S
    static String[] buildS() {
        return new String[]{
                String.join("", " ", "*","*","*","*","*","*"," "),
                String.join("", "*"," "," "," "," "," "," "," "),
                String.join("", "*"," "," "," "," "," "," "," "),
                String.join("", " ", "*","*","*","*","*"," "," "),
                String.join("", " "," "," "," "," "," ","*"," "),
                String.join("", " "," "," "," "," "," ","*"," "),
                String.join("", " ", "*","*","*","*","*","*"," ")
        };
    }

    public static void main(String[] args) {

        String[] o1 = buildO();
        String[] o2 = buildO();
        String[] p  = buildP();
        String[] s  = buildS();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = o1[i] + "  "
                      + o2[i] + "  "
                      + p[i]  + "  "
                      + s[i];
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}

