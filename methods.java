
public class methods
{
    public methods() {
    }

    /* palindrome checker*/ 
    public static String checkPalindrome(String input){
        String s = input.toLowerCase();
        String nonLetters = " !@#$%^&*(),.:;[]{}";
        String cleaned = new String();
        String result = "";
        for(int i = 0; i< s.length(); i ++){
            String a = input.substring(i,i+1);
            if(!nonLetters.contains(a) && s != " "){
                cleaned += input.substring(i,i+1);
            }
        }
        int r = cleaned.length()-1;
        for (int l = 0; l< cleaned.length(); l++){
            if (cleaned.charAt(l) != cleaned.charAt(r)) {
                result =  "The input is not a palindrome";
            } else  result = "The input is a palindrome";
            r --;

        }
        return result;
    }

    /* pig latin*/
    public static String breakSentence(String str) {
        int x = 0;
        String result = "";
        for(int i =0; str.length()>i; i++){
            String s = str.substring(i,i+1);
            if (s.equals(" ")){
                x = i;
            }
        }
        if (x < 0) {
            System.out.print(pigLatin(str));
            str = "";
        } else {
            String a = str.substring(0,x);
            result = pigLatin(a) + " ";
            str = str.substring(x+1);
        }
        return result;
        /* plug result into pigLatin method to obtain full answer */
    }

    public static String pigLatin(String str) {
        String answer ="";
        if (str.length()>2){
            String s = str.substring(1);
            String pig = "ay";
            String x = str.substring(0,1);
            answer= x + s + pig;
        } else if (str.length() < 3){
            answer+=str;
        } 
        return answer;
    }

    /* Strictly ascending numbers*/

    public static boolean ascending(int n) {
        int x = n % 10;
        n /= 10;
        while (n > 0) {
            int a = n % 10;
            if (a >= x){
                return false;
            } 
            x = a;
            n /= 10;
        }
        return true;
    }

    public static int counter(int small, int big) {
        int c = 0;
        for (int i = small; i <= big; i++) {
            if (ascending(i)) {
                c++;
            }
        }
        return c; // c is the answer
    }

    /* times tables */
    public static int counterA(int num) {
        int c = 0;
        for (int i = num; i != 0; i /= 10) {
            c++;
        }
        return c;
    }

    public static void timesTable(int n) {
        int max = counterA(n*n);
        for (int i = 1; i <= n; i++) {
            int rows = (i - 1) / n + 1;
            int columns = (i - 1) % n + 1;
            int x = rows * columns;
            int result= counterA(x);

            for (int e = 0; e < max - result; e++) {
                System.out.print(" ");
            }
            System.out.print(x + " ");
            if (columns == n) {
                System.out.println();
            }
        }
    }
}

