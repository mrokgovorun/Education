package generator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        String chars = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
//        while (true) {
//            System.out.print(new Generator().getPassword(16, chars));
//            if(new BufferedReader(new InputStreamReader(System.in)).readLine().equals("q")){
//                break;
//            }
//        }
        int n = 5;
        System.out.println(factRec(n));
        System.out.println(factIter(n));
    }

    public static int factIter(int n) {
        if (n == 0) return 1;
        int result = n;
        n--;
        while (n > 0) {
            result = result * n;
            n--;
        }
        return result;
    }

    public static int factRec(int n) {
        if (n == 0)
            return 1;
        else
            return n * factRec(n - 1);
    }
}
