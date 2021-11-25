package interfaceconcept;

public class andhrapredesh implements LanguagesMust {

	public static void main(String[] args) {
		LanguagesMust ap=new andhrapredesh();
		ap.englis();
		andhrapredesh  and=new andhrapredesh();
		and.telugu();

	}
	public void telugu() {
		
		System.out.println("additional language Telugu");		

		
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
