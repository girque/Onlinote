/* quentin girard */
public interface InterPoint {

	  //getters coordon�es cart�siennes 
	  public double getX();
	  public double getY();

	  //m�thode affichage angle et rayon
	  public void afficherCoordPoint ();
	  
	  //m�thode obtention des coordonn�es cart�siennes
	  public String getCoordPoint ();
	  
	  //initialisation
	  public void init (double x, double y);
}
