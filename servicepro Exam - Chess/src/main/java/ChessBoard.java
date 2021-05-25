import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;
import java.util.Scanner;

public class ChessBoard implements Chess {

	public String[][] board;

	public ChessBoard() {

	}

	public ChessBoard emptyBoard() {

		String[][] helpArray = new String[9][9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if ((j == 0) && (i != 8)) {
					helpArray[i][j] = String.valueOf(8 - i) + " |";
				} else {
					if (i != 8) {
						helpArray[i][j] = "  |";
					} else {
						switch (j) {
						case 0:
							helpArray[8][j] = "  ";
							break;
						case 1:
							helpArray[8][j] = " a ";
							break;
						case 2:
							helpArray[8][j] = " b ";
							break;
						case 3:
							helpArray[8][j] = " c ";
							break;
						case 4:
							helpArray[8][j] = " d ";
							break;
						case 5:
							helpArray[8][j] = " e ";
							break;
						case 6:
							helpArray[8][j] = " f ";
							break;
						case 7:
							helpArray[8][j] = " g ";
							break;
						case 8:
							helpArray[8][j] = " h ";
							break;
						}

					}
				}

			}
		}
		this.board = helpArray;
		return this;

	}

	public int getSizeX() {

		return board.length;
	}

	public ChessBoard getstartState() {

		return this;
	}

	@Override
	public void printBoard() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(board[i][j] + "");
			}
			System.out.println(" ");
		}
	}

	@Override
	public void save2TxtFile(String name) throws IOException {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				builder.append(board[i][j]);
				if (j < board.length - 1)
					builder.append("");
			}
			builder.append("\n");
		}

		BufferedWriter writer = new BufferedWriter(new FileWriter("src/test/resources/" + name));
		writer.write(builder.toString());
		writer.close();

	}
//  DEBUG
//	public void loadGamefromFileandPrint() throws FileNotFoundException {
//
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(new BufferedReader(new FileReader("src/test/resources/chess-01.txt")));
//
//		String[][] strArray = new String[8][8];
//		while (sc.hasNextLine()) {
//			for (int i = 0; i < strArray.length; i++) {
//				String[] line = sc.nextLine().trim().split(" |");
//				for (int j = 0; j < line.length; j++) {
//					strArray[i][j] = line[j];
//				}
//			}
//		}
//		System.out.println(Arrays.deepToString(strArray));
//	}

	public ChessBoard setPlayer1(String str, int j, String x) {

		board[8 - j][transformCoordinates(str)] = x.concat("|");
		return this;
	}

	public ChessBoard setPlayer2(String str, int j, String y) {

		board[8 - j][transformCoordinates(str)] = y.concat("|");
		return this;
	}

	@Override
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
