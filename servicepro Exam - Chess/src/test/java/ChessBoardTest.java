
import org.junit.Test;

import junit.framework.TestCase;

public class ChessBoardTest extends TestCase {

	@Test
	public void test_transformCoordinates() {

		assertEquals(1, transformCoordinates("a"));
		assertEquals(2, transformCoordinates("b"));
		assertEquals(3, transformCoordinates("c"));
		assertEquals(4, transformCoordinates("d"));
		assertEquals(5, transformCoordinates("e"));
		assertEquals(6, transformCoordinates("f"));
		assertEquals(7, transformCoordinates("g"));
		assertEquals(8, transformCoordinates("h"));
		assertEquals(0, transformCoordinates("he"));

	}

	@Test
	public void test_ChessMap() {

		ChessBoard game = new ChessBoard();
		game.emptyBoard();

		assertEquals(9, game.getSizeX()); // with coordinates

	}

	public int transformCoordinates(String str) {
		int i = 0;
		switch (str) {
		case "a":
			i = 1;
			return i;
		case "b":
			i = 2;
			return i;
		case "c":
			i = 3;
			return i;
		case "d":
			i = 4;
			return i;
		case "e":
			i = 5;
			return i;
		case "f":
			i = 6;
			return i;
		case "g":
			i = 7;
			return i;
		case "h":
			i = 8;
			return i;
		}
		return 0;

	}

}
