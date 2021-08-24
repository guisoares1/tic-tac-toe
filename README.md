# tic-tac-toe
 Jogo da velha em rede, Implementado em java. 
## Funcionalidade de verificação de que alguém ganhou
```java
public boolean isGameOver() 
   {
	   int n = 3;
	   for(int i = 0, c=0; i < n; i++){
           if( board[ i +c ].equals( MARKS[ PLAYER_X ] )&& board[ i+c+1 ].equals( MARKS[ PLAYER_X ] ) && board[ i+c+2 ].equals( MARKS[ PLAYER_X ] )) {
        	   displayMessage( "\nWin: " + (Winner = MARKS[ PLAYER_X ]) );
               return(true);
           }
           c=c+2;
       }
	   
	   for(int i = 0, c=0; i < n; i++){
           if( board[ i +c ].equals( MARKS[ PLAYER_O ] )&& board[ i+c+1 ].equals( MARKS[ PLAYER_O ] ) && board[ i+c+2 ].equals( MARKS[ PLAYER_O ] )) {
        	   displayMessage( "\nWin: " +  (Winner = MARKS[ PLAYER_O ]) );
        	   return(true);
           }
           c=c+2;
       }
	   
       //check row
	   for(int i = 0; i < n; i++){
           if( board[ i ].equals( MARKS[ PLAYER_X ] )&& board[ i+3 ].equals( MARKS[ PLAYER_X ] ) && board[ i+6 ].equals( MARKS[ PLAYER_X ] )) {
        	   displayMessage( "\nWin: " + (Winner = MARKS[ PLAYER_X ])  );
        	   return(true);
           }
       }
	   for(int i = 0; i < n; i++){
           if( board[ i ].equals( MARKS[ PLAYER_O ] )&& board[ i+3 ].equals( MARKS[ PLAYER_O ] ) && board[ i+6 ].equals( MARKS[ PLAYER_O ] )) {
        	   displayMessage( "\nWin: " + (Winner = MARKS[ PLAYER_O ])  );
        	   return(true);
           }
       }
	   

       //check diag and anti diag
       if( board[ 0 ].equals( MARKS[ PLAYER_X ] )&& board[ 4 ].equals( MARKS[ PLAYER_X ] ) && board[ 8 ].equals( MARKS[ PLAYER_X ] )||
     	   board[ 2 ].equals( MARKS[ PLAYER_X ] )&& board[ 4 ].equals( MARKS[ PLAYER_X ] ) && board[ 6 ].equals( MARKS[ PLAYER_X ] )    )  
       {
    	   displayMessage( "\nWin: " + (Winner = MARKS[ PLAYER_X ]) );
    	   return(true);
       }
       
       if( board[ 0 ].equals( MARKS[ PLAYER_O ] )&& board[ 4 ].equals( MARKS[ PLAYER_O ] ) && board[ 8 ].equals( MARKS[ PLAYER_O ] )||
           board[ 2 ].equals( MARKS[ PLAYER_O ] )&& board[ 4 ].equals( MARKS[ PLAYER_O ] ) && board[ 6 ].equals( MARKS[ PLAYER_O ] )    )  
           {
    	       displayMessage( "\nWin: " + (Winner = MARKS[ PLAYER_O ])  );
    	       
    	       return(true);
           }

       //check draw
       if(total == 9){
    	   displayMessage( "\nDraw: "  );
    	   Winner = "Draw";
    	   return(true);
       }
       
	   return false; // this is left as an exercise
   } // end method isGameOver
   ```
 ## Descrição textual e com uma figura ilustrativa da estrutura do programa
 Vitoria X:
 ![alt text](https://github.com/guisoares1/Imagens/blob/main/VitoriaX.png)
 
  Vitoria O:
 ![alt text](https://github.com/guisoares1/Imagens/blob/main/VitoriaO.png)
 
 Empate:
 ![alt text](https://github.com/guisoares1/Imagens/blob/main/Draw.png)

## Implementar a persistência do estado do jogo com JDBC ou JPA. Você deve usar como chave primária do estado do jogo uma string fornecida pelos jogadores.
Arquivo ["ClientTicTacToeDAO"](https://github.com/guisoares1/tic-tac-toe/blob/main/App/infra/ClientTicTacToeDAO.java). Classe é chamada no arquivo ["TicTacToeServer.Java"](https://github.com/guisoares1/tic-tac-toe/blob/main/App/TicTacToeServer.java), linha 347.

## Professor:
[Marcelo de Almeida Maia](http://www.portal.facom.ufu.br/pessoas/docentes/marcelo-de-almeida-maia)
