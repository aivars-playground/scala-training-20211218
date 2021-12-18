import zio.*
import scala.io.Source

object ZioApp extends App:
  def run(args: List[String]) = 
    val sayHello = Console.printLine("ZIO hello")
    val sayHelloTwice = sayHello.repeat(Schedule.recurs(1))
    sayHelloTwice.exitCode


//Baeldung scala-tutorials
//Fails in VS Code run (replace embedded console with actual terminal???)
object ReadPrintLine extends ZIOAppDefault:
  def run =
    for {
      _ <- Console.printLine("Hello! What is your name?")
      n <- Console.readLine
      _ <- Console.printLine("Hello, " + n + ", good to meet you!")
    } yield ()

@main def helloZZZ: Unit = 
  val sayHi = ZIO.effectTotal(println("HI"))
  Runtime.default.unsafeRun(sayHi)
