package chess;

import java.util.Collection;
import java.util.HashSet;

/**
 * For a class that can manage a chess game, making moves on a board
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessGame {

    private TeamColor teamTurn;
    private ChessBoard board;

    public ChessGame() {
        teamTurn = TeamColor.WHITE;
        board = new ChessBoard();
        //FIXME: reset the board
        //board.resetBoard();
    }

    /**
     * SIGNATURE DEFINED BY COURSE!
     * @return Which team's turn it is
     */
    public TeamColor getTeamTurn() {
        return teamTurn;
    }

    /**
     * Set's which teams turn it is
     * SIGNATURE DEFINED BY COURSE!
     *
     * @param team the team whose turn it is
     */
    public void setTeamTurn(TeamColor team) {
        teamTurn = team;
    }

    /**
     * Enum identifying the 2 possible teams in a chess game
     * SIGNATURE DEFINED BY COURSE!
     */
    public enum TeamColor {
        WHITE,
        BLACK
    }

    /**
     * Gets a valid moves for a piece at the given location
     * SIGNATURE DEFINED BY COURSE!
     *
     * @param startPosition the piece to get valid moves for
     * @return Set of valid moves for requested piece, or null if no piece at
     * startPosition
     */
//    public Collection<ChessMove> validMoves(ChessPosition startPosition) {
//        ChessPiece piece = board.getPiece(startPosition);
//        if (piece == null) { return null; }
//
//        HashSet<ChessMove> moves = (HashSet<ChessMove>) piece.pieceMoves(board, startPosition);
//        for (ChessMove move : moves) {
//            board.clone();
//        }
//    }

    /**
     * Makes a move in a chess game
     * SIGNATURE DEFINED BY COURSE!
     *
     * @param move chess move to preform
     * @throws InvalidMoveException if move is invalid
     */
    public void makeMove(ChessMove move) throws InvalidMoveException {
        throw new RuntimeException("Not implemented");
    }

    /**
     * Determines if the given team is in check
     * SIGNATURE DEFINED BY COURSE!
     *
     * @param teamColor which team to check for check
     * @return True if the specified team is in check
     */
    public boolean isInCheck(TeamColor teamColor) {
        ChessPosition kingPosition = board.findKing(teamColor);
        board.getPiece(kingPosition).pieceMoves(board, kingPosition);

        return board.canBeCaptured(kingPosition);
    }

    /**
     * Determines if the given team is in checkmate
     * SIGNATURE DEFINED BY COURSE!
     *
     * @param teamColor which team to check for checkmate
     * @return True if the specified team is in checkmate
     */
    public boolean isInCheckmate(TeamColor teamColor) {
        throw new RuntimeException("Not implemented");
    }

    /**
     * Determines if the given team is in stalemate, which here is defined as having
     * no valid moves
     * SIGNATURE DEFINED BY COURSE!
     *
     * @param teamColor which team to check for stalemate
     * @return True if the specified team is in stalemate, otherwise false
     */
    public boolean isInStalemate(TeamColor teamColor) {
        throw new RuntimeException("Not implemented");
    }

    /**
     * Sets this game's chessboard with a given board
     * SIGNATURE DEFINED BY COURSE!
     *
     * @param board the new board to use
     */
    public void setBoard(ChessBoard board) {
        this.board = board;
    }

    /**
     * Gets the current chessboard
     * SIGNATURE DEFINED BY COURSE!
     *
     * @return the chessboard
     */
    public ChessBoard getBoard() {
        return board;
    }
}
