
public class FullTimeEmployee extends Employee {
	int workingHours;
	public int workingHours() {
		return workingHours;
	}
	public void setWorkingHours() {
		double salary;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		double salary=(WorkingHours)*(hourlyRate)*1.5;
		FullTimeEmployee f1=new FullTimeEmployee();
		f1.setName("Faraaz");
		System.out.println(f1.getName());
		f1.setHourlyRate(100);
		f1.setWorkingHours();
		System.out.println("salary"+salary);
		
		return 0;
	}

}
