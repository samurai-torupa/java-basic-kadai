package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		KatoTaro_Chapter18 a   = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 b = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 c = new KatoHanako_Chapter18();

		a.setGivenName();
		b.setGivenName();
		c.setGivenName();
		
		a.execIntroduce();
		b.execIntroduce();
		c.execIntroduce();
		
	}

}
