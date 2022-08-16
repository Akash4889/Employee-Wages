package bridgelabz;

public class EmployeeUseCase5 {
        public static void main(String[] args){

            int wagePerHour=20;
            int fullTimeHour=8;
            int partTimeHour=4;
            int workingDays=20;
            int dailyWage=0;

            for (int day = 0; day < workingDays; day++){

                int employeeCheck = (int) (Math.random() * ((2 + 0) + 1));

                switch (employeeCheck){
                    case 1:
                        dailyWage = dailyWage + fullTimeHour * wagePerHour;
                        System.out.println("Employee is present full time: " + dailyWage);
                        break;

                    case 2:
                        dailyWage = dailyWage + partTimeHour * wagePerHour;
                        System.out.println("Employee is present part time: " + dailyWage);
                        break;

                    default:
                        System.out.println("No wages: " + dailyWage);
                }
                System.out.println("Total wage of month: " + dailyWage);
            }
        }
    }

