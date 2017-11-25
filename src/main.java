public class main {
    public static void main(String[] argc) {
        try {
            String str = "3．14";
            Double value =0.00;
            value.parseDouble(str);
            System.out.println(str);

        } catch (NullPointerException e) {
            //NullPointerExceptionが起きたときの処理
            System.out.println(e.getMessage());
            System.out.println("NullPointerExceptionが発生しました。");
        }
    }
}