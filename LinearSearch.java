public class LinearSearch {
    public static int linearSearch(int [] numbers,int key){
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int [] numbers = {1,23,56,89,84,52};
        int key = 84;
        int result = linearSearch(numbers,key);
        if(result==-1){
            System.out.println("key not found");
        }
        else{
            System.out.println("ket is found at index = "+result);
        }
    }
}
