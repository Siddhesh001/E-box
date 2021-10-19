package Collections_Framework;
import java.util.ArrayList;

public class ArrayListCasestudy 
{

	ArrayList<Integer> list1 = new ArrayList<Integer>();
		
	public ArrayList<Integer> saveEvenNumbers(int N) 
	{
			list1 = new ArrayList<Integer>();
			
			for (int i = 2; i <= N; i++) 
			{
				if (i % 2 == 0) list1.add(i);
			}
			
			return list1;
		}
		
		public ArrayList<Integer> printEvenNumbers() {
			ArrayList<Integer> newList = new ArrayList<Integer>();
			
			for (int item : list1) {
				newList.add(item * 2);
				System.out.println(item * 2);
			}
			
			return newList;
		}

		public static void main(String[] args) {
			ArrayListCasestudy  aobj = new ArrayListCasestudy();
			aobj.saveEvenNumbers(10);
			aobj.printEvenNumbers();
			

		}

}


