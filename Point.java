class Point {

	String id
	double x,y;

	//TODO add new variable
	String color;

	//TODO constructor

	public Point(String color, String id, double x, double y) {
		this.color = color;
		this.id = id;
		this.x = x;
		this.y = y;
	}
	//TODO setters and getters

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void move (char xDirection, char yDirection) {
		//TODO
		if(xDirection == 'L') setX(x-1);
		else if(xDirection == 'R') setX(x+1);

		if(yDirection == 'U') setY(y+1)
		else if(yDirection == 'D') setY(x-1);
	}

	public void draw () {
		//TODO
		for(int i=0; i<x+1; i++){
			for(int j=0; j<y+1; j++){
				if(x == i && y == j) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}



}