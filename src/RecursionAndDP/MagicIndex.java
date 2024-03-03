package RecursionAndDP;

public class MagicIndex {

    public static void main(String args[]){
        int[] array = {1,1,3,4,5,6,7,8,9,10};
        System.out.println(checkMagicIndex(array));
        System.out.println(binarySearchMagicIndex(array, 0, array.length-1));
    }

    //Brute force
    public static boolean checkMagicIndex(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] == i) return true;
        }

        return false;
    }

    //optimal solution
    public static boolean binarySearchMagicIndex(int[] array, int start, int end){
        int mid = (int) (start+end)/2;
        int value = array[mid];

        if(end < start) return false;
        if(value == mid) return true;
        if(value > mid) return binarySearchMagicIndex(array, start, mid-1);
        else return binarySearchMagicIndex(array, mid+1, end);
    }
}
