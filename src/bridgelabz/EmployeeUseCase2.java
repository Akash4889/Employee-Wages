package bridgelabz;

public class EmployeeUseCase2 {
    public static void main(String[] args){
        int empWagePerHour=20;
        int empFullTimeWage=8;
        int FullTime=0;

        double empCheck = Math.floor(Math.random() * 2) % 2;

        if (empCheck == FullTime) {

            int Salary = empWagePerHour * empFullTimeWage;

            System.out.println( "Salary= " + Salary );
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}
