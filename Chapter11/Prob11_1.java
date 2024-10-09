package Chapter11;

class RemoveBar {
    public static void main(String[] args) {
        String s1 = "990925-1012999";
        StringBuilder s2 = new StringBuilder("990925-1012999");

        s2.replace(6, 7, " ");
        System.out.println(s2.toString());

        String s3 = s1.substring(0, 6) + " " + s1.substring(7);

        System.out.println(s3);

    }
}

