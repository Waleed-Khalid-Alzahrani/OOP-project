package myCV;

import java.util.ArrayList;
import java.util.Scanner;

public class Helper {
	// هنا ينحفظ اليوزر
	public static UserData userIn; 
	// هنا تنحفظ بيانات اليوزر
	public static ArrayList<UserData> UserDataList = new ArrayList<UserData>();
	// هنا تنحفظ بيانات السي في الخاص باليوزر
	public static ArrayList<CVdata> CVdataList = new ArrayList<CVdata>();

	// شاشة البداية
	public static void welcome() {
		System.out.println("----- welcome to myCV -----");
		// في حال مافي يوزر قبل
		if (Helper.UserDataList.isEmpty()) {
			System.out.println("please enter number one to create an account");
			Scanner scanner = new Scanner(System.in);
			String userC = scanner.nextLine();
			if (userC.equals("1")) {
				Helper.createAcount();
			} else {
				System.out.println("-----ERROR-----");
				Helper.welcome();
			}
		}
		// في حال كان في يوزر مسجل
		Scanner sn = new Scanner(System.in);
		System.out.println("1-create an account.\n2-log in.");
		System.out.print("the choice : ");
		String userChoice = sn.nextLine();
		if (userChoice.equals("1")) {
			Helper.createAcount();
		} else if (userChoice.equals("2")) {
			Helper.logIn();
		} else {
			System.out.println("-----ERROR-----\n");
			Helper.welcome();
		}
	}

	// هنا انشاء حساب جديد لليوزر وحفظ البيانات ال 4 فيه
	public static void createAcount() {
		Scanner sc = new Scanner(System.in);
		UserData ud = new UserData();
		System.out.println("----- new Account -----");
		System.out.println("please enter the next informations...");
		System.out.print("1-name: ");
		String name = sc.nextLine();
		System.out.print("2-email: ");
		String email = sc.nextLine();
		System.out.print("3-username: ");
		String username = sc.nextLine();
		System.out.print("4-password: ");
		String password = sc.nextLine();

		// هنا يتم حفظ بيانات اليوزر في لست خاص فيه 
		ud.setName(name);
		ud.setEmail(email);
		ud.setUsername(username);
		ud.setPassword(password);
		Helper.UserDataList.add(ud);
		System.out.println("----------");
		Helper.welcome();
	}

	// هنا يتم التاكد من معلومات اليوزر وادخاله للبرنامج
	public static void logIn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----- log in -----");
		System.out.println("please enter the next informations...");
		System.out.print("1-username: ");
		String username = sc.nextLine();
		System.out.print("2-password: ");
		String password = sc.nextLine();

		boolean doesUserIn = false;
		for (UserData udi : Helper.UserDataList) {
			if (udi.getUsername().equals(username) && udi.getPassword().equals(password)) {
				doesUserIn = true;
				System.out.println("Login SUCCSESSFULL ;)");
				Helper.userIn = udi;
				Helper.menu();
			}
		}
		if (!doesUserIn) {
			System.out.println("-----ERROR-----\n");
			Helper.logIn();
		}
	}

	// هنا الواجهة الرئيسية للبرنامج
	public static void menu() {
		System.out.println("----- myCV -----");
		System.out.println("please select a choice:\n---------- \n1-create new CV \n2-show all CVs \n3-log out");
		Scanner sc = new Scanner(System.in);
		String userchoice = sc.nextLine();
		if (userchoice.equals("1")) {
			CreateCV.CreateCV();
		} else if (userchoice.equals("2")) {
			Helper.ShowAllCV();
		} else if (userchoice.equals("3")) {
			Helper.LogOut();
		} else {
			System.out.println("Please select one of the choices...");
			Helper.menu();
		}
	}

	// تسجيل خروج اليوزر
	public static void LogOut() {
		Helper.userIn = null;
		System.out.println("--------------------");
		Helper.welcome();
	}

	// هنا يتم عرض السي فيز الي عند اليوزر
	public static void ShowAllCV() {
		System.out.println("----- Show CV -----");
		if (Helper.userIn == null) {
			System.out.println("ERROR");
		}
		System.out.println("Name     Age     Country     |Skills     |Experiences     |Degrees\n-----------------------------------------------------------------");
		for(CVdata D : Helper.CVdataList) {
			if (D.getUserData().equals(userIn)) {
				System.out.println(D.getName()+"     "+D.getAge()+"     "+D.getCountry()+"     "+"| "+D.getSkill1()+"     "+D.getSkill2()+"     "+D.getSkill3()+"     "+"| "+D.getExperience1()+"     "+D.getExperience2()+"     "+D.getExperience3()+"     "+"| "+D.getDegree1()+"     "+D.getDegree2()+"     "+D.getDegree3());
			}
		}
		Helper.menu();
	}
}
