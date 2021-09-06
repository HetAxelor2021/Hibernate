package com.hh.LaptopStudentProjEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String T = scan.nextLine();
		Main r = new Main();
		System.out.println(r.decodeString(T));
	}
	public static int x = 0;
	public String decodeString(String T) {
		char []ch= T.toCharArray();
		boolean flag = false;
		String ans = "";
		String fans="";
		
		List<String> l  = new ArrayList<String>();
		for(int i=0;i<ch.length;i++) {
			
			if((flag || i==0 || ch[i-1]==']') && ch[i]!='[') {
				ans+=ch[i];
				x = new Integer(ans);
				if(ch[i+1]!=']') continue;
			}else {
				i++;
				String str = "";
				while(ch[i]!=']') {
					str+=ch[i];
					
				}
				while(x!=0) {
					fans+=str;
					x--;
				}
			}
		}
		
		return fans ;
	}
}
