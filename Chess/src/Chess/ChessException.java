package Chess;

import BoardGame.BoardException;

public class ChessException extends BoardException {
	private static final long seralVersionUID = 1L;
	
	public ChessException(String msg) {
		super(msg);
	}
}
