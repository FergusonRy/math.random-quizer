package mathQuizzer;
import java.util.Scanner;
public class mathQuizzer
	{
		static String input;
		static Scanner userInput = new Scanner(System.in);
		static int numberOfQuestions=0;
		static int firstNumber; 
		static int secondNumber;
		static int correct=0;

		public static void main(String[] args)
			{
				wannaPlay();
				quizB();
				quizA();
			}
		public static void generateNumber1()
			{
				firstNumber = (int) (Math.random() * 10) + 1;			 
				  
			}
		public static void generateNumber2()
			{
				secondNumber = (int) (Math.random() * 5) + 1;			 
			}
		public static void wannaPlay()
			{
				System.out.println("Hello! what is your name?");
				String name= userInput.nextLine();
				System.out.println("hello " + name);
				System.out.println("are you ready for a pop quiz. for yes type (1) for no type (2)");
				int yesOrNo= userInput.nextInt();
				if (yesOrNo == 1)
					{
						System.out.println("Awesome!");					
					}
				else 
					{
						System.out.println("to bad this is a pop quiz you have no choice.");			
					}
				System.out.println("but this is a weird pop quiz");
				System.out.println("im going to ask you how many questions you want to answer");
				System.out.println("so how many questions do you want to answer");
				numberOfQuestions= userInput.nextInt();
				if (numberOfQuestions>10)
					{
						System.out.println("no lol your only going to answer ten.");
					}
				else if (numberOfQuestions<1)
					{
						System.out.println("beacuse of your silliness you will answer 15 quesions!!!");
						numberOfQuestions=15;
					}
				else 
					{
						System.out.println("first question");
					}
			}
		public static void quizB()
		{
			if (numberOfQuestions%2==0)
				{
					numberOfQuestions=numberOfQuestions/2;
					for (int i=0; i<numberOfQuestions; i++)
						{
							generateNumber1();
							generateNumber2();
							System.out.println("what is the range of this code? please type what it will start at first then wait");
							System.out.println("int i = (int) (Math.random() * " + firstNumber + ") + " + secondNumber);
							int answer1= userInput.nextInt();
							System.out.println("now type what number it will stop at");
							int answer2= userInput.nextInt();
							if (answer1==secondNumber && answer2==(firstNumber+secondNumber)-1)
								{
									System.out.println("correct");
									correct++;
								}
							else if ( answer1==secondNumber && answer2!=(firstNumber+secondNumber)-1)
								{
									System.out.println("you got the first one correct but not the second good try.");
								}
							else if ( answer1!=secondNumber && answer2==(firstNumber+secondNumber)-1)
								{
									System.out.println("you got the second part correct but not the first part good try.");
								}
							else
								{
									System.out.println("wrong!!");
								}
						}
				}
			else
				{
					numberOfQuestions = (numberOfQuestions/2);
					for (int i=0; i<numberOfQuestions; i++)
						{
							generateNumber1();
							generateNumber2();
							System.out.println("what is the range of this code? please type what it will start at first then wait");
							System.out.println("int i = (int) (Math.random() * " + firstNumber + ") + " + secondNumber);
							int answer1= userInput.nextInt();
							System.out.println("now type what number it will stop at");
							int answer2= userInput.nextInt();
							if (answer1==secondNumber && answer2==(firstNumber+secondNumber)-1)
								{
									System.out.println("correct");
									correct++;
								}
							else if ( answer1==secondNumber && answer2!=(firstNumber+secondNumber)-1)
								{
									System.out.println("you got the first one correct but not the second good try.");
								}
							else if ( answer1!=secondNumber && answer2==(firstNumber+secondNumber)-1)
								{
									System.out.println("you got the second part correct but not the first part good try.");
								}
							else
								{
									System.out.println("wrong!!");
								}
						}
					numberOfQuestions = numberOfQuestions+1;
				}
			System.out.println("you got " + correct + "/" + numberOfQuestions + " correct");
		}
		public static void quizA()
			{
				for (int i=0; i<numberOfQuestions; i++)
					{
						generateNumber1();
						generateNumber2();
						System.out.println("the code ranges from " + secondNumber + " to " + firstNumber);
						System.out.println("please type the code that would make this range true.");
					}
			}

	}
