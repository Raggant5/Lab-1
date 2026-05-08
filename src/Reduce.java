public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int start_num = 100;

        while (start_num != 0) {
            if (start_num % 2 == 0) {
                start_num = start_num / 2;
            } else {
                start_num -= 1;
            }
            steps++;

        System.out.println(steps);
        }
    }
}
