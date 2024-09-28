package robot;

public class Robot implements Cloneable {
    protected int gridSizeX, gridSizeY;             // Grid where the robot can move
    protected int x,y;                              // Robot's current coordinates
    protected enum heading {N, E, S, W};           
    protected heading h;                             // Direction the robot is facing
    protected Boolean debug = false;

    Robot(int gridSizeX, int gridSizeY, int initialX, int initialY, heading initialDirection) {
        this.gridSizeX = gridSizeX;
        this.gridSizeY = gridSizeY;
        this.x = initialX;
        this.y = initialY;
        this.h = initialDirection;
        if(debug) System.out.println("Initialized "+this.toString());
    }

    @Override
    public String toString() {
        return "Grid:"+gridSizeX+","+gridSizeY+" Pos:"+x+","+y+" Heading:"+h;
    }

    protected void processCommands(String cmds) throws Exception {
        for (int i = 0; i < cmds.length(); i++) {
            switch(cmds.charAt(i)){
                case 'R': turnRight();  break;
                case 'L': turnLeft();   break;
                case 'F': goForward();  break;
                default: System.out.println("Unknown command '"+cmds.charAt(i)+"' at position "+(i+1));
            }
            if(debug) System.out.println(this.report());
        }
    }

    protected void turnLeft() {
        h = heading.values()[(h.ordinal() - 1 + 4) % 4];
    }

    protected void turnRight() {
        h = heading.values()[(h.ordinal() + 1 + 4) % 4];
    }
    
    protected void goForward() throws Exception {
        switch(h) {
            case N: y--;    break;
            case S: y++;    break;
            case E: x++;    break;
            case W: x--;    break;
            default: System.out.println("Unknown heading '"+h+"'");
        }
        if(x >= gridSizeX || y >= gridSizeY || x < 0 || y < 0)
            throw new Exception("The robot went out of bounds!");
    }

    public String report() {
        return "Report: "+x+" "+y+" "+h;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
