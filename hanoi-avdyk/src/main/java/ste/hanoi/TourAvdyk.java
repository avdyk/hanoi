package ste.hanoi;

import java.util.Stack;

public class TourAvdyk extends Stack<Integer> implements ITour {

	private static final long serialVersionUID = -7265045586972278603L;

	public TourAvdyk() {
		super();
	}

	@Override
	public Integer push(Integer i) throws IllegalStateException {
		if (i < 1 || i > 5) {
			throw new IllegalArgumentException(
					"Le nombre doit être entre [1 et 5]");
		}
		if (!super.isEmpty() && i > super.peek()) {
			throw new IllegalStateException("Le disque doit être inférieur");
		}
		super.push(i);
		return i;
	}

	@Override
	public String toString(int line) {
		String s = ITour.LIGNE0;
		if (line < super.size()) {
			switch (super.get(line)) {
			case 1:
				s = ITour.LIGNE1;
				break;
			case 2:
				s = ITour.LIGNE2;
				break;
			case 3:
				s = ITour.LIGNE3;
				break;
			case 4:
				s = ITour.LIGNE4;
				break;
			case 5:
				s = ITour.LIGNE5;
				break;
			}
		}
		return s;
	}

}
