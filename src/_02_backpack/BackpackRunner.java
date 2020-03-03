package _02_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		Pencil pencil = new Pencil();
		Ruler ruler = new Ruler();
		Textbook textbook = new Textbook();
		Backpack backpack = new Backpack();
		backpack.putInBackpack(pencil);
		backpack.putInBackpack(ruler);
		backpack.putInBackpack(textbook);
		backpack.packAndCheck();
	}
}
