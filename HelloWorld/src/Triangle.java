/* quentin girard */
public class Triangle {
	  //donn�es de la classe
	  protected InterPoint a;
	  protected InterPoint b;
	  protected InterPoint c;
	  protected String type;
	  protected String couleurInterieur;
	  protected String couleurTrait;
	 
	  //constructeur de la classe Quadrilat�re
	  public Triangle (InterPoint a, InterPoint b, InterPoint c, String couleurTrait, String couleurInterieur) {
	    this.a = a;
		this.b = b;
	    this.c = c;
	    this.couleurTrait = couleurTrait;
	    this.couleurInterieur = couleurInterieur;
	  }
	 
	  //getters
	  public InterPoint getA() { return a; }
	  public InterPoint getB() { return b; }
	  public InterPoint getC() { return c; }
	  public String getType() { return type; }
	  
	  //m�thode d'affichage
	  public void affiche () {
		  System.out.println(this);
	  }
	  
	  //r��criture de la classe toString
	  public String toString (){
		  String phrase_type_quadri = type();
		  String phrase_couleur = couleur();
		  String phrase_proprietes = proprietes();
		  String phrase_coord = coordonnees();
		  String phrase = phrase_type_quadri + phrase_couleur +  phrase_proprietes + '\n' + phrase_coord + "\n\n";
		return phrase;
	  }
	  
	  //renvoie le type du quadrilat�re
	  public String type(){
		  String phrase_type_quadri = "Je suis un " + getType() + ". ";
		return phrase_type_quadri;
	  }
	  
	  //renvoie les coordonn�es des quatre points du quadrilat�re
	  public String coordonnees () {
		  String phrase_coord = "Mes sommets ont pour coordonn�es: " +
				  	a.getCoordPoint() +
				  	b.getCoordPoint() +
				  	c.getCoordPoint();
		return phrase_coord;
	  }
	  
	  //renvoie les propri�tes du quadrilat�re
	  public String proprietes () {
		  return "Pas de propri�t� sp�ciale";
	  }
	  
	  //obtenir la distance entre deux points
	  public double getDistance  (InterPoint pt1, InterPoint pt2) {
		  double distance = Math.sqrt( Math.pow(b.getX() - a.getX(), 2) 
				  					 + Math.pow(b.getY() - a.getY(), 2));
		  return distance;
	  }
	  
	  //calcul de l'aire
	  public double getAire () {
		  return 0;
	  }
	  
	  //renvoie les couleurs du polyg�ne
	  public String couleur () {
		  String s;
		  s = " La couleur de mon trait est " + couleurTrait + " et la couleur de mon int�rieur est " + couleurInterieur + "\n" ;
		  return s;
	  }
}
