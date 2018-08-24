public class Lesson14 {
    public static void main(String args[]){
        //Arrays
        //Type of storage which holds multiple variables of the same type

        //int[] myArray = new int[5];
        /*myArray[0] = 1;
        myArray[1] = 5;*/

        String numbers = "12353453451";
        int[] myNumbers = new int[numbers.length()];
        // | 1 | 2 | 3 | 5 | 3 | 4 | 5 |3 |4 |5 |1
        //   0   1   2   3 ..

        for(int i = 0; i< numbers.length(); i++){
            //System.out.println(numbers.charAt(i));
            //int temp = -1;

            //substring of the larger string, equal to a string that is 1 character in size
            //1235...
            //1
            //2
            //3
            //5 ....

            //Take the decimal values and subtract 48 from them, giving us their integer value.
            //temp = numbers.charAt(i) - 48;
            //myNumbers[i] = temp;


            myNumbers[i]= numbers.charAt(i) - 48;
        }

        /*for(int i= 0; i< myNumbers.length; i++){
            System.out.print(myNumbers[i]);
        }*/

        //Same as above
        for (int number : myNumbers){
            System.out.print(number);
        }


    }
}
