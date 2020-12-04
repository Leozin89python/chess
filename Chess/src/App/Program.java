package App;

import Chess.ChessMatch;
import Chess.ChessPosition;
import Chess.ChessPiece;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch cm = new ChessMatch();

		while (true) {
			UI.printBoard(cm.getPieces());
			System.out.println();
			System.out.println("Source: ");
			ChessPosition source = UI.readChessposition(sc);
			
			System.out.println();
			System.out.println("Target: ");
			ChessPosition target = UI.readChessposition(sc);
			
			ChessPiece capturedPiece = cm.performChessMove(source, target);
		}
	}
}
