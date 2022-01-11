package day26_CustomMethodsPractice;

public class RemoveElements1 {
                           //       {1,2,3,4}    ,  2
    public static int[] removeElement(int[] array, int index){
        int[] result = new int[array.length -1];  //1,2

        int j =0;
        for (int each:array) {
            if (each == array[index]){
                continue;  //skip
            }
            result[j++]= each;
        }
        return result;
    }
}
