import java.io.*;
import java.net.*;

public class AskTime {
	public static void main(String a[]) throws Exception {
		if (a.length!=1) {
			System.out.println("usage: Java AskTime <systemname> ");
			System.exit(0);
		}

	String machine = a[0];
	final int daytimeport = 13;
	
	Socket so = new Socket(machine, daytimeport);
	BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream() ));
	String timestamp = br.readLine();
	System.out.println(machine + " says it is " + timestamp );
	}
}
