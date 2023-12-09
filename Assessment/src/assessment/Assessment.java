/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assessment;
import java.util.Scanner;

/**
 *
 * @author FELIX 0RIAKHI JR
 */
public class Assessment {

    /**
     * @param args the command line arguments
     */
//    to get grade from score
    public String liftGrade (double score){
        String grade = "";
        if (score >= 70 && score <=100){
            grade= "A";
        }else if (score >=55 && score <=69){
            grade= "B";
        }else if (score >= 50 && score <= 54){
            grade= "C";
        }else if (score >= 45 && score <=50){
            grade= "D";
        }else if (score >= 40 && score <= 44){
            grade = "E";
        }else if (score >= 0 && score <= 39){
            grade = "F";
        } return grade;
    }
    
//    to get point from grade
    public int liftPoint(String grade){
        int point= 0;
        switch (grade){
            case "A" -> point= 5;
            case "B" -> point= 4;
            case "C" -> point= 3;
            case "D" -> point= 2;
            case "E" -> point= 1;
            case "F" -> point= 0;
        }
        return point;
    }
    
//    to input course, course unit and score
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.println("Simple Grading System");
        Scanner i = new Scanner(System.in);
        
        //Course1
        System.out.println("Enter Course 1:");
        String course1 = i.nextLine();
        
        System.out.print("Enter" + course1 + "unit: ");
        int courseUnit1 = i.nextInt();
        
         System.out.print("Enter" + course1 + "Score : : ");
        double Score1 = i.nextDouble();
        
        i.nextLine();
        
          //Course2
        System.out.println("Enter Course 2:");
        String course2 = i.nextLine();
        
        System.out.print("Enter" + course2 + " unit: ");
        int courseUnit2 = i.nextInt();
        
         System.out.print("Enter" + course2 + " Score : ");
        double Score2 = i.nextDouble();
        
        i.nextLine();
        
          //Course3
        System.out.println("Enter Course 3:");
        String course3 = i.nextLine();
        
        System.out.print("Enter" + course3 + " unit: ");
        int courseUnit3 = i.nextInt();
        
         System.out.print("Enter" + course3 + " Score : ");
        double Score3 = i.nextDouble();
        
        i.nextLine();
        
          //Course4
        System.out.println("Enter Course 4:");
        String course4 = i.nextLine();
        
        System.out.print("Enter" + course4 + " unit: ");
        int courseUnit4 = i.nextInt();
        
         System.out.print("Enter" + course4 + " Score : ");
        double Score4 = i.nextDouble();
        
        i.nextLine();
        
          //Course5
        System.out.println("Enter Course 5:");
        String course5 = i.nextLine();
        
        System.out.print("Enter" + course5 + " unit: ");
        int courseUnit5 = i.nextInt();
        
        System.out.print("Enter" + course5 + " Score : ");
        double Score5 = i.nextDouble();
        
        Assessment ds = new Assessment();
        
        String grade1 = ds.liftGrade(Score1);
        String grade2 = ds.liftGrade(Score2);
        String grade3 = ds.liftGrade(Score3);
        String grade4 = ds.liftGrade(Score4);
        String grade5 = ds.liftGrade(Score5);
         
         int point1 = ds.liftPoint(grade1);
         int point2 = ds.liftPoint(grade2);
         int point3 = ds.liftPoint(grade3);
         int point4 = ds.liftPoint(grade4);
         int point5 = ds.liftPoint(grade5);
         
     
//         to calculate the total points
    int totalCourseUnit= courseUnit1+courseUnit2+courseUnit3+courseUnit4+courseUnit5;
    int totalQualityPoint=point1*courseUnit1;
    totalQualityPoint+=point2*courseUnit2;
    totalQualityPoint+=point3*courseUnit3;
    totalQualityPoint+=point4*courseUnit4;
    totalQualityPoint+=point5*courseUnit5;
        
//         to calculate gpa
         double gpa = totalQualityPoint/totalCourseUnit;
         
//         to prinnt out the calculator in a table-like format
            System.out.println("|------------|----------------|---------|--------|");
        System.out.println("|COURSE CODE |  COURSE UNIT   |  GRADE  | POINT  |");
        System.out.println("|------------|----------------|---------|--------|");
        System.out.println("|   " + course1+ "   |       " + courseUnit1 + "        |    " + grade1 + "    |    " + point1 + "   |");
        System.out.println("|------------|----------------|---------|--------|");
        System.out.println("|   " + course2+ "   |       " + courseUnit2 + "        |    " + grade2 + "    |    " + point2 + "   |");
        System.out.println("|------------|----------------|---------|--------|");
        System.out.println("|   " + course3+ "   |       " + courseUnit3 + "        |    " + grade3 + "    |    " + point3 + "   |");
        System.out.println("|------------|----------------|---------|--------|");
        System.out.println("|   " + course4+ "   |       " + courseUnit4 + "        |    " + grade4 + "    |    " + point4 + "   |");
        System.out.println("|------------|----------------|---------|--------|");
        System.out.println("|   " + course5+ "   |       " + courseUnit5 + "        |    " + grade5 + "    |    " + point5 + "   |");
        System.out.println("|------------|----------------|---------|--------|");
        System.out.println(" Your Gpa for the semester is: " + gpa);  
    }
    
}
