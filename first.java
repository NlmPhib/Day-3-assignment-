import java.util.Scanner;
class first{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if(num>0){
            System.out.println("The number is positive");    
        }
        else if(num<0){
            System.out.println("The number is negative");
        }
        return;
    }
}