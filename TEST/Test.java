class FreshJuice {
	enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
	enum FreshJuiceColor{ ORANGE, WHITE, PINK, BLUE, GREEN }
	FreshJuiceSize size;
	FreshJuiceColor color;
}
public class Test {
	public static void main(String[] args) {
	FreshJuice juice = new FreshJuice();
	juice.size = FreshJuice.FreshJuiceSize.LARGE;
	juice.color = FreshJuice.FreshJuiceColor.GREEN;
	System.out.println("Hello, girls! Here the juice: " + juice.size + " and " + juice.color);
	}
}