import java.util.Scanner;
public class SortingArray {
    public static void main(String args[]){
        System.out.println("Enter the elements to sort=");
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
             arr[i]=sc.nextInt();
        }
        int temp,i,j;
        for( i=0;i<5;i++){
            for( j=i+1;j<5;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted array=");
        for(i=0;i<5;i++){
            System.out.println(arr[i]);
        }

    }
}
