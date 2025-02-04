package two_DimensionalArray;

import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        twoDimensionalTask1();
        twoDimensionalTask2();
        twoDimensionalTask3();
        twoDimensionalTask4();
        twoDimensionalTask5();
        twoDimensionalTask6();
        twoDimensionalTask7();
        twoDimensionalTask8();
        twoDimensionalTask9();
        twoDimensionalTask10();
        twoDimensionalTask11();
        twoDimensionalTask12();
        twoDimensionalTask13();
        twoDimensionalTask14();
        twoDimensionalTask15();
        twoDimensionalTask16();
        twoDimensionalTask17();
    }

    //Вывести на экран матрицу m*n вида:
    //1, 2, 3, 4
    //5, 6, 7, 8
    //9,10,11,12
    private static void twoDimensionalTask1() {
        int nums[][] = new int[3][4];
        int numb = 0;
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                numb++;
                nums[index][index1] = numb;
            }
        }
        System.out.println("Task1: " + Arrays.deepToString(nums));
        System.out.println();
    }

    //Вывести на экран матрицу m*n вида: 
    //4, 3, 2, 1
    //8, 7, 6, 5,
    //12,11,10, 9
    private static void twoDimensionalTask2() {
        int nums[][] = new int[3][4];
        int numb = 1;
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = nums[0].length - 1; index1 >= 0; index1--) {
                nums[index][index1] = numb;
                numb++;
            }
        }
        System.out.println("Task2: " + Arrays.deepToString(nums));
        System.out.println();
    }

    //Вывести на экран матрицу m*n вида: 
    //1, 4, 7
    //2, 5, 8
    //3, 6, 9
    private static void twoDimensionalTask3() {
        int nums[][] = new int[3][3];
        int numb = 1;
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                nums[index1][index] = numb;
                numb++;
            }
        }
        System.out.println("Task3: " + Arrays.deepToString(nums));
        System.out.println();
    }

    //Вывести на экран матрицу m*n вида: 
    //9, 8, 7
    //6, 5, 4
    //3, 2, 1
    private static void twoDimensionalTask4() {
        int nums[][] = new int[3][3];
        int numb = 9;
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                nums[index][index1] = numb;
                numb--;
            }
        }
        System.out.println("Task4: " + Arrays.deepToString(nums));
        System.out.println();
    }

    //Вывести на экран матрицу m*n вида: 
    //12,11,10, 9
    //8, 7, 6, 5,
    //4, 3, 2, 1
    private static void twoDimensionalTask5() {
        int nums[][] = new int[3][4];
        int numb = 12;
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                nums[index][index1] = numb;
                numb--;
            }
        }
        System.out.println("Task5: " + Arrays.deepToString(nums));
        System.out.println();
    }

    //Дана матрица размера 3х3. Вывести на экран первый и последний столбцы.
    private static void twoDimensionalTask6() {
        int nums[][] = new int[3][4];
        int numb = 12;
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                numb = new Random().nextInt(0, 10);
                nums[index][index1] = numb;
            }
        }
        System.out.println("Task6: " + Arrays.deepToString(nums));
        System.out.print("Первый столбец: ");
        for (int index = 0; index < nums.length; index++) {
            System.out.print(nums[index][0] + " ");
        }
        System.out.println();
        System.out.print("Последний столбец: ");
        for (int index = 0; index < nums.length; index++) {
            System.out.print(nums[index][nums[0].length - 1] + " ");
        }
        System.out.println();
        System.out.println();
    }

    //Дана матрица размера 5x9. Найти суммы элементов всех ее четных столбцов.
    private static void twoDimensionalTask7() {
        int nums[][] = new int[5][9];
        int numsSumm[] = new int[nums.length];
        int summ = 0;
        int numb = 0;
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                numb = new Random().nextInt(0, 10);
                nums[index][index1] = numb;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 1; index1 < nums[0].length; index1 += 2) {
                summ += nums[index][index1];
            }
            numsSumm[index] = summ;
            summ = 0;
        }
        System.out.println("Task7: " + Arrays.deepToString(nums));
        System.out.println("Task7: " + Arrays.toString(numsSumm));
        System.out.println();
    }

    //Дана матрица размера 5x10. Найти минимальное значение в каждой строке.
    private static void twoDimensionalTask8() {
        int nums[][] = new int[5][10];
        int numsMIN[] = new int[nums.length];
        int min = Integer.MAX_VALUE;
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                nums[index][index1] = new Random().nextInt(0, 100);
            }
        }
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                if (min > nums[index][index1]) {
                    min = nums[index][index1];
                }
            }
            numsMIN[index] = min;
            min = Integer.MAX_VALUE;
        }
        System.out.println("Task8: " + Arrays.deepToString(nums));
        System.out.println("Task8: " + Arrays.toString(numsMIN));
        System.out.println();
    }

    //Дана матрица размера 5x10. Найти максимальное значение в каждом столбце.
    private static void twoDimensionalTask9() {
        int nums[][] = new int[5][10];
        int numsMAX[] = new int[nums.length];
        int max = Integer.MIN_VALUE;
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                nums[index][index1] = new Random().nextInt(0, 100);
            }
        }
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                if (max < nums[index][index1]) {
                    max = nums[index][index1];
                }
            }
            numsMAX[index] = max;
            max = Integer.MIN_VALUE;
        }
        System.out.println("Task9: " + Arrays.deepToString(nums));
        System.out.println("Task9: " + Arrays.toString(numsMAX));
        System.out.println();
    }

    //Дана матрица размера 5x10. Преобразовать матрицу, поменяв местами минимальный и максимальный элемент в каждой строке.
    private static void twoDimensionalTask10() {
        int nums[][] = new int[5][10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int indexMAX = 0;
        int indexMAX1 = 0;
        int indexMIN = 0;
        int indexMIN1 = 0;
        int z = 0;
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                nums[index][index1] = new Random().nextInt(0, 100);
            }
        }
        System.out.println("Task: 10 " + Arrays.deepToString(nums));
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                if (max < nums[index][index1]) {
                    max = nums[index][index1];
                    indexMAX = index;
                    indexMAX1 = index1;
                }
                if (min > nums[index][index1]) {
                    min = nums[index][index1];
                    indexMIN = index;
                    indexMIN1 = index1;
                }
            }
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            z = nums[indexMAX][indexMAX1];
            nums[indexMAX][indexMAX1] = nums[indexMIN][indexMIN1];
            nums[indexMIN][indexMIN1] = z;
        }
        System.out.println("Task 10: " + Arrays.deepToString(nums));
        System.out.println();
    }

    //Дана квадратная матрица порядка M. Найти сумму элементов ее главной диагонали. 
    private static void twoDimensionalTask11() {
        int nums[][] = new int[5][5];
        int summ = 0;
        int index2 = 0;
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                nums[index][index1] = new Random().nextInt(0, 100);
            }
        }
        for (int index = 0; index < nums.length; index++) {
            summ += nums[index][index2];
            index2++;
        }
        System.out.println("Task 11: " + Arrays.deepToString(nums));
        System.out.println("Task 11: " + summ);
        System.out.println();
    }

    //Дана квадратная матрица порядка M. Найти сумму элементов ее побочной диагонали.
    private static void twoDimensionalTask12() {
        int nums[][] = new int[5][5];
        int summ = 0;
        int index2 = 0;
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                nums[index][index1] = new Random().nextInt(0, 100);
            }
        }
        for (int index = nums.length - 1; index >= 0; index--) {
            summ += nums[index][index2];
            index2++;
        }
        System.out.println("Task 12: " + Arrays.deepToString(nums));
        System.out.println("Task 12: " + summ);
        System.out.println();
    }

    //Дана целочисленная матрица размера 5×5. Переставить местами 4 и 5 строку.
    private static void twoDimensionalTask13() {
        int nums[][] = new int[5][5];
        int string1 = 4;
        int string2 = 5;
        int z = 0;
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                nums[index][index1] = new Random().nextInt(0, 100);
            }
        }
        System.out.println("Task 13: " + Arrays.deepToString(nums));
        for (int index = 0; index < nums[0].length; index++) {
            z = nums[string1 - 1][index];
            nums[string1 - 1][index] = nums[string2 - 1][index];
            nums[string2 - 1][index] = z;
        }
        System.out.println("Task 13: " + Arrays.deepToString(nums));
        System.out.println();
    }

    //Дана квадратная матрица порядка M. Зеркально отразить ее элементы относительно горизонтальной оси симметрии матрицы.
    private static void twoDimensionalTask14() {
        int nums[][] = new int[5][6];
        int z = 0;
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                nums[index][index1] = new Random().nextInt(0, 100);
            }
        }
        System.out.println("Task: 14 " + Arrays.deepToString(nums));
        for (int indexStart = 0,
                indexFin = nums.length - 1; indexStart < (nums.length % 2 == 0 ? nums.length / 2 : (nums.length - 1) / 2); indexStart++, indexFin--) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                z = nums[indexStart][index1];
                nums[indexStart][index1] = nums[indexFin][index1];
                nums[indexFin][index1] = z;
            }
        }
        System.out.println("Task 14: " + Arrays.deepToString(nums));
        System.out.println();
    }

    //Дана целочисленная матрица размера MxN. Найти элемент, являющийся максимальным в своей строке и минимальным в своем столбце. Если такой элемент отсутствует, то вывести 0. 
    private static void twoDimensionalTask15() {
        int nums[][] = new int[3][3];
        nums[0][0] = 13;
        nums[0][1] = 5;
        nums[0][2] = 60;
        nums[1][0] = 8;
        nums[1][1] = 14;
        nums[1][2] = 30;
        nums[2][0] = 3;
        nums[2][1] = 5;
        nums[2][2] = 16;
        int min = 0;
        int max = Integer.MIN_VALUE;
        int indexMAX = 0;
        System.out.println("Task 15: " + Arrays.deepToString(nums));
        for (int index = 0; index < nums.length; index++) {
            max = Integer.MIN_VALUE;
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                if (max < nums[index][index1]) {
                    max = nums[index][index1];
                    indexMAX = index1;
                    min = max;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (min > nums[i][indexMAX]) {
                    min = nums[i][indexMAX];
                }
            }
            if (min == max) {
                System.out.println(max);
            }
        }
        System.out.println();
    }

    //Удалить строку матрицы, в которой количество нулей максимально.
    private static void twoDimensionalTask16() {
        int nums[][] = new int[5][5];
        int counts[] = new int[nums.length];
        int count = 0;
        int count1 = 1;
        int count2 = 0;
        int max0 = Integer.MIN_VALUE;
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                nums[index][index1] = new Random().nextInt(0, 3);
            }
        }
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                if (nums[index][index1] == 0) {
                    count++;
                }
            }
            counts[index] = count;
            count = 0;
        }
        System.out.println("Task 16: " + Arrays.deepToString(nums));
        System.out.println("Task 16: " + Arrays.toString(counts));
        for (int index = 0; index < counts.length; index++) {
            if (max0 < counts[index]) {
                max0 = counts[index];
            } else if (max0 == counts[index]) {
                count1++;
            }
        }
        int ind[] = new int[nums.length - count1];
        for (int index = 0, k = 0; index < counts.length; index++) {
            if (max0 > counts[index]) {
                ind[k] = index;
                k++;
            }
        }
        System.out.println("Task 16: " + Arrays.toString(ind));
        int nums1[][] = new int[nums.length - count1][nums[0].length];
        for (int index = 0; index < nums1.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                nums1[index][index1] = nums[ind[index]][index1];
            }
        }
        System.out.println("Task 16: " + Arrays.deepToString(nums1));
        System.out.println();
    }

    //В матрице удалить столбцы с максимальным и минимальным элементами матрицы, а затем на место первого добавить столбец из произведений элементов соответствующих строк. &
    private static void twoDimensionalTask17() {
        int nums[][] = new int[5][6];
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                nums[index][index1] = new Random().nextInt(0, 100);
            }
        }
        System.out.println("Task 14: " + Arrays.deepToString(nums));
        System.out.println();
    }
    //Повернуть матрицу 3х3 по часовой и против часовой стрелки.

}
