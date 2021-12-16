import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

class Main {
	public static void main(String args[]) throws ParseException {

		cutofDate();

	}

	public static void cutofDate() throws ParseException {
		SimpleDateFormat objSDF = new SimpleDateFormat("dd-MM-yyyy");
		// String currentdateWithoutTime="10-11-2021";
		String currentdateWithoutTime = objSDF.format(new Date());
		//System.out.println(currentdateWithoutTime);

		Date dt1 = objSDF.parse("20-11-2021");
		Date dt2 = objSDF.parse(currentdateWithoutTime);

		System.out.println("Date1 : " + objSDF.format(dt1));
		System.out.println("Date2 : " + objSDF.format(dt2));
		// compareTo method returns the value greater than 0 if this Date is
		// after the Date argument.
		if (dt1.compareTo(dt2) > 0) {
			System.out.println("Date 1 comes  after Date 2");
		}
		// compareTo method returns the value less than 0 if this Date is before
		// the Date argument;
		else if (dt1.compareTo(dt2) < 0) {
			System.out.println("Date 1 comes  before Date 2");
		}
		// compareTo method returns the value 0 if the argument Date is equal to
		// the second Date;
		else if (dt1.compareTo(dt2) == 0) {
			System.out.println("Both are same dates");
		}
	}
}