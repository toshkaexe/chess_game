import java.io.IOException;

public interface Chess {
	
	void save2TxtFile(String name) throws IOException;

	void printBoard();

	int transformCoordinates(String str);
}
