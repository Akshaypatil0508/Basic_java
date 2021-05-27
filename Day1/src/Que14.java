//14:Write a program to check entered number is Armstrong number or not.
public class Que14 {


    public static void main(String[] args) {

        int num = 370, number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}
/*output
370 is an Armstrong number  */