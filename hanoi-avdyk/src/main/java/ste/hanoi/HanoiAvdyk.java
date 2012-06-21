package ste.hanoi;

public class HanoiAvdyk implements IHanoi {

	ITour[] tours = new ITour[3];

	@Override
	public void init() {
		tours[0] = new TourAvdyk();
		tours[1] = new TourAvdyk();
		tours[2] = new TourAvdyk();
		for (int i = 5; i > 0; i--) {
			tours[0].push(i);
		}
	}

	@Override
	public void move(int from, int to) {
		try {
			int i = this.tours[from].peek();
			this.tours[to].push(i);
			this.tours[from].pop();
		} catch (RuntimeException rex) {
			System.err.println(rex.getMessage());
		}
	}

	@Override
	public void move(int size, int from, int to, int by) {
		// TODO
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Les tours de Hanoi:\n");
		for (int i = 5; i > 0; i--) {
			for (ITour t : this.tours) {
				sb.append(t.toString(i - 1)).append(' ');
			}
			sb.append('\n');
		}
		return sb.toString();
	}

}
