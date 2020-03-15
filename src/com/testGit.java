package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class testGit {
	public static void main(String[] args) {
		System.out.println("test-----git");
		System.out.println("aaaaaa");
		try {
//			PrintWriter printWriter = new PrintWriter("d:/aa.txt");
//			FileWriter printWriter = new FileWriter("d:/aa.txt");
//			printWriter.write("fdkfdksfdksfdslkgglfkdglsdfdlfkalfkdsflkdslfkl");
//			printWriter.close();
			File file=new File("d:\\aa.txt");
			FileWriter writer=new FileWriter(file);
			writer.write("hellow，how are you.");
			writer.close();
			System.out.println("成功");
		} catch (IOException e) {
			System.out.println("erro");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
