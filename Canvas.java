class Canvas {
    List<Point> points;

    public Canvas(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
    public void addPoint(Point p)
    {
        points.add(p);
    }
    public void removePoint(Point p)
    {
        points.remove(p);
    }

}
