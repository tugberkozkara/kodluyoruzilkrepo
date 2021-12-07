public class Main {

    static String isPalindrome(int num){
        int reverse = 0;
        int temp = num;
        while(temp > 0){
            int remainder = temp % 10;
            reverse = reverse*10 + remainder;
            temp = temp / 10;
        }
        if(num == reverse) {
            return "True";
        }else{
            return "False";
        }
    }

    public static void main(String[] args) {
	isPalindrome(55);

    }
}
