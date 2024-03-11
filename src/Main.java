//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] weights = new int[]{1, 2, 3};
        double[] numbers = {1.57, 7.654, 9.986};
        int[] myNumbers = {12, 48, 98, 102, 312};
        //Задача 2
        for (int i = 0; i < weights.length; i++) {
            if (i == weights.length - 1) {
                System.out.println(weights[i]);
                break;
            }
            System.out.print(weights[i] + ", ");
        }

        System.out.println();


        for (int u = 0; u < numbers.length; u++) {
            if (u == numbers.length - 1) {
                System.out.println(numbers[u]);
                break;
            }
            System.out.print(numbers[u] + ", ");

        }

        System.out.println();

        for (int c = 0; c < myNumbers.length; c++) {
            if (c == myNumbers.length - 1) {
                System.out.println(myNumbers[c]);
                break;
            }
            System.out.print(myNumbers[c] + ", ");
        }

        System.out.println();

        //Задача 3
        for (int u = weights.length - 1; u >= 0; u--) {
            System.out.print(weights[u]);
            if (u != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int q = numbers.length - 1; q >= 0; q--) {
            System.out.print(numbers[q]);
            if (q != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int t = myNumbers.length - 1; t >=0; t--) {
            System.out.print(myNumbers[t]);
            if (t != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        //Задача 4
        for (int v = 0; v < weights.length; v++ ) {
            if (weights[v] % 2 != 0) {
                weights[v]++;
            }
            if (v!=0) {
                System.out.print(weights[v] + " ");
            }
        }
    }
}