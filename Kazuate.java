import java.util.Scanner;

public class Kazuate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 73; // プログラマが設定する2桁の正の整数（例として73）
        int maxAttempts = 5;

        System.out.println("数あてゲームを開始します．2桁の正の整数を当ててください．（例：10〜99）");

        for (int i = 1; i <= maxAttempts; i++) {
            System.out.print(i + "回目の入力：");
            int guess;

            try {
                guess = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("数値を入力してください．");
                i--; // 回数をカウントしない
                continue;
            }

            if (guess < 10 || guess > 99) {
                System.out.println("2桁の正の整数を入力してください．");
                i--; // 回数をカウントしない
                continue;
            }

            if (guess == answer) {
                System.out.println("当たり！");
                return;
            } else {
                int diff = Math.abs(guess - answer);
                if (diff >= 20) {
                    System.out.println("差が20以上あります．");
                }
                if (guess < answer) {
                    System.out.println("設定された数より小さいです．");
                } else {
                    System.out.println("設定された数より大きいです．");
                }
            }
        }

        System.out.println("残念！正解は " + answer + " でした．");
        scanner.close();
    }
}
