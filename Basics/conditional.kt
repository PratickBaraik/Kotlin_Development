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
    } else if(firstStudentMarks < 60 && firstStudentMarks > 70) {
      print("Grade: D")
    } else {
      print("Marks should be between 1 to 100")
    }
  } else {
    print("Please provide marks")
  }

  println()
  // using if-else block to find grades using ranges: 'in'
  var secStudentMarks: Int? = null

  if(secStudentMarks != null) {
    if(secStudentMarks > 90) {
      print("Grade: A")
    } else if(secStudentMarks in 80..90) {
      print("Grade: B")
    } else if(secStudentMarks in 70..80) {
      print("Grade: C")
    } else if(secStudentMarks in 60..70) {
      print("Grade: D")
    } else {
      print("Marks should be between 1 to 100")
    }
  } else {
    print("Please provide marks")
  }

  println()
  // using when keyword
  var thirdStudentMarks: Int? = null

  var grade = when(thirdStudentMarks) {
    in 90..100 -> "A"
    in 80..90 -> "B"
    in 70..80 -> "C"
    in 60..70 -> "D"
    else -> "Marks should be between 1 to 100"
  }

  println("Grade: $grade")
}