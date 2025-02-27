import org.scalatest.funsuite.AnyFunSuite
import com.app_scala_quickstart_cli.cli.main

class MainUnitTests extends AnyFunSuite:

  test("prints correct message when no filename parameter supplied."):
    val outputStream = new java.io.ByteArrayOutputStream()
    Console.withOut(outputStream):
      main("")

    val expectedMessage = "Please provide a filename."

    assert(outputStream.toString().contains(expectedMessage))
  
  test("prints correct message when more than 1 filename is supplied."):
    val outputStream = new java.io.ByteArrayOutputStream()
    Console.withOut(outputStream):
      main("filename1.txt", "filename2.txt")

    val expectedMessage = "Please provide one filename."

    assert(outputStream.toString().contains(expectedMessage))
  
  test("correctly handles FileNotFoundException."):
    val expectedMessage =
      "File not found, please ensure the file is in the same directory as the program. Provided filename was: invalid.txt."
    val outputStream = new java.io.ByteArrayOutputStream()
    Console.withOut(outputStream):
      main("invalid.txt")
    
    assert(outputStream.toString().contains(expectedMessage))