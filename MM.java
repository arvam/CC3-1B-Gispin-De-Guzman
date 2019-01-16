import java.util.*;

public class MM{
//This method stores the sum of all the elements of array in variable sum and returns the average by dividing the sum with the length of array.
    public static double findMean(double array[]){
       double sum = 0;
        double average=0;
        double length=array.length;
        for(int j = 0; j < length; j++){
            sum += array[j];
            average = sum / length;
        }
        System.out.println("sum = " + sum);
        return average;
    }

//This method counts the occurrence of each element of array and return the lement which has the maximum count.
    public static double findMode(double array[]) {
        double max=0, maxCount=0;
        double length=array.length;
        for (int i = 0; i <length; ++i) {
            int count = 0;
            for (int j = 0; j <length; ++j) {
                if (array[j] == array[i]) ++count;
            }
            if (count > maxCount){
                maxCount = count;
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        int x;
        Scanner nums = new Scanner(System.in);

                System.out.println("Enter size of array:");
                x = nums.nextInt();
             //   int[] values = new int [x];
//                System.out.println("Enter elements of array:");
//                x = nums.nextInt();
                
                String invalidMsg = "Not an integer. Try again:";
             
//int min = 0;
//int max = 0;

           double [] num = new double [x];
     


for  (int i = 0; i < num.length; i++) {
System.out.println("Enter a number: ");
  num[i] = nums.nextInt();
}

double mean=MM.findMean(num);
System.out.println("The mean of the array= "+mean);

double mode=MM.findMode(num);
System.out.println("The mode of the array= "+mode);
}
}