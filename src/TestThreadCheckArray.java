import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
/** Description of SharedData: The code snippet shows a Java class called SharedData. It has four instance variables including an ArrayList of integers, an array of booleans, a boolean flag, and a final integer.
 * @author Yuval Hilay
 * @author Yehezkel-Chay Fadida
 * @version 6.0z Build 9000 March 19,2023
 */
/**creates two threads to check if a given number can be represented as the sum of two numbers in an ArrayList. The program prompts the user to enter the size of the array, the array elements, and the target number. It then creates a SharedData object that holds the array and the target number. Two ThreadCheckArray objects are created and initialized with the same SharedData object, and then started using threads. The threads execute the check method of ThreadCheckArray, which checks if the target number can be represented as the sum of two numbers in the array. Once the threads complete their execution, the program prints the result of the check and the contents of the array and the winArray. */
public class TestThreadCheckArray {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			Thread thread1, thread2;
			System.out.println("Enter array size");
			int num  = input.nextInt();
			ArrayList<Integer> array = new ArrayList<>();
			System.out.println("Enter numbers for array");
			
			for (int index = 0; index < num; index++) 
				array.add(input.nextInt());
			
			System.out.println("Enter number");
			num = input.nextInt();
			
			SharedData sd = new SharedData(array, num);
			
			thread1 = new Thread(new ThreadCheckArray(sd), "thread1");
			thread2 = new Thread(new ThreadCheckArray(sd), "thread2");
			thread1.start();
			thread2.start();
			try 
			{
				thread1.join();
				thread2.join();
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			if (!sd.getFlag())
			{
				System.out.println("Sorry");
				return;
			}
			System.out.println("Solution for b : " + sd.getB() + ",n = " + sd.getArray().size());
			System.out.print("I:    ");
			for(int index = 0; index < sd.getArray().size() ; index++)
				System.out.print(index + "    ");
			System.out.println();
			System.out.print("A:    ");
			for (int index : sd.getArray())
			{
				System.out.print(index);
				int counter = 5;
				while (true)
				{
					index = index / 10;
					counter--;
					if (index == 0)
						break;
				}
				for (int i = 0; i < counter; i++)
					System.out.print(" ");
			}

			System.out.println();
			System.out.print("C:    ");
			for (boolean index : sd.getWinArray())
			{
				if (index)
					System.out.print("1    ");
				else
					System.out.print("0    ");	
			}
		}
	}

}