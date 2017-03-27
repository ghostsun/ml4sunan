package cn.javahot.ml4sunan.model;

public class Crust {
	
	private Size size;
	
	private Shade shade;
	
	public Crust(Size size, Shade shade){
		this.size = size;
		this.shade = shade;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Shade getShade() {
		return shade;
	}

	public void setShade(Shade shade) {
		this.shade = shade;
	}
	
	

}
