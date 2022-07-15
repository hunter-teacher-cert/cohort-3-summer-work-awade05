public class BarGraph{
    public static void main(String[] args){
        int[] arr = new int[] {4,0,10,2};
        System.out.println(barGraphify(arr));
    }

    public static String barGraphify(int[] nums){
        //traverse the array to identify what numbers the array has
        //depending on the number in each element, it will determine the number of "=" that it should print
        String retStr = "";
        for(int i = 0; i < nums.length; i++){
            //we had to use .repeat(nums[i]) to indicate the number of times that we want to multiply "=" by
            retStr += i + ":" + "=".repeat(nums[i]);
            retStr +="\n";
        }
        return retStr;
    }
}