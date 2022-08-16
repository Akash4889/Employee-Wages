package bridgelabz;

public class EmployeeUseCase1 {
    public static void main(String[] args){

        int IS_FULL_TIME=0;

        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_FULL_TIME)

            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}

