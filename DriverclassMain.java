
package sameerGradedAssignment1;

class DriverclassMain 
{
	public static void main(String ar[])
	{
		
		TechDepartment t1=new TechDepartment();
		AdminDepartment admin1=new AdminDepartment();
		SuperDepartment s1=new SuperDepartment();
		HrDepartment hr1=new HrDepartment();
		
		System.out.println(" Welcome to Admin Department");
		System.out.println(admin1.getTodaysWork());
		System.out.println(t1.getWorkDeadline());
		System.out.println(s1.isTodayAHoliday());
		System.out.println();
		
		System.out.println("Welcome to HR Department");
		System.out.println(hr1.doActivity());
		System.out.println(hr1.getTodaysWork());
		System.out.println(t1.getWorkDeadline());
		System.out.println(s1.isTodayAHoliday());
		System.out.println();
		
		System.out.println("Welcome to Tech Department");
		System.out.println(t1.getTodaysWork());
		System.out.println(t1.getWorkDeadline());		
		System.out.println(t1.getTechStackInformation());
		System.out.println(s1.isTodayAHoliday());		
		
		
	}
}
