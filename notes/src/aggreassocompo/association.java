package aggreassocompo;

	class Teacher
	{
	  private String name;
	  Teacher(String name)
	  {
	    this.name = name;
	  }
	  public String getTeacherName()
	  {
	    return this.name;
	  }
	}
	class Student
	{
	  private String name;
	  Student(String name)
	  {
	    this.name = name;
	  }
	  public String getStudentName()
	  {
	    return this.name;
	  }
	}
	class association
	{
	  public static void main (String[] args)
	  {
	    Teacher teacherObj = new Teacher("Varadharajan");
	    Student studentObj = new Student("Naveen kumar");
	    System.out.println(studentObj.getStudentName() +
	        " is Student of " + teacherObj.getTeacherName());
	  }
	}