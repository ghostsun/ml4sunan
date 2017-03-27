package cn.javahot.ml4sunan.model;

public class Pies {
	
	private String no;
	
	private Shape shape;
	
	private Crust crust;
	
	private Filling filling;
	
	private Type type;
	
	public Pies(String no, Shape shape, Crust crust, Filling filling, Type type){
		this.no = no;
		this.shape = shape;
		this.crust = crust;
		this.filling = filling;
		this.type = type;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public Crust getCrust() {
		return crust;
	}

	public void setCrust(Crust crust) {
		this.crust = crust;
	}

	public Filling getFilling() {
		return filling;
	}

	public void setFilling(Filling filling) {
		this.filling = filling;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	

}


