package vgu.dz.eleventh;

public class DeleteHTML {
    public static String deleteHTML(String htmlString) {
        StringBuilder result = new StringBuilder();
        boolean openS = true;
        for (int i = 0; i < htmlString.length() - 1; i++) {
            if (htmlString.charAt(i) == '<') {
                openS = false;
                continue;
            }
            if(htmlString.charAt(i) == '>') {
                openS = true;
                if(htmlString.charAt(i + 1) != '<' && htmlString.charAt(i + 1) != '>') result.append(" ");
                continue;
            }
            if (openS && htmlString.charAt(i) != '<' && htmlString.charAt(i) != '>') {
                result.append(htmlString.charAt(i));
            }
        }
        return result.toString();
    }
}
