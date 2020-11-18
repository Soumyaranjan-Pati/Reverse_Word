package Rev_Word;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reverse_Word {

	public static void main(String[] args) throws IOException{
		
		String res="";
		/*String s="my name is Soumya";
		String[] arr=s.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			res=res+arr[i]+" ";
		}
		System.out.println(res);*/
		
		
		String filePath="/home/soumyaranjan/soumya/s.txt/p2_1.txt";
		String contents=null;
		String reverse="";
		contents=new String(Files.readAllBytes(Paths.get(filePath)));
		
		System.out.println("Before Split..............");
		System.out.println(contents);
		String[] arr=contents.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			reverse=reverse+arr[i]+" ";

		}
		System.out.println("After Reverse.......................");
		System.out.println(reverse);
		
		FileWriter fw=new FileWriter("/home/soumyaranjan/soumya/s.txt/p2_2.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(reverse);
		System.out.println("Progam finished.....");
		bw.close();
	}

}
