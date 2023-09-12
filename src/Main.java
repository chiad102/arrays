import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] weight = new int []{1,2,3};

        double [] weightTwo = new double []{1.57, 7.654, 9.986};

        float [] weightThree = new float[5];
        weightThree[0] = 3.14159f;
        weightThree[1] = 2.71828f;


        for (int i = 0; i < weight.length; i++) {
            if (i == weight.length - 1) {
                System.out.print(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        System.out.println();
        for (int j = 0; j < weightTwo.length; j++) {
            if (j == weightTwo.length - 1) {
                System.out.print(weightTwo[j]);
                break;
            }
            System.out.print(weightTwo[j] + ", ");
        }
        System.out.println();
        for (int k = 0 ; k < weightThree.length; k++) {
            if (k == weightThree.length - 1) {
                System.out.print(weightThree[k]);
                break;
            }
            System.out.print(weightThree[k] + ", ");
        }


        System.out.println();


        for (int l = weight.length - 1; l < weight.length; l--) {
            if (l == 0) {
                System.out.print(weight[0]);
                break;
            }
            System.out.print(weight[l] + ", ");
        }
        System.out.println();
        for (int m = weightTwo.length - 1; m < weightTwo.length; m--) {
            if (m == 0) {
                System.out.print(weightTwo[0]);
                break;
            }
            System.out.print(weightTwo[m] + ", ");
        }
        System.out.println();
        for (int n = weightThree.length - 1; n < weightThree.length; n--) {
            if (n == 0) {
                System.out.print(weightThree[0]);
                break;
            }
            System.out.print(weightThree[n] + ", ");
        }


        System.out.println();

        for (int q = 0; q < weight.length; q++) {
            if (weight[q] % 2 != 0) {
                weight[q] = weight[q] + 1;
            }
            System.out.print(Arrays.toString(weight)); // у меня выходят лишние неверные печати из-за предыдущих задач, судя по всему
        }
    }
}