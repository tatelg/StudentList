/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentslist;

/**
 *
 * @author shaim
 */
public class StudentsList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     Student s1 = new Student();
     s1.setName("Shaimaa");
     s1.setId(123);
     
     Student s2 = new Student();
     Student s3 = new Student("John",456);
     
     System.out.println("BEFORE s1 ==> Name: "+ s1.getName() + " ID ="+ s1.getId() );
     System.out.println("s2 ==> Name: "+ s2.getName() + " ID ="+ s2.getId() );
     System.out.println("s3 ==> Name: "+ s3.getName() + " ID ="+ s3.getId() );
    
     Student[] studentList = new Student[5];
     
     studentList[0] = s1;
     studentList[1] = s2;
     studentList[2] = s3;
     studentList[3] = new Student("ABC",1111);
     studentList[4] = new Student("XYZ",2222);
     s1 = new Student("Smith",5555);
     System.out.println("AFTER s1 ==> Name: "+ s1.getName() + " ID ="+ s1.getId() );
     
     for (int i=0; i<studentList.length; i++)
         System.out.println("i= " + i + "==> Name: "+ studentList[i].getName() + " ID ="+ studentList[i].getId() );
     
    }
    
}
