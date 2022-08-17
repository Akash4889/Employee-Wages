package practiceday4;

public class Problem8 {
    public static void main(String[] args){

        int n=2021;
        //int year=0;

        if (n%4==0 || n%400==0 && n%100!=0)

        System.out.println("The year is a leap year");

        else

        System.out.println("Year is not leap year");
    }
}
