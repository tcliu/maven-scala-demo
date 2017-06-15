package app.util

import org.scalatest._

/**
  * Created by Liu on 6/15/2017.
  */
class MathUtilTest extends FlatSpec with Matchers {

  lazy val mathUtil = new MathUtil

  "1 + 2" should "equal to 3" in {
    mathUtil.sum(1, 2) should be (3)
  }

  "1 * 2" should "equal to 2" in {
    mathUtil.multiply(1, 2) should be (2)
  }

}
