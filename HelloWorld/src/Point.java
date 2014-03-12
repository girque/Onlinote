/* quentin girard */
public class Point implements InterPoint{
	  private double x;
	  private double y;
	 
	  //constructeur dela classe Point
	  public Point(double x, double y) {
	    this.x = x;
	    this.y = y;
	  }
	  
	  //m�thode pour cr�er un Point sans param�tre
	  public Point () {}
	  
	  //initialisation a posteriori
	  public void init (double x, double y) {
		    this.x = x;
		    this.y = y;
	  }
	 
	  //getters coordonn�es
	  public double getX() { return x; }
	  public double getY() { return y; }
	   
	  //m�thode affichage coordonn�es
	  public void afficherCoordPoint () {
		  System.out.println("(" + getX() + "," + getY() + ")");
	  }
	  
	  //m�thode obtention des coordonn�es
	  public String getCoordPoint () {
		  String s = "(" + getX() + "," + getY() + ")";
		  return s;
	  }
}
