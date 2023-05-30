package adaptor_pattren;

import adaptor_pattren_class.PenUser;

public class Implementer implements Pen{

	PenUser p=new PenUser();
	
	@Override
	public void pen(String s) {
		p.writer(s);
		
	}
	

}
