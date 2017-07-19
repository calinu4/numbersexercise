
class Numbers {

  import scala.math.pow
  val thousand=1000
  val million = pow(10, 6)
  val billion = pow(10, 9)
  val trillion = pow(10, 12)
  val quadrillion = pow(10, 15)
  val quintillion = pow(10, 18)
  val sextillion = pow(10, 21)



  def shortScale(x: Long): String = {
    x match {
      case x if(x<thousand)=>x.toInt.toString
      case x if (x < million) => (x / thousand).toInt.toString + " thousands and " +shortScale((x%thousand).toLong)
      case x if (x < billion) => (x / million).toInt.toString + " million, " + shortScale((x % million).toLong)
      case x if (x < trillion) => (x / billion).toInt.toString + " billion, " + shortScale((x % billion).toLong)
      case x if (x < quadrillion) => (x / trillion).toInt.toString + " trillion, " + shortScale((x % trillion).toLong)
      case x if (x < quintillion) => (x / quadrillion).toInt.toString + " quadrillion, " + shortScale((x % quadrillion).toLong)
      case x if (x < sextillion) => (x / quintillion).toInt.toString + " quintillion, " + shortScale((x % quintillion).toLong)
      case x if (x < pow(10, 24)) => (x / sextillion).toInt.toString + " sextillion, " + shortScale((x % sextillion).toLong)
    }
  }

  def largeScale(x: Long): String = {
    x match {
      case x if(x<thousand)=>x.toInt.toString
      case x if (x < million) => (x / 1000).toInt.toString + " thousands and " + shortScale(x%thousand)
      case x if (x < billion) => (x / million).toInt.toString + " million, " + largeScale((x % million).toLong)
      case x if (x < trillion) => (x / billion).toInt.toString + " milliard, " + largeScale((x % billion).toLong)
      case x if (x < quadrillion) => (x / trillion).toInt.toString + " billion, " + largeScale((x % trillion).toLong)
      case x if (x < quintillion) => (x / quadrillion).toInt.toString + " billiard, " + largeScale((x % quadrillion).toLong)
      case x if (x < sextillion) => (x / quintillion).toInt.toString + " trillion, " + largeScale((x % quintillion).toLong)
      case x if (x < pow(10, 24)) => (x / sextillion).toInt.toString + " trilliard, " + largeScale((x % sextillion).toLong)
    }

  }


}