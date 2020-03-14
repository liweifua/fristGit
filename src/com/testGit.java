package com;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class testGit {
	public static void main(String[] args) {
		System.out.println("test-----git");
		try {
			PrintWriter printWriter = new PrintWriter("d:/aa.txt");
			printWriter.append("aaaabbbbb");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
