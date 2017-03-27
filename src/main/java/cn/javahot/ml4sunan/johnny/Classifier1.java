package cn.javahot.ml4sunan.johnny;

import cn.javahot.ml4sunan.model.Pies;
import cn.javahot.ml4sunan.model.Shade;
import cn.javahot.ml4sunan.model.Shape;
import cn.javahot.ml4sunan.model.Size;
import cn.javahot.ml4sunan.model.Type;

public class Classifier1 extends ClassifierAbstractClass {

	@Override
	public Type doing(Pies pie) {
		Type result = Type.NEG;
		if (Shape.CIRCLE.equals(pie.getShape())
				&& Size.THICK.equals(pie.getCrust().getSize())
				&& Shade.GRAY.equals(pie.getCrust().getShade())
				&& Size.THICK.equals(pie.getFilling().getSize())
				&& Shade.DARK.equals(pie.getFilling().getShade())) {
			result = Type.POS;
		}

		return result;
	}

}
