package staticInnerClasses;

public class Main {

	public static void main(String[] args) {  //STATÝC OLDUÐU ÝÇÝN BÖYLE YAZDIK
		Matematik.Alan alan = new Matematik.Alan();
		alan.daire_alan(3);

		
		//MATEMATÝK SINIFINDAKÝ METODU DA STATÝC YAPSAK SORUN ÇIKMAZ
		//o zamanda MATEMATÝK.ALAN.DAÝRE_ALAN();  DÝYE ÇAÐRILIR.
	}

}
