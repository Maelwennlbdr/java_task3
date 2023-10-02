import java.util.Scanner;

public class List {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a list of numbers with underscore in between : ");
        String userString = input.next();

        float average = getAverage(userString);

        System.out.println("Your average is : "+average);

    }
    public static float getAverage(String userString){
        float average=0;

        String userArray[] = userString.split("_");
        int userArrayInt[] = new int[userArray.length];

        for (int i = 0; i < userArray.length; i++){
            userArrayInt[i] = Integer.parseInt(userArray[i]);
        }


        for (int i = 0; i < userArrayInt.length; i++){
            average+=userArrayInt[i];
        }
        average=average/userArray.length;
        
        return average;
    }
}
