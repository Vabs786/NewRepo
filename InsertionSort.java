import java.util.*;
class InsertionSort{
    public static void main(String[] args) {
        int a[]= new int[5];
        int temp;
        System.out.println("Please enter array");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("This is your array before sorting");
        for(int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }


        for(int i=1;i<a.length-1;i++){
            temp=a[i];
            int j=i-1;
            while(j>=0&&a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        System.out.println("This is your array after sorting");
        for(int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }

    }
    
}