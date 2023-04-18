package homeWork.hw1;
/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих
массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое пользователь может
увидеть - RuntimeException, т.е. ваше*/
public class Task_3 {
    public static void main(String[] args) {
        int[] arrayOne = {2, 15, 18, 3, 6, 4};
        int[] arrayTwo = {6, 5, 9, 3, 1};

        if(!checkLength(arrayOne, arrayTwo)){
            throw  new RuntimeException("Массивы не равны");
        }
        else{
            int[]res = arrayDivision(arrayOne,arrayTwo);
            printArray(res);
        }
    }
    public static int[] arrayDivision(int[] arrOne, int[] arrTwo){
        int[] result = new int[arrOne.length];
        for (int i = 0; i < arrOne.length; i++){
            result[i] = arrOne[i] / arrTwo[i];
        }
        return result;
    }

    public static boolean checkLength(int[] arrOne, int[] arrTwo){
        return arrOne.length == arrTwo.length;
    }

    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.printf(j + " ");
        }
    }
}