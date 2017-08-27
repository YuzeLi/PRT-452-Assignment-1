package graph;

import java.io.*;
import java.util.*;
import java.util.LinkedList;


 public class graph
{
	 private int Q;   
	 private LinkedList<Integer> linearray[]; 

 
	 public graph(int q)
  {
      Q = q;
      linearray = new LinkedList[q];
      for (int i=0; i<q; ++i)
         linearray[i] = new LinkedList();
  }

	 public void addLine(int q,int w) {  linearray[q].add(w); }

	 void DFSUtil(int q,Boolean visited[])
	{
		 visited[q] = true;

		 int n;

     
		 Iterator<Integer> i = linearray[q].iterator();
		 while (i.hasNext())
		 {
			 n = i.next();
			 if (!visited[n])
				 DFSUtil(n,visited);
		 }
	}

	 graph getTranspose()
	{
		 graph g = new graph(Q);
		 for (int q = 0; q < Q; q++)
		{
         
			 Iterator<Integer> i = linearray[q].listIterator();
			 while (i.hasNext())
				 g.linearray[i.next()].add(q);
		}
		 return g;
	}

	 public Boolean sc()
	{

		 Boolean visited[] = new Boolean[Q];
		 for (int i = 0; i < Q; i++)
			 visited[i] = false;
		 
		 DFSUtil(0, visited);

		 for (int i = 0; i < Q; i++)
			 if (visited[i] == false)
				 return false;

		 graph gr = getTranspose();

		 for (int i = 0; i < Q; i++)
			 visited[i] = false;

		 gr.DFSUtil(0, visited);

		 for (int i = 0; i < Q; i++)
			 if (visited[i] == false)
				 return false;

		 return true;
	}
}

