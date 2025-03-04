
class Notes {
	public static void main(String[] args) {
		
		//Try Catch

		//Try code block - any code inside, if it throws an exception, we can catch instead of crash
		
		int arr[] = new int[2];

		try {
			// arr[-1] = 5; //jumps to the catch

			// System.out.println(10/0);

			int num4 = Integer.parseInt("Hello");
		}
		// int num2 = 3; //don't put code between try and catch
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Don't go out of bounds");
		}
		catch (ArithmeticException e) {
			System.out.println("Divison by 0 is not allowed");
		}
		catch (NumberFormatException e) {
			System.out.println("Must be an integer");
		}
		catch (Exception e) { //Else of exceptions
			System.out.println(e);
		}

		System.out.println("Code is still running");
	}
}
