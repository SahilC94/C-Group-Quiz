package quizminiproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
	
public class Quiz {
	
	
	static int getScore;
	static String getGrade;
	  
	static int correctAnsCount;
	static int wrongAnsCount;
	
	public static void displayQues() {
		
		Questions q1 = new Questions("Que) Which one of the following is not a Java feature?", 
				"1) Object-oriented",
				"2) Use of pointers",
				"3) Portable",
				"4) Dynamic and Extensible");
		
		Questions q2 = new Questions("Que) Which of the following is not an OOPS concept in Java?", 
				"1) Polymorphism",
				"2) Inheritance",
				"3) Compilation",
				"4) Encapsulation");    
		
		Questions q3 = new Questions("Que) Which environment variable is used to set the java path?", 
				"1) MAVEN_Path",
				"2) JavaPATH",
				"3) JAVA",
				"4) JAVA_HOME"); 
	     
		Questions q4 = new Questions("Que) What is the extension of compiled java classes?", 
				"1) .txt",
				"2) .js",
				"3) .class",
				"4) .java"); 
		
		Questions q5 = new Questions("Que) Which exception is thrown when java is out of memory?", 
				"1) MemoryError",
				"2) OutOfMemoryError",
				"3) MemoryOutOfBoundsException",
				"4) MemoryFullException	"); 
		
		Questions q6 = new Questions("Que) Which of these are selection statements in Java?", 
				"1) break",
				"2) continue",
				"3) for()",
				"4) if()"); 
		
		Questions q7 = new Questions("Que) Which of these keywords is used to define interfaces in Java?", 
				"1) intf",
			    "2) Intf",
			    "3) interface",
			    "4) Interface"); 
		
		Questions q8 = new Questions("Que) Which of the following is a superclass of every class in Java?", 
				"1) ArrayList",
			    "2) Abstract class",
			    "3) Object class",
			    "4) String"); 
		
		Questions q9 = new Questions("Que) Which of these keywords are used for the block to be examined for exceptions?", 
				"1) check",
			    "2) throw",
			    "3) catch",
			    "4) try"); 
		
		Questions q10 = new Questions("Que) Which one of the following is not an access modifier?", 
				"1) protected",
			    "2) void",
			    "3) public",
			    "4) private"); 
				
		Map<Questions,Character> hmap = new HashMap<>();
		
		hmap.put(q1,'2');
		hmap.put(q2,'3');
		hmap.put(q3,'4');
		hmap.put(q4,'3');
		hmap.put(q5,'2');
		hmap.put(q6,'4');
		hmap.put(q7,'3');
		hmap.put(q8,'3');
		hmap.put(q9,'4');
		hmap.put(q10,'2');
		
		for(Map.Entry<Questions,Character>map:hmap.entrySet()) {
			
			System.out.println(map.getKey().getQuestions());
			System.out.println(map.getKey().getOption1());
			System.out.println(map.getKey().getOption2());
			System.out.println(map.getKey().getOption3());
			System.out.println(map.getKey().getOption4());
			
		    Scanner scan = new Scanner(System.in);
			System.out.println("Please Enter Your Answer = ");
			Character Ans = scan.next().charAt(0);
			
			int CharacterAns = Character.compare(Ans,map.getValue());
								
			if(CharacterAns==0) {				
				correctAnsCount++;
			}
			else {				
				wrongAnsCount++;
			}
		}
			
		System.out.println(); 
		
		System.out.println("....Quiz Result....");
		System.out.println("Total Marks : " + hmap.size());
		System.out.println("Correct Answered  : " + correctAnsCount);
		System.out.println("Wrong Answered  : " + wrongAnsCount);	
				
		int Score = hmap.size() - wrongAnsCount;
		System.out.println("Score : " + Score);
		
		getScore = Score;
				
		if(Score>=8) {
			getGrade = "A";		
			System.out.println("Class A");	
		}
		
		else if(Score>=6 && Score<=8) {
			getGrade = "B";
			System.out.println("Class B");
		}
		
		else if(Score==5) {
			getGrade = "C";
			System.out.println("Class C");
		}
		
		else{
			getGrade = "Fail";
			System.out.println("Fail");
		}	
}	
	
}
