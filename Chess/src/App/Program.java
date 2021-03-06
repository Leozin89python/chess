package App;

import java.util.InputMismatchException;
import java.util.Scanner;

import Chess.ChessException;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch cm = new ChessMatch();

		while (true) {
			try	{
				UI.clearScreen();
				UI.printBoard(cm.getPieces());
				System.out.println();
				System.out.println("Source: ");
				ChessPosition source = UI.readChessposition(sc);
				
				System.out.println();
				System.out.println("Target: ");
				ChessPosition target = UI.readChessposition(sc);
				
				ChessPiece capturedPiece = cm.performChessMove(source, target);
			
			}catch(ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch(Exception e) {
				System.out.println("error" + e.getMessage());
			}
		}
	}
}
