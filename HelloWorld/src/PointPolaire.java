/* quentin girard */
public class PointPolaire implements InterPoint{
	  private double angle;
	  private double rayon;
	 
	  //constructeur dela classe Point
	  public PointPolaire (double angle, double rayon) {
	    this.angle = angle;
	    this.rayon = rayon;
	  }
	  
	  //m�thode pour cr�er un Point sans param�tre
	  public PointPolaire () {}
	  
	  //initialisation a posteriori
	  public void init (double angle, double rayon) {
		    this.angle = angle;
		    this.rayon = rayon;
	  }
	 
	  //getters coordonn�es polaires
	  public double getAngle() { return angle; } //en radians
	  public double getRayon() { return rayon; }
	  
	  //getters coordon�es cart�siennes
	  
//	  (double)Math.round(0.912385 * 100000) / 100000
	  
	  public double getX() { return rayon * Math.cos(angle); }
	  public double getY() { return rayon * Math.sin(angle); }
	   
	  //m�thode affichage angle et rayon
	  public void afficherCoordPoint () {
		  System.out.println("(" + getX() + "," + getY() + ")");
	  }
	  
	  //m�thode obtention des coordonn�es polaires
	  public String getCoordPointPolaire () {
		  String s = "(" + getAngle() + "," + getRayon() + ")";
		  return s;
	  }
	  
	  //m�thode obtention des coordonn�es cart�siennes
	  public String getCoordPoint () {
		  String s = "(" + (int)getX() + "," + (int)getY() + ")";
		  return s;
	  }
}
