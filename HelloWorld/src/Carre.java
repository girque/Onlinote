/* quentin girard  test commit*/
public class Carre extends Quadrilatere {

	//constructeur de la classe Carre
	public Carre(InterPoint a, InterPoint b, InterPoint c, InterPoint d, String couleurTrait, String couleuInterieur) {
		super(a, b, c, d, couleurTrait, couleuInterieur);
		this.type = "carr�";
		//coucou
		//coucou2
		//coucou3
		// TODO Auto-generated constructor stub
	}
	
	//renvoie les propri�tes du carr�
	@Override
	public String proprietes() {
		return "Le carr� est � la fois un losange et un rectangle, il poss�de donc les propri�t�s de ces deux quadrilat�res. Il peut �galement �tre vu comme un polygone r�gulier, ce qui permet de d�montrer ses propri�t�s par d�duction de celles de ces polygones.";
	}
	
	public double getPerimetre () {
		double cote = this.getDistance(this.a, this.b);
		return 4 * cote;
	}
	
	public double getAire (){
		double cote = this.getDistance(this.a, this.b);
		return cote * cote;
	}

}
