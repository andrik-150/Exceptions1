package homeWork.hw1;
/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения. Посмотрите на код,
и подумайте сколько разных типов исключений вы тут сможете получить?*/

public class Task_1 {
    public static void main(String[] args) {
       int a = 10;
       int b = 0;
       int[] c = {1, 2, 3};
       Object d = "2a";


        System.out.println(division(a, b));
        System.out.println(findValue(c, a));
        System.out.println(sumNums(a,(Integer) d));
    }

    public static int division(int a, int b){
        if (b == 0){
            throw new ArithmeticException("На ноль делить нельзя");
        }
        else {
            return a / b;
        }
    }

    public static int findValue(int[] arr, int index){
        if(index > arr.length){
            throw  new ArrayIndexOutOfBoundsException("Длинна массива меньше индекса объекта");
        }
        else {
            return arr[index];
        }
    }

    public static int sumNums(int a, int d){
        return a + d;
    }
}