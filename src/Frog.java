public class Frog {

    private final String name;
    private int xPos;
    private int yPos;

    public Frog(String n, int x, int y)    // constructor
    {
        name = n;
        xPos = x;
        yPos = y;
        System.out.println(name);
    }

    public void setPos(int x, int y)   // accessor methods
    {
        xPos = x;
        yPos = y;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void moveWest()    // change the pos of the frog
    {
        xPos = xPos - 1;
    }

    public void moveEast() {
        xPos = xPos + 1;
    }

    public void moveNorth() {
        yPos = yPos + 1;
    }
    //TODO jump method move up and to the right
    //This method should take an integer argument.  This argument controls how many spaces
    // the frog will move both up and right.  Returns no value.

    //TODO visit method moves frog to the location of the friend frog
    // This method will take an argument of type Frog.  It will find the position of the
    // frog and move to this position.  Returns no value.
    public void jump(int z) {
        yPos = yPos + z;
        xPos = xPos + z;
    }

    public int visit(Frog other) {
        xPos = this.yPos * other.xPos;
        yPos = this.xPos + other.yPos;
        return xPos;
    }

    public void eatFly() {
        System.out.println("Yum");
    }

    public String toString() {
        String s = "Hi I am " + name + " the frog and I live at " + xPos + " " + yPos;
        return s;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Frog f1 = new Frog("Freddy", 3, 4);// create an instance of Frog
        f1.eatFly();
        f1.moveNorth();
        System.out.println(f1);

        Frog f2 = new Frog("Francine", -2, 0);
        f2.eatFly();
//                 TODO uncomment these to test new code.
        f2.jump(2);
        f1.visit(f2);
        System.out.println(f1);
        System.out.println(f2);
        Frog f3 = new Frog("Frank", 1, 6);
        f3.jump(2);
        f3.jump(1);
        System.out.println(f3);
        f3.visit(f1);
        System.out.println(f3);

    }
}