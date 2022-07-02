public class P2 {

    public static int numberOfZeroes(int n){
        return n < 5 ? 0 : 1;
    }

    public static void main(String[] args) {

        /* Tub sonlar ko'paytmasi eng ko'pi bilan 1 ta 0 bilan tugaydi chunki
        bu sonlar orasida 1 ta juft son va 1 ta 5 ga bo'linadigan son mavjud
         */
        System.out.println("Output: " + numberOfZeroes(10));

    }
}