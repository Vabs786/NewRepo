package Sorting;
import java.util.*;

public class BubbleSort {
    Scanner sc;
    public int a[]= new int[6];
    
    BubbleSort(){
       sc=new Scanner(System.in);
    }
    public void  array(){
        
        int i;
        System.out.println("Please enter value in array");
        for(i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
     
    }
    void printarray(){
        System.out.println("Printing Array before sorting");
        for (int i=0;i<a.length-1;i++){
            
            System.out.println(a[i]);
        }
    }
    void bubblesort(){
        int temp;
        for(int i=0;i<a.length-1;i++){ // this outer loop is for passes
            for(int j=0;j<a.length-1-i;j++){ 
                // this is for number of comparisons inside an array in one pass
                if(a[j]>a[j+1]){    
                    //a.length-1-i i minus isliye ker rahe hai kyuki pass -minus kerne k liye
                    
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=a[temp];
                }
            }
            
        }
    }
    public static void main(String[] args) {
        
        BubbleSort b = new BubbleSort();
        b.array();
        b.printarray();
        b.bubblesort();
        b.printarray();
    }
}
