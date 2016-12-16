
public class Assignment4 {
	/*
	 * Handle NumberFormat Exception. For example the statement int
	 * num=Integer.parseInt ("XYZ"); would throw NumberFormatException because
	 * String XYZ cannot be parsed to int. So handle it
	 */
	public static void main(String[] args) {

		try {
			int num = Integer.parseInt("XYZ");
		} catch (NumberFormatException ex) {
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}catch (Exception e){  //catch all other exceptions.
			e.printStackTrace(); 
		}
	}

}
