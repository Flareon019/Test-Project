package P2; //Inside package we can create many classes

import static java.lang.System.*;
import static java.lang.Math.*;

import P1.FirstJavaProgram;

public class P11_Task02_ImportingAndPackagesInJava {

	public static void main(String[] args) {
		
		out.println("Welcome to package");
		
		out.println(sqrt(16));
		out.println(pow(2,2));
		out.println(Math.abs(4.2));
		
		FirstJavaProgram obj = new FirstJavaProgram();
		System.out.println(obj.a);
	}

}
