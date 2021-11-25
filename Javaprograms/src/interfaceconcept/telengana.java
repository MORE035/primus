package interfaceconcept;

public class telengana implements LanguagesMust,InAsia {

	public static void main(String[] args) {
		
		InAsia IA=new telengana();
		IA.china();
		LanguagesMust LM=new telengana();
		LM.englis();
		
	}
 
	@Override
	public void china() {
		System.out.println("chenees must language");		
		
	}

	@Override
	public void englis() {
		System.out.println("English must language");		
		
	}

	@Override
	public void hindi() {
		System.out.println("Hindi must language");		
		
	}

}
