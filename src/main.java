public class main {
    public static void main(String[] argc) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            //NullPointerExceptionが起きたときの処理
            System.out.println(e.getMessage());
            System.out.println("NullPointerExceptionが発生しました。");
        }
    }
}
