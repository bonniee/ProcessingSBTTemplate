import processing.core.PApplet

object Hello {
  def main(args:Array[String]): Unit = {
    PApplet.main("Hello")
  }
}

class Hello extends PApplet {

  // We have to use `settings` instead of `setup` for controlling the window size,
  // because this is outside of the PDE.
  override def settings(): Unit = {
    size(800, 800)
  }

  override def draw(): Unit = {
    ellipse(30, 30, 30, 30)
  }
}