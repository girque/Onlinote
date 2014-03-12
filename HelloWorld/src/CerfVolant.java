/* quentin girard */
public class CerfVolant extends Quadrilatere {

	//constructeur de la classe CerfVolant
	public CerfVolant(InterPoint a, InterPoint b, InterPoint c, InterPoint d, String couleurTrait, String couleuInterieur) {
		super(a, b, c, d, couleurTrait, couleuInterieur);
		this.type = "cerf-volant";
		// TODO Auto-generated constructor stub
	}

	//renvoie les propri�tes du cerf volant
	@Override
	public String proprietes() {
		// TODO Auto-generated method stub
		    return "Les paires de c�t�s �gaux impliquent beaucoup de propri�t�s :"
		    + "\nLes diagonales sont perpendiculaires entre elles"
		    + "\nUne des diagonales divise le cerf-volant en deux triangles isoc�les ; et l'autre le divise en deux triangles congrus"
		    + "\nLes cerfs-volants poss�dent au moins un axe de sym�trie ; cet axe est la diagonale qui divise en deux triangles congrus"
		    + "\nUn cerf-volant poss�de un cercle inscrit ; c�est-�-dire qu'il existe un cercle qui est tangent aux quatre c�t�s.";
	}
}
