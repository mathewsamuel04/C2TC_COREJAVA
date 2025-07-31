package instanceofinterface;

public class PhoneFactory {
	public static Jio createPhone1(String company) {
		if (company.equalsIgnoreCase("Samsung"))
			return new Samsung();
		else if (company.equalsIgnoreCase("Jio"))
			return new Jio();
		return null;
	

	//public static Phone createPhone(String company) {
		// TODO Auto-generated method stub
	//	return null;
	}

	public static Phone createPhone11(String company) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Phone createPhone(String company) {
		// TODO Auto-generated method stub
		return null;
	}

}
