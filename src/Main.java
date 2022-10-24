import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        int[] massiv = new int[10];
        String word = "Java";
        System.out.println(word.replace("Java","Hello"));

    }



//    N8
//    public static void main(String[] args) {
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = input.nextInt();
//        }
//        System.out.println("Начальный массив: " + Arrays.toString(array) + ";");
//        System.out.printf("Отсортированный массив: %s;", sortArray(array));
//    }
//
//    public static String sortArray(int[] massiv) {
//        int safe;
//        boolean isSorted = false;
//        while (!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < massiv.length - 1; i++) {
//                if (massiv[i] < massiv[i + 1]) {
//                    isSorted = false;
//                    safe = massiv[i];
//                    massiv[i] = massiv[i + 1];
//                    massiv[i + 1] = safe;
//                }
//            }
//        }return Arrays.toString(massiv);
//    }


//    N6
//    public static void main(String[] args) {
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println(pow(array));
//    }
//
//    public static int pow(int[] massiv){
//        int counter = 0;
//        for (int i = 0; i < massiv.length; i++) {
//            counter = massiv[i] * 2;
//            System.out.printf("%d ",counter);
//        }return counter;
//    }

//    N5
//    public static void main(String[] args) {
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("Квадрат мин. элемента: "+name(array));
//    }
//    public static int name(int number1[]) {
//        int counter = number1[0];
//        for (int i = 0; i < number1.length; i++) {
//            counter = Math.min(number1[i],counter);
//        }
//        System.out.println("Минимальный элемент: "+counter);
//        return (int) Math.pow(counter,2);
//    }

//    N4
//    public static void print(int[] massiv){
//        int counter = 0;
//        int K = input.nextInt();
//        for (int i = 0; i < massiv.length; i++) {
//            if(K+1 == i){
//                break;
//            }else {
//                counter = counter + massiv[i];
//            }
//        }
//        System.out.println(counter);
//    }

//    N3
//    public static void repeat(int[] equal){
//        int number = input.nextInt();
//        int counter = 0;
//        for (int i = 0; i < equal.length; i++) {
//            if(number == equal[i]){
//                counter++;
//            }
//        }
//        System.out.println(counter);
//    }


//    N2
//    public static void over(int[] massiv){
//        for (int i = 0; i < massiv.length; i++) {
//            if(massiv[i] > 20 ){
//                System.out.printf("%d ",massiv[i]);
//            }
//        }
//    }

//    N1
//    public static void method(boolean[] trueElement ) {
//        int counter = 0;
//        for (int i = 0; i < trueElement.length; i++) {
//            if(trueElement[i] == true){
//                counter++;
//            }
//        }
//        System.out.println(counter);
//    }


//    public static void randomIndexFunc(String[] letters){
//        int randomIndex = random.nextInt(0,letters.length);
//        System.out.println(letters[randomIndex]);
//    }


//    public static void getNumbers(int number) {
//        int sum = 0;
//        for (int i = 1; i < number; i++) {
//            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
//                System.out.printf("%d ", i);
//                sum += i;
//            }
//        }
//        System.out.println("\nСумма = " + sum);
//    }
    }