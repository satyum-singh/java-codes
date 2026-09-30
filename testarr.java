public class testarr {
    public static void main(String[] args) {
        
        //  Declare and initialize an integer array with the values 45, 22, 89, 16, 90, and 33
        int[] numbers = {45, 22, 89, 16, 90, 33};

        //  Initialize min and max with the first element
        int min = numbers[0];
        int max = numbers[0];

        //  Use an enhanced for loop to find min and max
        for (int number : numbers)
          {
               if ( number < min){
                    min = number;
               }
               if ( number > max){
                    max = number;
               }
        }

        //  Print the smallest and largest numbers
        System.out.println("Smallest: "+ min);
        System.out.println("Largest: "+ max);
    }
}
