import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FormCreator {
	
	PrintWriter out; 
	
	protected FormCreator() throws IOException {
		out = new PrintWriter(new FileWriter("./Form.html"));
	}
	
	protected void printForm() {
		out.println("<!DOCTYPE html>\n" + 
				"<html lang=\"en\">\n" + 
				"\n" + 
				"<head>\n" + 
				"    <meta charset=\"UTF-8\">\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" + 
				"    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" + 
				"    <title>Self Patient Registration Module</title>\n" + 
				"</head>\n" + 
				"\n" + 
				"<body>\n" + 
				"    <form action=\"\">\n" + 
				"        First name:<br>\n" + 
				"        <input type=\"text\" name=\"firstname\">\n" + 
				"        <br>\n" + 
				"        Last name:<br>\n" + 
				"        <input type=\"text\" name=\"lastname\">\n" + 
				"        <br>\n" + 
				"        Date of Birth:<br>\n" + 
				"        <input type=\"date\" id=\"date-of-birth\" name=\"date-of-birth\" value=\"2018-07-22\" min=\"1918-01-01\" max=\"2018-12-31\">\n" + 
				"        <br>\n" + 
				"        Street Address:<br>\n" + 
				"        <input type=\"text\" name=\"lastname\">\n" + 
				"        <br>\n" + 
				"        City:<br>\n" + 
				"        <input type=\"text\" name=\"lastname\">\n" + 
				"        <br>\n" + 
				"        State:<br>\n" + 
				"        <input type=\"text\" name=\"lastname\">\n" + 
				"        <br>\n" + 
				"        Postal Code:<br>\n" + 
				"        <input type=\"text\" name=\"lastname\">\n" + 
				"        <br>\n" + 
				"        Health Card Number:<br>\n" + 
				"        <input type=\"text\" name=\"lastname\">\n" + 
				"        <br>\n" + 
				"        Cell Phone:<br>\n" + 
				"        <input type=\"text\" name=\"lastname\">\n" + 
				"        <br>\n" + 
				"        Email Address:<br>\n" + 
				"        <input type=\"text\" name=\"lastname\">\n" + 
				"        <br>\n" + 
				"        Race:<br>\n" + 
				"        <input type=\"text\" name=\"lastname\">\n" + 
				"        <br>\n" + 
				"        Family Doctor Name:<br>\n" + 
				"        <input type=\"text\" name=\"lastname\">\n" + 
				"        <br>\n" + 
				"        Family Doctor City:<br>\n" + 
				"        <input type=\"text\" name=\"lastname\">\n" + 
				"        <br>\n" + 
				"\n" + 
				"        <input type=\"submit\" value=\"Submit\">\n" + 
				"    </form>");
		
		//Printing triage questions here
		
		out.println("</body>\n" + 
				"\n" + 
				"</html>");
		out.close();
	}
	
}
