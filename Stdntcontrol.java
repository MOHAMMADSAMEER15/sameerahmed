package com.student;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Stdntcontrol {
 
	
	public void writestddata(stdnt std)
	{
		System.out.println("conncting to file----- start");
		
		String path = "D:\\july24\\maajid.txt";
		FileWriter fr = null;
		BufferedWriter br = null;
		try {
			
			String s = std.getId()+","+std.getName()+","+std.getAge()+","+std.getMarks()+","+std.getQual();
			
			System.out.println("conncting to file object ---String");
			
			fr = new FileWriter(path,true);
			br = new BufferedWriter(fr);
			br.newLine();
			br.write(s);
			
			br.flush();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("conncting to file----- ended");
		
	}
	
}
