package networking1;
import java.io.*;  
import java.net.*;
import java.net.ServerSocket;
import java.util.Scanner;
public class testserver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		server s=new server();
		s.send();
	}
}
class server
{
	Socket s;
	ServerSocket ss;
	DataInputStream din;
	DataOutputStream dout;
	server() throws IOException
	{
		ss=new ServerSocket(1234);
	}
	public void send() throws IOException
	{
		while(true){
		System.out.println("Serverinput:");
		s=ss.accept();
		din=new DataInputStream(s.getInputStream());
		dout=new DataOutputStream(s.getOutputStream());
		String msg=din.readUTF();
		System.out.println("Server output="+msg);
		Scanner s2=new Scanner(System.in);
		String str=s2.nextLine();
		dout.writeUTF(str);
		}
	}
}
