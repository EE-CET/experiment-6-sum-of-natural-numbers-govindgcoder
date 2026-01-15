import java.util.Scanner;

public class SumOfNaturalNumbers {

    // TODO: Create the method public static int NumberSum(int n) 👍
    // It should calculate and return the sum of first n natural numbers 


        // Inside main method
        // TODO: Read N using Scanner 👍
        // TODO: Call NumberSum(N) 👍
        // TODO: Print the result 👍
    
    public static int NumberSum(int n){
        int sum = 0;
        for(int i = 1; i<n+1; i++){
            sum+=i;
        }
        return sum;
    }
        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = NumberSum(N);
        System.out.print(res);
    }
    
    
}
