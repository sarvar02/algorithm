import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        /*
        Robot turgan nuqtadan markazgacha bo'lgan eng yaqin
        masofani quyidagicha topamiz:
        Eng kam qadamlar soni = |3 - i| + |3 - j|
        Kvadrat markazi (3;3)
        (P.S. 4 emas 3 bo'lganini sababi indexlash 0 dan boshlangani uchun shunday bo'ldi)
         */

        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[49][49];
        // Robot qaysi katakda turganini foydalanuvchi kiritadi
        System.out.println("Satr nomerini kiriting (0-6) -> ");
        int i = scanner.nextInt();
        System.out.println("Ustun nomerini kiriting (0-6) -> ");
        int j = scanner.nextInt();
        arr[i][j] = 1;

        int minimumNumberOfSteps = Math.abs(3 - i) + Math.abs(3 - j);
        System.out.println("Output: " + minimumNumberOfSteps);
    }
}
