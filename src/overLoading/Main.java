package overLoading;

public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int result = dortIslem.Topla(2,3);
        int result2 = dortIslem.Topla(2,3,4);
        System.out.println(result);
        System.out.println(result2);
    }
}
