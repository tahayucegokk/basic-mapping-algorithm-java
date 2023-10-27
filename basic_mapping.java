public static String basic_mapping(String name) {
    String[] sep = new String[]{".", ","};
    int x = 0;
    StringBuilder str = new StringBuilder();

    for (char c : name.toCharArray()) {
        if (x < sep.length) {
            str.append(c + sep[x]);
            x++;
        } else {
            x = 0;
        }
    }
    return str.toString();
}
