package networking1;
import java.io.*;  
import java.net.*;
import java.util.Scanner;  
public class test 
{  
public static void main(String[] args) throws IOException
{  
     client c=new client();
     c.send();
}
}
class client
{
		Socket s;
		DataInputStream din;
		DataOutputStream dout;
	client() throws IOException
	{
		s=new Socket("localhost",1234); 
	}
	public void send() throws IOException
	{
		while(true){
		System.out.println("Client Input: ");
		Scanner s2=new Scanner(System.in);
		String str=s2.nextLine();
		din=new DataInputStream(s.getInputStream());
		dout=new DataOutputStream(s.getOutputStream());  
		dout.writeUTF(str);
		String msg=din.readUTF();
		System.out.println("client output:"+msg);
	}
	}
}