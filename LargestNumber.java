public class LargestNumber {
    public static int largestNumber(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (largest < number) {
                largest = number;
            }

        }
        return largest;
    }
    public static void main(String[] args){
        int[] numbers={10,23,56,89,54,63};
        System.out.println("the largest number is ="+largestNumber(numbers));
    }
}

