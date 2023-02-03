import java.io.*;
import java.net.*;

public class courriel {
	public static main(String args[]) throws IOException {
		Socket sock;
		DataInputStream dis;
		PrintStream ps;

		sock = new Socket("localhost", 25);
		dis = new DataInputStream( sock.getInputStream());
		ps = new PrintStream( sock.getOutputStream());

		ps.println("mail from: trelford");
		System.out.println( dis.readLine() );

		String Addressee = "linden";
		ps.println("rcpt to: " + Addressee );
		System.out.println( dis.readLine() );

		ps.println("data");
		System.out.println(" dis.readLine() );

		ps.println("This is the message\n that java sent");
		ps.println(".");
		System.out.println( dis.readLine() );

		ps.flush();
		sock.close();
	}
}
