package com.vnrvjiet.ankitha.epam.tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Remove_A_inFrist2CharsTest {
	/*
	 * if 'A' is present after 2 Characters, it should not be remove.
	 * TODO list for my feature
	 * 1)"ABCD:=>"BCD"
	 * 2)"AACD"=>"CD"
	 * 3)"BACD"=>"BCD"
	 * 4)"BBAA"=>"BBAA"
	 * 5)"AABAA"=>"BAA"
	 */
	RemoveAfrom1st2Chars RemoveAfrom1st2Chars;
	@BeforeEach
	void setUp()
	{
		RemoveAfrom1st2Chars RemoveAfrom1st2Chars = new RemoveAfrom1st2Chars();
	}
	@Test
	void test1()
	{
		assertEquals("BCD",RemoveAfrom1st2Chars.remove("ABCD"));
	}
	@Test
	void test2()
	{
		assertEquals("CD",RemoveAfrom1st2Chars.remove("AACD"));
	}
	@Test
	void test3()
	{
		assertEquals("BCD",RemoveAfrom1st2Chars.remove("BACD"));
	}
	@Test
	void test4()
	{
		assertEquals("BBAA",RemoveAfrom1st2Chars.remove("BBAA"));
	}
	@Test
	void test5()
	{
		assertEquals("BAA",RemoveAfrom1st2Chars.remove("AABAA"));
	}
	@Test
	void test6()
	{
		assertEquals("",RemoveAfrom1st2Chars.remove("AA"));
	}
	@Test
	void test7()
	{
		assertEquals("",RemoveAfrom1st2Chars.remove("A"));
	}
	@Test
	void test8()
	{
		assertEquals("",RemoveAfrom1st2Chars.remove(""));
	}

}
