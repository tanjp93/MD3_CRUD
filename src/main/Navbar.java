package main;

import model.Student;

import java.util.Arrays;
import java.util.Scanner;

public class Navbar {
    public static void main(String[] args) {
        System.out.println("********************STUDENT MANAGE*********************");
        Scanner sc = new Scanner(System.in);
        int choice;
        Student[] students = new Student[2];
        students[0] = new Student(1, "Bui Van Tan", 25);
        students[1] = new Student(2, "Nguyen Van Tan", 20);
        Student[] newstd = new Student[0];
        do {
            System.out.println("1. Show List Student.");
            System.out.println("2. Create Student.");
            System.out.println("3. Update Student.");
            System.out.println("4. Delete Student.");
            System.out.println("5. Sort Student By Age ASC (Tăng Dần). ");
            System.out.println("6. Exit.");
            System.out.println("Input your choice !");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    if (newstd.length == 0) {
                        newstd = students;
                    }
                    System.out.println(Arrays.toString(newstd));
                    break;
                case 2:
                    newstd = new Student[students.length + 1];
                    for (int i = 0; i < students.length; i++) {
                        newstd[i] = students[i];
                    }
                    int stdId = newstd.length;
                    System.out.println("Input infor new student :");
                    System.out.println("Input Student's name !");
                    String stdName = sc.nextLine();
                    System.out.println("Input Student's Age !");
                    int stdAge = Integer.parseInt(sc.nextLine());

                    newstd[newstd.length - 1] = new Student(stdId, stdName, stdAge);
                    System.out.println(Arrays.toString(newstd));
                    break;
                case 3:
                    newstd = students;
                    System.out.println("Input number of oder !");
                    int numberStd = Integer.parseInt(sc.nextLine());
                    if (numberStd > newstd.length || numberStd <= 0) {
                        System.out.println("Your input is not available");
                    }
                    int updateStdIndex = numberStd - 1;
                    System.out.println("Input student's Name !");
                    String updateStdName = sc.nextLine();
                    System.out.println("Input student 's Age !");
                    int updateStdAge = Integer.parseInt(sc.nextLine());


                    for (int i = 0; i < newstd.length; i++) {
                        if (i == updateStdIndex) {
                            newstd[i] = new Student(i, updateStdName, updateStdAge);
                        }
                    }
                    System.out.println(Arrays.toString(newstd));
                    break;
                case 4:
                    newstd = new Student[students.length - 1];
                    System.out.println("Input number of oder !");
                    int deleteNo = Integer.parseInt(sc.nextLine());
                    if (deleteNo > students.length || deleteNo <= 0) {
                        System.out.println("Your input is not available");
                    } else {
                        int deleteIndex = deleteNo - 1;
                        for (int i = 0; i < newstd.length; i++) {
                            if (i != deleteIndex) {
                                if (i < deleteIndex) {
                                    newstd[i] = students[i];
                                }
                                if (i > deleteIndex) {
                                    newstd[i] = students[i + 1];
                                }
                            }
                        }
                    }
                    System.out.println(Arrays.toString(newstd));
                    break;
                case 5:
                newstd = students;

                    for (int i = 0; i < newstd.length; i++) {
                        for (int j = 0; j <newstd.length ; j++) {
                           if (newstd[i].getAge()<newstd[j].getAge()){
                               Student std=newstd[i];
                               newstd[i]= newstd[j];
                               newstd[j]= std;
                           }
                        }
                    }
                    System.out.println(Arrays.toString(newstd));
                    break;
                case 6:
                    System.exit(0);
            }

        } while (choice != 6);


    }
}
