package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import graph.graph;

public class test1 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		graph g1 = new graph(6);
	     g1.addLine(0, 1);
	     g1.addLine(1, 2);
	     g1.addLine(2, 3);
	     g1.addLine(3, 4);
	     g1.addLine(4, 0);
	     g1.addLine(3, 5);
	     g1.addLine(5, 3);
	     
	     if (g1.sc())
	         System.out.println("Yes");
	     else
	         System.out.println("No");
	
	     graph g2 = new graph(4);
	     g2.addLine(0, 1);
	     g2.addLine(1, 2);
	     g2.addLine(2, 3);
	     if (g2.sc())
	         System.out.println("Yes");
	     else
	         System.out.println("No");
	}

}
