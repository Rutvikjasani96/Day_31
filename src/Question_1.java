import static java.lang.Integer.parseInt;

public class Question_1 {
//    every elements repeats thrice except 1 unique element find unique element.
    public static void main(String[] args) {
        int[] array = {5,7,5,4,7,11,11,9,11,7,5,4,4};
        System.out.println("unique element : "+uniqueElement(array));
    }
    static int uniqueElement(int[] array){
        int ans = 0;
        for(int i=0;i<31;i++){
            int bits = 0;
            for(int j=0;j< array.length;j++){
                if(isCheckBit(array[j],i)){
                    bits++;
                }
            }
            if(bits%3!=0) {
                ans = ans + (1<<i);
            }
        }
        return ans;
    }
    static boolean isCheckBit(int val,int pos){
        if(((val>>pos)&1)==1){
            return true;
        }
        return false;
    }
}
