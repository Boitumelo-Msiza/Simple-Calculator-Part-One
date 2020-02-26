import java.util.ArrayList;
import java.util.Scanner;
public class Calculator {

    public static int sumAll(int... numbers) {

        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    public static int MultiplyAll(int... numbers) {

        int result = 1;
        for (int i = 0; i < numbers.length; i++) {
            result *= numbers[i];
        }
        return result;
    }
        public static void main (String[]args){

            Scanner scan = new Scanner(System.in);
            int input;

            ArrayList<Integer> numbers = new ArrayList<>();

            int count = 1;
            do{
                System.out.println("Enter number " + count);
                input = scan.nextInt();
                if(input!= 00){
                    numbers.add(input);
                }

                count++;

            }while (input!= 00);

            int[] array = new int[numbers.size()];

            for(int i = 0; i < array.length; i++){
                array[i] = numbers.get(i);
            }

            System.out.println("The sum is = "+ sumAll(array));

            System.out.println("The multiple is = "+ MultiplyAll(array));


        }

    }







