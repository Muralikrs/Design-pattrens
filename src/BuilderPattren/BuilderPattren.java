package BuilderPattren;

public class BuilderPattren {

	private int num;
	private String s;
	private float f;
	
	public BuilderPattren setNum(int num) {
		this.num = num;
		
	return this; }
	
	public BuilderPattren setS(String s) {
		this.s = s;
	return this; }
	
	public BuilderPattren setF(double d) {
		this.f = (float)d;
	return this; }
	public String toString()
	{
		return "["+num+","+s+","+f+"]";
	}
	
 }
