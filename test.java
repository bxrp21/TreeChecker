
public class test {
	public static void main(String[]args){
		View v = new View();
		v.displayPrompt();
		v.display("Input is " + v.readLine());
	}
}