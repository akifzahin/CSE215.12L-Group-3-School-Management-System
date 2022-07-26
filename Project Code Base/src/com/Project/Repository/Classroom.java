package com.Project.Repository;

import java.util.*;
import com.Project.Entities.Student;
import com.Project.Entities.Teacher;

public class Classroom {
public static int numberofStudents=0;
public static int numberofTeachers=0;
private ArrayList<Student> studentList=new ArrayList<Student>();
private ArrayList<Teacher> teacherList=new ArrayList<Teacher>();

public Classroom()
{
	
}

public int getNumberofStudents() {
	return numberofStudents;
}



public int getNumberofTeachers() {
	return numberofTeachers;
}


public void addToStudentList(Student student)
{
	this.studentList.add(student);
}

public void deleteFromStudentList(Student student)
{
	this.studentList.remove(student);
}

public ArrayList<Student> getStudentList()
{
	return studentList;
}



public ArrayList<Teacher> getTeacherList() {
	return teacherList;
}

public void addToTeacherList(Teacher teacher)
{
	this.teacherList.add(teacher);
}
public void deleteFromTeacherList(Teacher teacher)
{
	this.teacherList.remove(teacher);
}



}
