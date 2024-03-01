// starting the program

fun main() {
  // using if-else ladder to print grade obtained by students
  var firstStudentMarks: Int? = null

  firstStudentMarks = 200
  // normal if-else-if ladder 
  if(firstStudentMarks != null) {
    if(firstStudentMarks > 90) {
      print("Grade: A")
    } else if(firstStudentMarks < 90 && firstStudentMarks > 80) {
      print("Grade: B")
    } else if(firstStudentMarks < 80 && firstStudentMarks > 70) {
      print("Grade: C")
    } else if(!(firstStudentMarks <= 100 && firstStudentMarks >= 1)) {
      print("Marks should be between 1 to 100")
    } else {
      print("Grade: C")
    }
  } else {
    print("Please provide marks")
  }
}