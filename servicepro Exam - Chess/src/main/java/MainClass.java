import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {
	public static void main(String[] args) {
		ChessBoard game = new ChessBoard();
		// get emptyBoard
		game.emptyBoard();
		game.emptyBoard().printBoard();
		// System.out.println(" ");
		// game.emptyBoard().startGame().printBoard();

		// get start State (when the (when the game starts)
		game.emptyBoard()//
				.setPlayer1("a", 2, "pa")//
				.setPlayer1("b", 2, "pa")//
				.setPlayer1("c", 2, "pa")//
				.setPlayer1("d", 2, "pa")//
				.setPlayer1("e", 2, "pa")//
				.setPlayer1("f", 2, "pa")//
				.setPlayer1("g", 2, "pa")//
				.setPlayer1("h", 2, "pa")//

				.setPlayer1("a", 1, "ro")//
				.setPlayer1("b", 1, "kn")//
				.setPlayer1("c", 1, "bi")//
				.setPlayer1("d", 1, "qu")//

				.setPlayer1("e", 1, "ki")//
				.setPlayer1("f", 1, "bi")//
				.setPlayer1("g", 1, "kn")//
				.setPlayer1("h", 1, "ro")//

				.setPlayer2("a", 7, "ɐd")//
				.setPlayer2("b", 7, "ɐd")//
				.setPlayer2("c", 7, "ɐd")//
				.setPlayer2("d", 7, "ɐd")//
				.setPlayer2("e", 7, "ɐd")//
				.setPlayer2("f", 7, "ɐd")//
				.setPlayer2("g", 7, "ɐd")//
				.setPlayer2("h", 7, "ɐd")//

				.setPlayer2("a", 8, "oɹ")//
				.setPlayer2("b", 8, "uʞ")//
				.setPlayer2("c", 8, "ıq")//
				.setPlayer2("d", 8, "nb")//

				.setPlayer2("e", 8, "ıʞ")//
				.setPlayer2("f", 8, "ıq")//
				.setPlayer2("g", 8, "uʞ")//
				.setPlayer2("h", 8, "oɹ")//

				.printBoard();

		try {
			game.save2TxtFile("chess-05.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		try {
//			game.loadGamefromFileandPrint();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
