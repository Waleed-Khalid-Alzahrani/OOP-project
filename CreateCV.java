package myCV;
import java.util.Scanner;

// هنا يتم صناعة السي في لليوزر
public class CreateCV {

	public static void CreateCV() {
		// هنا يتم ادخال بيانات السيفي المطلوبه من اليوزر 
		Scanner ss = new Scanner(System.in);
		System.out.println("----- Create new CV -----");
		// هنا اليانات الاساسية لليوزر ,الاسم و العمر و الدولة
		System.out.print("please enter your full name : ");
		String name = ss.nextLine();
		System.out.println("-------------------");
		System.out.print("please enter your age : ");
		String age = ss.nextLine();
		System.out.println("-------------------");
		System.out.print("please enter your country : ");
		String country = ss.nextLine();
		System.out.println("-------------------");
		// هنا يطلب من اليوزر مهاراته الشخصية 
		System.out.print("please enter your first skill : ");
		String Skill1 = ss.nextLine();
		System.out.println("-------------------");
		System.out.print("please enter your second skill : ");
		String Skill2 = ss.nextLine();
		System.out.println("-------------------");
		System.out.print("please enter your third skill : ");
		String Skill3 = ss.nextLine();
		System.out.println("-------------------");
		// هنا يطلب من اليوزر اضافة خبراته السابقة 
		System.out.print("please enter your first Experience : ");
		String Experience1 = ss.nextLine();
		System.out.println("-------------------");
		System.out.print("please enter your second Experience : ");
		String Experience2 = ss.nextLine();
		System.out.println("-------------------");
		System.out.print("please enter your third Experience : ");
		String Experience3 = ss.nextLine();
		System.out.println("-------------------");
		// هنا يطلب من اليوزر شهاداته مثل : الشهادة الجامعية
		System.out.print("please enter your first Degree : ");
		String Degree1 = ss.nextLine();
		System.out.println("-------------------");
		System.out.print("please enter your second Degree : ");
		String Degree2 = ss.nextLine();
		System.out.println("-------------------");
		System.out.print("please enter your third Degree : ");
		String Degree3 = ss.nextLine();
		System.out.println("-------------------");
		
		// وهنا تسوي سيت لكل البيانات وحفظها في سيفي داتا لست 
		CVdata CVD = new CVdata();
		CVD.setName(name);
		CVD.setAge(age);
		CVD.setCountry(country);	
		CVD.setSkill1(Skill1);
		CVD.setSkill2(Skill2);
		CVD.setSkill3(Skill3);
		CVD.setExperience1(Experience1);
		CVD.setExperience2(Experience2);
		CVD.setExperience3(Experience3);
		CVD.setDegree1(Degree1);
		CVD.setDegree2(Degree2);
		CVD.setDegree3(Degree3);
		// هنا متغير سترنق اسمه يوزر داتا عشان ما تتلخبط بيانات اليوزر الحالي بغيره
		CVD.setUserData(Helper.userIn);
		Helper.CVdataList.add(CVD);
		Helper.menu();

}
}

