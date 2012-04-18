import reflect.makro._

object TestMacro {
  def mplus5(c: Context)(i: c.Expr[Int]): c.Expr[Int] =
    c.reify(i.eval + 5)

  import language.experimental.macros
  def plus5(i: Int): Int = macro mplus5
}
