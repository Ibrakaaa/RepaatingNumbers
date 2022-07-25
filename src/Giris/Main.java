package Giris;
import java.util.Arrays;

public class Main {
    static boolean isRepeat(int[]arr, int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {7, 5, 88, 16, 5, 3, 7, 9, 56, 65, 66, 88,16};
        int[] nlist = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length;i++){
            for(int j =0;j<list.length;j++){
                if((i!=j) && (list[i]==list[j])){
                    if(!isRepeat(nlist,list[i])){
                        nlist[startIndex++] = list[i];
                    }
                    break;


                }
            }
        }
        for(int value : nlist){
            if((value!=0) && (value %2 != 1)){
                System.out.println(value);
            }
        }

    }
}
