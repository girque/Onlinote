/* quentin girard */
public class Trapeze extends Quadrilatere {

	//constructeur de la classe Trapeze
	public Trapeze(InterPoint a, InterPoint b, InterPoint c, InterPoint d, String couleurTrait, String couleuInterieur) {
		super(a, b, c, d, couleurTrait, couleuInterieur);
		this.type = "trap�ze";
		// TODO Auto-generated constructor stub
	}
	
	//renvoie les propri�tes du quadrilat�re
	@Override
	public String proprietes() {
		return "Un trap�ze est un quadrilat�re, poss�dant deux c�t�s oppos�s parall�les.";
	}

}
