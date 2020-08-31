//-----------------------------------------------------------------------
//Lab7_Ex1  Kip Brower  08/30/20 CPSC 50100-002
//Driver.java - method to delete the bottom half of the linked stack was not completed.
//-----------------------------------------------------------------------
public class Driver {

	public static void main(String[] args) {
		ArrayStack.pushAS(1);
		ArrayStack.pushAS(7);
		ArrayStack.pushAS(3);
		ArrayStack.pushAS(4);
		ArrayStack.pushAS(9);
		ArrayStack.pushAS(2);
		ArrayStack.popAS();
		ArrayStack.popAS();
		ArrayStack.popAS();
		ArrayStack.popAS();
		ArrayStack.popAS();
		ArrayStack.popAS();
		LinkedStack.pushLS(1);
		LinkedStack.pushLS(7);
		LinkedStack.pushLS(3);
		LinkedStack.pushLS(4);
		LinkedStack.pushLS(9);
		LinkedStack.pushLS(2);
		LinkedStack.popLS();
		LinkedStack.popLS();
		LinkedStack.popLS();
		LinkedStack.popLS();
		LinkedStack.popLS();
		LinkedStack.popLS();
		LinkedStack.removeBottomHalf();
	}

	
	
//ArrayStack class and methods. Uses code from ArrayStack.java provided with the supplemental examples from class/text.
	public static class ArrayStack {
		public static int[] stack = new int[8];
		public static int top;
		public void ArrayStack() {
			int top = 0;
		}
		public static void pushAS(int x) {
			if (top < stack.length) { //adds values to the top of the array at index 0.
				stack[top] = x;
				top++;
			} else { // clause if too many values are added into the fixed-length array.
				System.out.println("Whoa! Easy! This can only holds so much!");

			}
		}

		public static int popAS() {
			top--;  //removes values from the top of the array and prints them to the console.
			System.out.print(stack[top] + "  ");
			return stack[top];

		}
	}
	//LinkedStack class and methods. Uses LinkedNode.Java and code from LinkedStack.java from supplemental examples.
		public static class LinkedStack {  
			public static int count;
			public static LinkedNode front = null;
		
			public void LinkedStack() {
				count = 0;
			}

			public static void pushLS(int x) {
				LinkedNode newNode = new LinkedNode(x);
				newNode.next = front; // stores the value in the front node, into newNode.next
				front = newNode; // the new int x gets stored as a newNode and assigned front status.
				count++;
			}

			public static int popLS() {
				int x = front.x;
				front = front.next;  //deletes the reference of the old front value and declares the proceeding as front.
				count--;
				System.out.print(x + "  "); //prints the deleted value to the console.
				return x;
			}
		public static void removeBottomHalf() {
				if (count%2 <= 0) {
					for (int i=0; i < count/2; i++)
						front = front.next;
						count--;
						System.out.println(count);
		//The time complexity for this method is linear.
				}
		}
		}
	}
