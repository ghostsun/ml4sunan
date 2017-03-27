package cn.javahot.ml4sunan.johnny;

import cn.javahot.ml4sunan.model.Pies;
import cn.javahot.ml4sunan.model.Type;

public abstract class ClassifierAbstractClass implements Classifier {
	
	public Type doit(Pies pie){
		Type result = Type.NEG;
		if(pie != null){
			return doing(pie);
		}
		
		return result;
	}
	
	public abstract Type doing(Pies pie);

}
