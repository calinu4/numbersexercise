/**
  * Created by Administrator on 18/07/2017.
  */

class NumbersTest extends FlatSpec {
  val num=new Numbers()


  "Short scale for 123456789" should "be " in{
    assert(num.shortScale(123456789)==="123 million, 456 thousands and 789")
  }

  "Short scale for 456789123" should "be 456 million, 789 thousands and 12" in{
    assert(num.shortScale(456789123)==="456 million, 789 thousands and 123")
  }

  "Long scale for 123123456789" should "be 123 milliard, 123 million, 456 thousands and 789" in{
    assert(num.largeScale(123123456789d)==="123 milliard, 123 million, 456 thousands and 789")
  }

  "Long scale for 123123456789123" should "be 123 billion, 123 milliard, 456 million, 789 thousands and 123" in{
    assert(num.largeScale(123123456789123d)==="123 billion, 123 milliard, 456 million, 789 thousands and 123")
  }

  "Short scale for 123123456789" should "be 123 billion, 123 million, 456 thousands and 789" in{
    assert(num.shortScale(123123456789d)==="123 billion, 123 million, 456 thousands and 789")
  }

  "Short scale for 123123123456789" should "be 23 trillion, 123 billion, 123 million, 456 thousands and 789" in{
    assert(num.shortScale(123123123456789d)==="123 trillion, 123 billion, 123 million, 456 thousands and 789")
  }
  "Short scale for 123123123123456789" should "be 123 quadrillion, 123 trillion, 123 billion, 123 million, 456 thousands and 784" in{
    assert(num.shortScale(123123123123456789d)==="123 quadrillion, 123 trillion, 123 billion, 123 million, 456 thousands and 784")
  }

  "Long scale for 123123123456789123" should "be 123 billiard, 123 billion, 123 milliard, 456 million, 789 thousands and 120" in{
    assert(num.largeScale(123123123456789123d)==="123 billiard, 123 billion, 123 milliard, 456 million, 789 thousands and 120")
  }




}