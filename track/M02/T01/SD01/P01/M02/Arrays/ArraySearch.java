package track.M02.T01.SD01.P01.M02.Arrays;

public class ArraySearch {
    void search(int[] ref, int key){
        boolean found = false;
        for (int i=0;i<=ref.length-1;i++){
            if(ref[i]==key){
                System.out.println("Element found at index: "+i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");

        }
    }
}
class Main{
    public static void main(String[]args){
        int arr[]={10,20,30,40,50};
        ArraySearch s=new ArraySearch();
        s.search(arr,30);
    }
}
