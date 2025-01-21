package Assignment02;

public class Employee_Salary {
	int level;
    int basicPay;
    int boa;
    int bonus;
    
    //(basic+boa+bonus)-PF
    
    void setEmployeeDetails(int employeeLevel, int employeeBasicPay, int employeeBOA, int employeeBonus) {
    
        level = employeeLevel;
        basicPay = employeeBasicPay;
        boa = employeeBOA;
        bonus = employeeBonus;
    }
    void calculateTakeHomeSalary() {
    	//(basic+boa+bonus)-PF
        int grossSalary = basicPay + boa + bonus; 
        double pf = basicPay * 0.12;              
        double monthlygross = grossSalary - pf;  
        double yearlygross = monthlygross * 12;  
         
     
        double taxrate = 0;
        if (yearlygross <= 250000) {
        	taxrate = 0;
        }
        else if (yearlygross >= 250000 && yearlygross <= 500000) {
        	taxrate = 0.05;
        }
        else if (yearlygross >= 500000 && yearlygross <= 750000) {
        	taxrate = 0.10;
        }
        else if (yearlygross >= 750000 && yearlygross <= 1000000) {
        	taxrate = 0.15;
        }
        else if (yearlygross >= 1000000 && yearlygross <= 1250000) {
            	taxrate = 0.20;	
        }  
        else if (yearlygross >= 1250000 && yearlygross <= 1500000) {
        	taxrate = 0.25;	
       }
        else if (yearlygross >= 1500000 ) {
        	taxrate = 0.30;	
       }
        double yearlytax = 0;
        yearlytax =  yearlygross *taxrate;
        double monthlytax = yearlytax / 12; 
        
        // Take Home Salary
        double TakeHomeSalary = monthlygross - monthlytax; 

        System.out.println("The monthly take home salary of Employee Level" +level+ " : " +TakeHomeSalary);
    }
    public static void main(String[] args) {
    	
		Employee_Salary employee1 = new Employee_Salary();
		employee1.setEmployeeDetails(1, 7000, 5000, 2000);
		employee1.calculateTakeHomeSalary();

        Employee_Salary employee2 = new Employee_Salary();
        employee2.setEmployeeDetails(2, 10000, 7000, 2500);
        employee2.calculateTakeHomeSalary();

        Employee_Salary employee3 = new Employee_Salary();
        employee3.setEmployeeDetails(3, 12000, 9000, 3000);
        employee3.calculateTakeHomeSalary();

        Employee_Salary employee4 = new Employee_Salary();
        employee4.setEmployeeDetails(4, 15000, 10000, 3500);
        employee4.calculateTakeHomeSalary();
      	}


}

   