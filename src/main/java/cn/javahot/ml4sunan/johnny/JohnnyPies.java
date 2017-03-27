package cn.javahot.ml4sunan.johnny;

import java.util.ArrayList;
import java.util.List;

import cn.javahot.ml4sunan.model.Crust;
import cn.javahot.ml4sunan.model.Filling;
import cn.javahot.ml4sunan.model.Pies;
import cn.javahot.ml4sunan.model.Shade;
import cn.javahot.ml4sunan.model.Shape;
import cn.javahot.ml4sunan.model.Size;
import cn.javahot.ml4sunan.model.Type;

public class JohnnyPies {
	
	private static List<Pies> examples = new ArrayList<Pies>();
	
//	private static Classifier classifier = null;
	
	
	public static Type classifier(Pies pie, Classifier classifier) throws InstantiationException, IllegalAccessException{
		Type result = Type.NEG;
//		classifier = clazz.newInstance();
		result = classifier.doit(pie);
		return result;
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException{
		examples.add(new Pies("ex1", Shape.CIRCLE, new Crust(Size.THICK, Shade.GRAY), new Filling(Size.THICK, Shade.DARK), Type.POS));
		examples.add(new Pies("ex2", Shape.CIRCLE, new Crust(Size.THICK, Shade.WHITE), new Filling(Size.THICK, Shade.DARK), Type.POS));
		examples.add(new Pies("ex3", Shape.TRIANGLE, new Crust(Size.THICK, Shade.DARK), new Filling(Size.THICK, Shade.GRAY), Type.POS));
		examples.add(new Pies("ex4", Shape.CIRCLE, new Crust(Size.THIN, Shade.WHITE), new Filling(Size.THIN, Shade.DARK), Type.POS));
		examples.add(new Pies("ex5", Shape.SQUARE, new Crust(Size.THICK, Shade.DARK), new Filling(Size.THIN, Shade.WHITE), Type.POS));
		examples.add(new Pies("ex6", Shape.CIRCLE, new Crust(Size.THICK, Shade.WHITE), new Filling(Size.THIN, Shade.DARK), Type.POS));
		examples.add(new Pies("ex7", Shape.CIRCLE, new Crust(Size.THICK, Shade.GRAY), new Filling(Size.THICK, Shade.WHITE), Type.NEG));
		examples.add(new Pies("ex8", Shape.SQUARE, new Crust(Size.THICK, Shade.WHITE), new Filling(Size.THICK, Shade.GRAY), Type.NEG));
		examples.add(new Pies("ex9", Shape.TRIANGLE, new Crust(Size.THIN, Shade.GRAY), new Filling(Size.THIN, Shade.DARK), Type.NEG));
		examples.add(new Pies("ex10", Shape.CIRCLE, new Crust(Size.THICK, Shade.DARK), new Filling(Size.THICK, Shade.WHITE), Type.NEG));
		examples.add(new Pies("ex11", Shape.SQUARE, new Crust(Size.THICK, Shade.WHITE), new Filling(Size.THICK, Shade.DARK), Type.NEG));
		examples.add(new Pies("ex12", Shape.TRIANGLE, new Crust(Size.THICK, Shade.WHITE), new Filling(Size.THICK, Shade.GRAY), Type.NEG));
		
		Class<Classifier1> clazz = Classifier1.class;
		Classifier classifier = (Classifier) clazz.newInstance();
		
		for(Pies pie: examples){
			System.out.println("name: " + pie.getNo() + ", type: " + pie.getType() + ", classifier: " + classifier(pie, classifier));
		}
	}
	
	
	

}
