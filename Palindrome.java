public class Palindrome {
    static int ope (int no) {
        int rev=0;
        while(no!=0){
            int rem= no%10;
            rev= rev*10+rem;
            no=no/10;
        }
        return rev;

    }
    public static void main(String[] args) {
        int rev=ope(121);
        if(rev==121)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
