/* quentin girard */
public class Losange extends Quadrilatere {

	//constructeur de la classe Losange
	public Losange(InterPoint a, InterPoint b, InterPoint c, InterPoint d, String couleurTrait, String couleuInterieur) {
		super(a, b, c, d, couleurTrait, couleuInterieur);
		this.type = "losange";
		// TODO Auto-generated constructor stub
	}

	//renvoie les propri�tes du losange
	@Override
	public String proprietes() {
		return "Un losange est un parall�logramme ayant deux c�t�s cons�cutifs de m�me longueur. Il �tait anciennement appel� rhombe (et porte toujours un nom tir� de cette �tymologie dans de nombreuses langues, comme rhombus en anglais). L'adjectif qui lui est relatif est rhombique.";
	}
}
