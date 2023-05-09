package org.example;

import java.util.ArrayList;
import java.util.List;
public class Demo {
    static List<IGrade> gradedStudents = new ArrayList<>();
    static List<IGrade> studentsWhoPass = new ArrayList<>();
    static List<IGrade> studentsWhoFail = new ArrayList<>();

    public static void main(String[] args) {

        Student std1 = new Student("131313","test","std@fom.com","eap");
        Student std2 = new Student("121545","test2","hfdos@fom.com","eap");
        Student std3 = new Student("164894","test3","dfa@fom.com","eap");
        Student std4 = new Student("269894","test4","hjrj@fom.com","eap");
        Student std5 = new Student("989654","test5","yejemy@fom.com","eap");

        addToList(std1);
        addToList(std2);
        addToList(std3);
        addToList(std4);
        addToList(std5);

        filterList(gradedStudents);

        System.out.println("Φοιτητές που πέρασαν");
        for (IGrade stp: studentsWhoPass)
            System.out.println(stp.showAverage());

        System.out.println("\nΦοιτητές που κόπηκαν");
        for (IGrade stf: studentsWhoFail)
            System.out.println(stf.showAverage());
    }

    static void addToList(IGrade graded) {
        gradedStudents.add(graded);
    }

    static void filterList(List<IGrade> gradedStudents) {
        for (IGrade st: gradedStudents){
            if (st.showAverage()<5)
                studentsWhoFail.add(st);
            else
                studentsWhoPass.add(st);
        }
    }
}