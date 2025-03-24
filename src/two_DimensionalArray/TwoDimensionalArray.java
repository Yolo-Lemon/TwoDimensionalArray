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
        twoDimensionalTask18();
        manyDimensionalTask1();
        navyFight();
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
        int nums[][] = new int[3][5];
        int numb = 1;
        for (int index = 0; index < nums[0].length; index++) {
            for (int index1 = 0; index1 < nums.length; index1++) {
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
        int nums[][] = new int[3][5];
        int numb = nums.length * nums[0].length;
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
        int numb = nums.length * nums[0].length;
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
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                nums[index][index1] = new Random().nextInt(0, 10);
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
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                nums[index][index1] = new Random().nextInt(0, 100);
            }
        }
        for (int index = 0; index < nums.length; index++) {
            summ += nums[index][index];
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
        int rowNum1 = 4;
        int rowNum2 = 5;
        int z = 0;
        for (int index = 0; index < nums.length; index++) {
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                nums[index][index1] = new Random().nextInt(0, 100);
            }
        }
        System.out.println("Task 13: " + Arrays.deepToString(nums));
        for (int index = 0; index < nums[0].length; index++) {
            z = nums[rowNum1 - 1][index];
            nums[rowNum1 - 1][index] = nums[rowNum2 - 1][index];
            nums[rowNum2 - 1][index] = z;
        }
        System.out.println("Task 13: " + Arrays.deepToString(nums));
        System.out.println();
    }

    //Дана квадратная матрица порядка M. Зеркально отразить ее элементы относительно горизонтальной оси симметрии матрицы.
    private static void twoDimensionalTask14() {
        int nums[][] = new int[5][5];
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
        int inexMaxCol = 0;
        System.out.println("Task 15: " + Arrays.deepToString(nums));
        for (int index = 0; index < nums.length; index++) {
            max = Integer.MIN_VALUE;
            for (int index1 = 0; index1 < nums[0].length; index1++) {
                if (max < nums[index][index1]) {
                    max = nums[index][index1];
                    inexMaxCol = index1;
                    min = max;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (min > nums[i][inexMaxCol]) {
                    min = nums[i][inexMaxCol];
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
        int sourceArr[][] = new int[5][5];
        int countZeroInRowArr[] = new int[sourceArr.length];
        int zeroCountInRow = 0;
        int doubleMaxCount = 0;
        int maxCountZeroInRow = Integer.MIN_VALUE;

        for (int rowIndex = 0; rowIndex < sourceArr.length; rowIndex++) {
            for (int colIndex = 0; colIndex < sourceArr[rowIndex].length; colIndex++) {
                sourceArr[rowIndex][colIndex] = new Random().nextInt(0, 3);
            }
        }

        for (int rowIndex = 0; rowIndex < sourceArr.length; rowIndex++) {
            zeroCountInRow = 0;

            for (int colIndex = 0; colIndex < sourceArr[rowIndex].length; colIndex++) {
                if (sourceArr[rowIndex][colIndex] == 0) {
                    zeroCountInRow++;
                }
            }
            countZeroInRowArr[rowIndex] = zeroCountInRow;

            if (maxCountZeroInRow < countZeroInRowArr[rowIndex]) {
                maxCountZeroInRow = countZeroInRowArr[rowIndex];
            }
        }

        System.out.println("Task 16: sourceArr= " + Arrays.deepToString(sourceArr));
        System.out.println("Task 16: countZeroInRowArr= " + Arrays.toString(countZeroInRowArr));
        System.out.println("Task 16: maxCountZeroInRow= " + maxCountZeroInRow);

        for (int index = 0; index < countZeroInRowArr.length; index++) {
            if (maxCountZeroInRow == countZeroInRowArr[index]) {
                doubleMaxCount++;
            }
        }

        System.out.println("Task 16: doubleMaxCount= " + doubleMaxCount);

        int rowIndexWithMaxZeroCountArr[] = new int[doubleMaxCount];

        for (int index = 0, k = 0; index < countZeroInRowArr.length; index++) {
            if (maxCountZeroInRow == countZeroInRowArr[index]) {
                rowIndexWithMaxZeroCountArr[k] = index;
                k++;
            }
        }

        System.out.println("Task 16: rowIndexWithMaxZeroCountArr= " + Arrays.toString(rowIndexWithMaxZeroCountArr));

        int resultArray[][] = new int[sourceArr.length - doubleMaxCount][sourceArr[0].length];

        for (int sourcIndex = 0, resIndex = 0; sourcIndex < sourceArr.length; sourcIndex++) {
            boolean skipIndex = false;

            for (int i = 0; i < rowIndexWithMaxZeroCountArr.length; i++) {
                if (sourcIndex == rowIndexWithMaxZeroCountArr[i]) {
                    skipIndex = true;
                    break;
                }
            }

            if (skipIndex) {
                continue;
            }

            resultArray[resIndex] = sourceArr[sourcIndex];
            resIndex++;
        }

        System.out.println("Task 16: resultArray= " + Arrays.deepToString(resultArray));
        System.out.println();
    }

    //В матрице удалить столбцы с максимальным и минимальным элементами матрицы, а затем на место первого добавить столбец из произведений элементов соответствующих строк. &
    private static void twoDimensionalTask17() {
        int sourceArr[][] = new int[5][5];
        int minColumnVal = Integer.MAX_VALUE;
        int maxColumnVal = Integer.MIN_VALUE;
        int minColumnIndex = 0;
        int maxColumnIndex = 0;
        int minRowIndex = 0;
        int maxRowIndex = 0;
        int minMaxEqualCounter = 0;
        int rowMultiplCounter = 0;

        for (int rowIndex = 0; rowIndex < sourceArr.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < sourceArr[0].length; columnIndex++) {
                sourceArr[rowIndex][columnIndex] = new Random().nextInt(0, 10);
            }
        }

        System.out.println("Task 17: sourceArr = " + Arrays.deepToString(sourceArr));

        for (int columnIndex = 0; columnIndex < sourceArr[0].length; columnIndex++) {
            for (int rowIndex = 0; rowIndex < sourceArr.length; rowIndex++) {
                if (minColumnVal > sourceArr[rowIndex][columnIndex]) {
                    minColumnVal = sourceArr[rowIndex][columnIndex];
                    minColumnIndex = columnIndex;
                    minRowIndex = rowIndex;
                }
                if (maxColumnVal < sourceArr[rowIndex][columnIndex]) {
                    maxColumnVal = sourceArr[rowIndex][columnIndex];
                    maxColumnIndex = columnIndex;
                    maxRowIndex = rowIndex;
                }
            }
        }

        System.out.println("Task 17: minColumnIndex = " + minColumnIndex);
        System.out.println("Task 17: minColumnVal = " + minColumnVal);
        System.out.println("Task 17: maxColumnIndex = " + maxColumnIndex);
        System.out.println("Task 17: maxColumnVal = " + maxColumnVal);

        for (int columnIndex = 0; columnIndex < sourceArr[0].length; columnIndex++) {
            for (int rowIndex = 0; rowIndex < sourceArr.length; rowIndex++) {
                if (sourceArr[rowIndex][columnIndex] == maxColumnVal || sourceArr[rowIndex][columnIndex] == minColumnVal) {
                    minMaxEqualCounter++;
                    break;
                }
            }
        }
        System.out.println("Task 17: minMaxEqualCounter = " + minMaxEqualCounter);

        int columnIndexForDelete[] = new int[minMaxEqualCounter];

        for (int columnIndex = 0, indexDel = 0; columnIndex < sourceArr[0].length; columnIndex++) {
            for (int rowIndex = 0; rowIndex < sourceArr.length; rowIndex++) {
                if (sourceArr[rowIndex][columnIndex] == minColumnVal || sourceArr[rowIndex][columnIndex] == maxColumnVal) {
                    columnIndexForDelete[indexDel] = columnIndex;
                    indexDel++;
                    break;
                }
            }
        }
        System.out.println("Task 17: columnIndexForDelete = " + Arrays.toString(columnIndexForDelete));

        for (int rowIndex = 0; rowIndex < sourceArr.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < sourceArr[0].length; columnIndex++) {
                if (sourceArr[rowIndex][columnIndex] == maxColumnVal || sourceArr[rowIndex][columnIndex] == minColumnVal) {
                    rowMultiplCounter++;
                }
            }
        }
        System.out.println("Task 17: rowMultiplCounter = " + rowMultiplCounter);

        int rowIndexForMultipl[] = new int[rowMultiplCounter];

        for (int rowIndex = 0, multiplIndex = 0; rowIndex < sourceArr.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < sourceArr[0].length; columnIndex++) {
                if (sourceArr[rowIndex][columnIndex] == minColumnVal || sourceArr[rowIndex][columnIndex] == maxColumnVal) {
                    rowIndexForMultipl[multiplIndex] = rowIndex;
                    multiplIndex++;
                }
            }
        }

        System.out.println("Task 17: rowIndexForMultipl = " + Arrays.toString(rowIndexForMultipl));

        int resultArr[][] = new int[sourceArr.length][sourceArr[0].length - minMaxEqualCounter + 1];

        for (int rowIndex = 0; rowIndex < sourceArr.length; rowIndex++) {
            int resultMultiple = 1;
            for (int multipIndex = 0; multipIndex < rowIndexForMultipl.length; multipIndex++) {
                resultMultiple *= sourceArr[rowIndexForMultipl[multipIndex]][rowIndex];
            }
            resultArr[rowIndex][0] = resultMultiple;
        }
        System.out.println("Task 17: resultArr = " + Arrays.deepToString(resultArr));

        for (int rowIndex = 0; rowIndex < sourceArr.length; rowIndex++) {
            for (int columnResultIndex = 1, columnSourceIndex = 0; columnResultIndex < resultArr[0].length; columnResultIndex++, columnSourceIndex++) {
                if (columnSourceIndex == maxColumnIndex || columnSourceIndex == minColumnIndex) {
                    columnResultIndex--;
                    continue;
                }
                resultArr[rowIndex][columnResultIndex] = sourceArr[rowIndex][columnSourceIndex];
            }
        }
        System.out.println("Task 17: resultArr = " + Arrays.deepToString(resultArr));
        System.out.println();
    }

    //Повернуть матрицу 3х3 по часовой и против часовой стрелки.
    private static void twoDimensionalTask18() {
        int array[][] = new int[3][3];

        for (int rowIndex = 0; rowIndex < array.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < array[0].length; columnIndex++) {
                array[rowIndex][columnIndex] = new Random().nextInt(0, 10);
            }
        }
        System.out.println("Task 18: array = " + Arrays.deepToString(array));

        int rollLeftArray[][] = new int[array.length][array[0].length];
        for (int rowIndex = 0, columnRollIndex = 0; rowIndex < array.length; rowIndex++, columnRollIndex++) {
            for (int columnIndex = 0, rollRowIndex = array.length - 1; columnIndex < array[0].length; columnIndex++, rollRowIndex--) {
                rollLeftArray[rollRowIndex][columnRollIndex] = array[rowIndex][columnIndex];
            }
        }
        System.out.println("Task 18: rollLeftArray = " + Arrays.deepToString(rollLeftArray));

        int rollRightArray[][] = new int[array.length][array[0].length];
        for (int rowIndex = 0, columnRollIndex = array.length - 1; rowIndex < array.length; rowIndex++, columnRollIndex--) {
            for (int columnIndex = 0, rollRowIndex = 0; columnIndex < array[0].length; columnIndex++, rollRowIndex++) {
                rollRightArray[rollRowIndex][columnRollIndex] = array[rowIndex][columnIndex];
            }
        }
        System.out.println("Task 18: rollRightArray = " + Arrays.deepToString(rollRightArray));
    }

    private static void manyDimensionalTask1() {
        int nums[][][] = new int[3][3][3];
        int numb = 0;
        for (int rowIndex = 0; rowIndex < nums.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < nums[0].length; columnIndex++) {
                for (int heightIndex = 0; heightIndex < nums[0][0].length; heightIndex++) {
                    nums[rowIndex][columnIndex][heightIndex] = new Random().nextInt(0, 10);
                }
            }
        }
        System.out.println("Task1/1: " + Arrays.deepToString(nums));
        System.out.println();
    }

    private static void navyFight() {
        int nums[][] = new int[10][10];
        int rowShip = 0;
        int columnShip = 0;
        for (int rowIndex = 0; rowIndex < nums.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < nums[0].length; columnIndex++) {
                nums[rowIndex][columnIndex] = 0;
            }
        }
        for (int shipCount = 0; shipCount < 10; shipCount++) {
            rowShip = new Random().nextInt(0, 9);
            columnShip = new Random().nextInt(0, 9);
            if (nums[rowShip][columnShip] == 0) {
                if (rowShip == 0 & columnShip == 0) {
                    if (nums[rowShip + 1][columnShip] == 0 & nums[rowShip + 1][columnShip + 1] == 0 & nums[rowShip][columnShip + 1] == 0) {
                        nums[rowShip][columnShip] = 1;
                    } else {
                        shipCount--;
                    }
                } else if (rowShip == 0 & columnShip != 0 & columnShip != 9) {
                    if (nums[rowShip + 1][columnShip] == 0 & nums[rowShip + 1][columnShip + 1] == 0 & nums[rowShip][columnShip + 1] == 0
                            & nums[rowShip][columnShip - 1] == 0 & nums[rowShip + 1][columnShip - 1] == 0) {
                        nums[rowShip][columnShip] = 1;
                    } else {
                        shipCount--;
                    }
                } else if (rowShip != 0 & columnShip != 0 & rowShip != 9 & columnShip != 9) {
                    if (nums[rowShip - 1][columnShip - 1] == 0 & nums[rowShip - 1][columnShip] == 0 & nums[rowShip - 1][columnShip + 1] == 0
                            & nums[rowShip][columnShip - 1] == 0 & nums[rowShip][columnShip + 1] == 0 & nums[rowShip + 1][columnShip - 1] == 0
                            & nums[rowShip + 1][columnShip] == 0 & nums[rowShip + 1][columnShip + 1] == 0) {
                        nums[rowShip][columnShip] = 1;
                    } else {
                        shipCount--;
                    }
                } else if (rowShip != 0 & rowShip != 9 & columnShip == 0) {
                    if (nums[rowShip - 1][columnShip] == 0 & nums[rowShip - 1][columnShip + 1] == 0 & nums[rowShip][columnShip + 1] == 0
                            & nums[rowShip + 1][columnShip] == 0 & nums[rowShip + 1][columnShip + 1] == 0) {
                        nums[rowShip][columnShip] = 1;
                    } else {
                        shipCount--;
                    }
                } else if (rowShip == 9 & columnShip == 0) {
                    if (nums[rowShip - 1][columnShip] == 0 & nums[rowShip - 1][columnShip + 1] == 0 & nums[rowShip][columnShip + 1] == 0) {
                        nums[rowShip][columnShip] = 1;
                    } else {
                        shipCount--;
                    }
                } else if (rowShip == 9 & columnShip != 0 & columnShip != 9) {
                    if (nums[rowShip][columnShip - 1] == 0 & nums[rowShip][columnShip + 1] == 0 & nums[rowShip - 1][columnShip - 1] == 0
                            & nums[rowShip - 1][columnShip] == 0 & nums[rowShip][columnShip + 1] == 0) {
                        nums[rowShip][columnShip] = 1;
                    } else {
                        shipCount--;
                    }
                } else if (rowShip == 9 & columnShip == 9) {
                    if (nums[rowShip][columnShip - 1] == 0 & nums[rowShip - 1][columnShip - 1] == 0 & nums[rowShip - 1][columnShip] == 0) {
                        nums[rowShip][columnShip] = 1;
                    } else {
                        shipCount--;
                    }
                } else if (rowShip == 0 & columnShip == 9) {
                    if (nums[rowShip][columnShip - 1] == 0 & nums[rowShip + 1][columnShip - 1] == 0 & nums[rowShip + 1][columnShip] == 0) {
                        nums[rowShip][columnShip] = 1;
                    } else {
                        shipCount--;
                    }
                } else if (columnShip == 9 & rowShip != 0 & rowShip != 9) {
                    if (nums[rowShip - 1][columnShip - 1] == 0 & nums[rowShip - 1][columnShip] == 0 & nums[rowShip][columnShip - 1] == 0
                            & nums[rowShip + 1][columnShip - 1] == 0 & nums[rowShip + 1][columnShip] == 0) {
                        nums[rowShip][columnShip] = 1;
                    } else {
                        shipCount--;
                    }
                }
            } else {
                shipCount--;
            }
        }
        System.out.println("navyFight: " + Arrays.deepToString(nums));
        System.out.println();
    }
}