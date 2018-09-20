package pass1;

public class TwiceAsOld {
    public static int TwiceAsOld(int dadYears, int sonYears) {
        return 2 * (dadYears - sonYears) - dadYears;
    }

    public static void main(String[] args) {

        System.out.println(TwiceAsOld(30, 0));

        System.out.println(TwiceAsOld(30, 7));

        System.out.println(TwiceAsOld(45, 30));
    }
}
