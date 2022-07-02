import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class P3 {

    public static void putToMap(Map<Character, Character> map, String str, String str_shifr){
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), str_shifr.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Character> map = new HashMap<>();

        String str1 = "robocontest", str1_shifr = "slcldlkepte";
        String str2 = "dasturchi", str2_shifr = "ottefsdef";
        String str3 = "shifrlash", str3_shifr = "tefysatte";
        String str4 = "abc", str4_shifr = "tcd";
        String str5 = "hello", str5_shifr = "epaal";
        String str6 = "kelajak", str6_shifr = "ppatotp";

        putToMap(map, str1, str1_shifr);
        putToMap(map, str2, str2_shifr);
        putToMap(map, str3, str3_shifr);
        putToMap(map, str4, str4_shifr);
        putToMap(map, str5, str5_shifr);
        putToMap(map, str6, str6_shifr);

        // foydalanuvchidan xabar qabul qilib olish
        String word = scanner.nextLine();

        // Bu xabarni String Builder orqali tez fursat ichida shifrlash
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            stringBuilder.append(map.get(word.charAt(i)));
        }
        // Foydalanuvchiga shifrlangan xabarni taqdim qilish
        System.out.println("Output: " + stringBuilder.toString());

    }
}

//        map.put('a', 't');
//        map.put('b', 'c');
//        map.put('c', 'd');
//        map.put('d', 'o');
//        map.put('e', 'p');
//        map.put('f', 'y');
//        map.put('g', '*');
//        map.put('h', 'e');
//        map.put('i', 'f');
//        map.put('j', 'o');
//        map.put('k', 'p');
//        map.put('l', 'a');
//        map.put('m', '*');
//        map.put('n', 'k');
//        map.put('o', 'l');
//        map.put('p', '*');
//        map.put('q', '*');
//        map.put('r', 's');
//        map.put('s', 't');
//        map.put('t', 'e');
//        map.put('u', 'f');
//        map.put('v', '*');