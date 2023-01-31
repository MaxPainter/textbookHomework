/**
 * @class: MaleStudents
 * @author: Max Painter
 * @written: January 31, 2023
 * description: Write a program named MaleStudent.java to compute
 * how many students are male in this middle school.
 */
public class MaleStudents {
    public static void main (String[] args){
        int students = 389; //total number of students attending a small middle school
        int female = 175; // all females attending a small middle school
        int male = students-female;

        System.out.println("There are "+male+" male students in this middle school.");
    }
}