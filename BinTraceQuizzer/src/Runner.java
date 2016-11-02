import java.util.*;
import java.util.Scanner;

public class Runner
	{
		private static int count=0;
		private static int right=0;
		static ArrayList<Integer> nums;
		public static void main(String[] args)
			{
				System.out.println("Welcome to the Binary Search Quizzer by Coe Bassett.");
				boolean cont=true;
				while(cont)
					{
						System.out.println("Begin inputting numbers between 1 and 20. When you want to stop, input -1.");
						nums=new ArrayList<Integer>();
						int check=0;
						while(check!=-1)
							{
								Scanner userInput=new Scanner(System.in);
								check=userInput.nextInt();
								if (check>0 && check<=20)
									{
								nums.add(check);
									}
								else if (check!=-1)
									{
										System.out.println("Try again.");
									}
							}
						Collections.sort(nums);
						
						System.out.println("The whole algorithm returned " + binarySearch(nums, targetFind(nums)));
						
						System.out.println("Do you want to do this all again?");
						Scanner userInput=new Scanner(System.in);
						if (userInput.nextLine().equals("yes"))
							{
								count=0;
								right=0;
							}
						else
							{
								System.out.println("Thanks for quizzing!");
								break;
							}

					}
			}
		public static int binarySearch(ArrayList<Integer> elements, int target)
			{
				System.out.println("The target is " + target);
			 int left = 0;
			 int right = elements.size() - 1;
			 while (left <= right)
			{
			int mid = (left + right) / 2;
			printArray();
			System.out.println("What is left?");
			check(left);
			System.out.println("What is right?");
			check(right);
			System.out.println("What is mid?");
			check(mid);
			System.out.println("What is at mid in the Array?");
			check(elements.get(mid));
			if (target == elements.get(mid))
			{
			return mid;
			}
			if (target < elements.get(mid))
			{
			right = mid - 1;
			}
			else
			{
			left = mid + 1;
			}
			System.out.println("Next Pass");
			}
			 return -1;
			 }
		public static int targetFind(ArrayList x)
		{
			return (int) x.get(((int)Math.random()*x.size()));
		}
		public static void check(int x)
		{
			Scanner userInput=new Scanner(System.in);
			if (x==userInput.nextInt())
				{
					System.out.println("Correct!");
					right++;
				}
			else
				{
					System.out.println("Nope. Sorry.");
				}
			count++;
		}
		public static void printArray()
		{
			for (Integer c: nums)
				{
					System.out.print(c + " ");
				}
			System.out.println("");
			for (int i=0; i<nums.size(); i++)
				{
					System.out.print(i + " ");
				}
			System.out.println("");
		}
		
		/*		public static int binarySearch(ArrayList<Integer> elements, int target)
			{
			 int left = 0;
			 int right = elements.size() - 1;
			 while (left <= right)
			{
			int mid = (left + right) / 2;
			if (target == elements.get(mid))
			{
			return mid;
			}
			if (target < elements.get(mid))
			{
			right = mid - 1;
			}
			else
			{
			left = mid + 1;
			}
			}
			 return -1;
			 }
*/

	}

