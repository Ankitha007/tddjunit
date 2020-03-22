package com.vnrvjiet.ankitha.epam.tddjunit;

public class RemoveAfrom1st2Chars {

	public static String remove(String result) {
		
				StringBuilder res=new StringBuilder(result);
				if(result.length()>=2&&result.charAt(1)=='A')
					res.deleteCharAt(1);
				if(result.length()>=1&&result.charAt(0)=='A')
					res.deleteCharAt(0);
				return res.toString();
			}

		}

	
