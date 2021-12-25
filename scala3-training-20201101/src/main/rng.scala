trait AdjustedRNG {

  import cats.Id
  import cats.syntax.functor.toFunctorOps
  import algebra.instances.long.longAlgebra

  def nextLong: Id[Long] =
    scala.util.Random.nextLong(999999L)

  def nextRandomNumber: RandomNumber =
    for {
      sourceRandomNumber <- nextLong
      adjustedRandomNumber = numberAdjuster(sourceRandomNumber)
    } yield RandomNumber(sourceRandomNumber, adjustedRandomNumber)

  def numberAdjuster: Long => Long =
    _.toString
      .groupBy(identity)
      .map { case (digit, occurrences) => (digit.asDigit, occurrences.size - 1) }
      .map { case (significand, exponent) => significand * longAlgebra.pow(10, exponent) }
      .sum
}


case class RandomNumber(sourceRandomNumber: Long, adjustedRandomNumber: Long)
