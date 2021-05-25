# chess_game
https://github.com/toshkaexe/chess_game.git
https://github.com/toshkaexe/chess_game.git

Development	of	a	Java	library	for	the	game	of	chess:
Please	develop	this	library	according	to	the	described	tasks	and	test	your	results.	Also,	
regard	the	priority	in	which	the	tasks	are	listed.
IMPORTANT:	Please	only	do	the	tasks	listed	below.	The	Chess	library	does	NOT	need	to	be	
completed.	Functionality	for	the	rules	of	movement,	checking	of	pieces,	actual	two	player	
mode	or	some	kind	of	bot/ki	is	NOT	necessary	in	this	exam.

1. Create	the	necessary	Java	classes	to	implement	a	chess	board	(e.g.	ChessBoard.java,
Piece.java,	etc...)
2. Create	the	functionality	to	initiate	a	Chessboard.	A	board	can	be	full	(when	the
game	starts)	or	somewhere	in	between	while	playing.
3. Create	the	functionality	to	read	and	parse	the	given	txt	files	(located	under
src/test/resources),	which	represent	different	Chess	situations.
4. Initiate	the	ChessBoard	class	by	using	your file	parser	class.	Each	of	the	given	txt
files	should	work.
5. Write	at	least	4	Unit	tests to	check	that	the	functionality	of	reading	the txt	files	and
initiating	the	ChessBoard	works	(please	use	the	4	given	txt	files).
6. Create	the	functionality	to	write	any	ChessBoard	situation	to	a	txt	file	(in	the	file
format	as	the	given	example	files).
7. Please	write	at	least	4	Unit	tests	to	check	that	the	functionality	to	write	a
ChessBoard	to	a	txt	file works	correctly.
8. Add	functionality	to	the	ChessBoard	to	verify	that	only	the	correct	number	of	pieces
are	added.	For	example:	There	are	only	8	white	pawns	allowed...
9. Please	write	enough	Unit	tests	to	make	sure	that	the	ChessBoard	is	always
completely	verified.	For	example: An exception	should	be thrown	when	more	than
8	white	pawns	are	added	to	a	ChessBoard.
Source:
- Text	file	depicting	a	chess	gameplay	situation:
o src/test/resource/chess-startup.txt
o src/test/resource/chess-01.txt
o src/test/resource/chess-02.txt
o src/test/resource/chess-03.txt