import java.util.Scanner;
import java.io.*;

public class View implements ViewI {
	
	private Scanner scanner;
	private Writer writer;
	
	public View(){
		this(System.in,System.out);
	}
	public View(InputStream in, OutputStream out){
		scanner = new Scanner(in);
		writer = new PrintWriter(out);
	}
	
	public String readLine(){
		return scanner.nextLine();
	}
	
	public void display(Object o){
		try{
			System.out.println("Display took in "+o);
			if(!o.equals(null))
				writer.write(o.toString());
			else{
				writer.write(null+"\n");
				writer.flush();
			}
		}catch(Exception e){e.printStackTrace();}
	}
}
