
public class Project {
	
	//Main variables used by Project class default values of doubles changes to print our dashes easier in main method
	
	public String subject=null;
	public String studentId=null;
	public String studentNumber=null;
	public double mark1=Double.NaN;
	public double mark2=Double.NaN;
	public double mark3=Double.NaN;
	public double mark4=Double.NaN;
	public double mark5=Double.NaN;
	public double mark6=Double.NaN;
	public double total;
	
	//Removed default project constructor excepts no input
	public Project () {
	}
	// project constructor excepts name only
	public Project (String ID) {
		this.studentId = ID;
	}
	// project constructor excepts name and student number
	public Project (String ID, String Number) {
		
		this.studentId = ID;
		this.studentNumber=Number;
		
		
	}
	// project checks arks and assignes vallues appropriately
	public void Subject1 (double mark1) {
		if (mark1 < 0 || mark1 > 5) {
		this.mark1=Double.NaN;
		System.out.println("\n"
				+ "NOT A VALID MARK (Choose betwean 0-5)"
				+ "\n");
		}else {
			this.mark1 = mark1;
		}
	}
	public void Subject2 (double mark2) {
		if (mark2 < 0 || mark2 > 10) {
		this.mark2=Double.NaN;
		System.out.println("\n"
				+ "NOT A VALID MARK (Choose betwean 0-10)"
				+ "\n");
		}else {
			this.mark2 = mark2;
		}
	}
	public void Subject3 (double mark3) {
		if (mark3 < 0 || mark3 > 15) {
		this.mark3=Double.NaN;
		System.out.println("\n"
				+ "NOT A VALID MARK (Choose betwean 0-15)"
				+ "\n");
		}else {
			this.mark3 = mark3;
		}
	}
	public void Subject4 (double mark4) {
		if (mark4 < 0 || mark4 > 20) {
		this.mark4=Double.NaN;
		System.out.println("\n"
				+ "NOT A VALID MARK (Choose betwean 0-20)"
				+ "\n");
		}else {
			this.mark4 = mark4;
		}
	}
	public void Subject5 (double mark5) {
		if (mark5 < 0 || mark5 > 20) {
		this.mark5=Double.NaN;
		System.out.println("\n"
				+ "NOT A VALID MARK (Choose betwean 0-20)"
				+ "\n");
		}else {
			this.mark5 = mark5;
		}
	}
	public void Subject6 (double mark6) {
		if (mark6 < 0 || mark6 > 30) {
		this.mark6=Double.NaN;
		System.out.println("\n"
				+ "NOT A VALID MARK (Choose betwean 0-30)"
				+ "\n");
		}else {
			this.mark6 = mark6;
		}
	}
	// callculates the total converts back to int for a rounded mark
	public void Total () {
		this.total= (mark1+mark2+mark3+mark4+mark5+mark6);
		total= (int) this.total;
	}

}
