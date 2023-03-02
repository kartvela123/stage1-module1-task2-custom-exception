package com.epam.mjc;




public class StudentManager {
  public class StudentNotFoundException extends IllegalArgumentException {

    public StudentNotFoundException(String message) {
      super(message);
    }

  }

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) {
    if (Student.getValueOf(studentID) != null) {
      return Student.getValueOf(studentID);
  }else {
      throw new StudentNotFoundException("Could not find student with ID " + studentID);
    }

}

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    for (int i = 0; i < IDs.length; i++) {
      Student student = manager.find(IDs[i]);
      try {
        System.out.println("Student name " + student.getName());
    } catch (StudentNotFoundException ex) {
        System.err.print(ex);

      }

  }
}
  }