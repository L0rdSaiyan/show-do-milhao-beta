import java.util.Random;         //Importando as classes Scanner e Random para o programa
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
  
    //Classe Scanner e classe Random
    Scanner leitor = new Scanner(System.in);
    Random aleatorio = new Random();
    
    //Criação das variáveis
    String n_jogador, jogador1, jogador2, resposta1, resposta2, resposta3, resposta4, resposta5, resposta6, resposta7, resposta8, resposta9, resposta10, resposta11, resposta12, resposta13, resposta14, resposta15, resposta_ajuda;
    //Ajudas
    String universitarios, cartas;
    int pulos=3;
    //Valores
    int pontuacao=0, corretas=0, incorretas=0, valor=0, valor_total=0, ajudas=4;
    //Variáveis que recebem a classe random
    int  n_rodrigo = aleatorio.nextInt(4) + 1, n_patrick = aleatorio.nextInt(4) + 1, n_ryan = aleatorio.nextInt(4) + 1, resposta_cartas = aleatorio.nextInt(4) + 1;
    
    
    System.out.println("Bem vindo ao Show do Milhão!");
    System.out.println("Deseja jogar com 1 jogador ou com 2 jogadores? \n1 - um jogador \n2 - 2 jogadores"); //Pergunta ao usuário o número de jogadores
    n_jogador=leitor.next();
    
    //Estrutura de decisão para verificar o número de jogadores
    if(n_jogador.equals("1") || (n_jogador.equals("um")) || (n_jogador.equals("Um")) || (n_jogador.equals("um jogador")) || (n_jogador.equals("Um jogador")) || (n_jogador.equals(""))){
        
        
        System.out.println("Informe o seu nome: ");
        jogador1=leitor.next();
  
  System.out.println("Lembrando que você tem um total de 4 ajudas. Você pode pedir ajuda para os universitários, pulos, cartas e eliminação. ");
  
  //Primeira pergunta
  System.out.println("Vamos para a primeira pergunta valendo $500 Reais: Quem é o criador da linguagem \"JavaScript\"? \n1 - Bill Gates \n2 - Brendan Eich       (Você pode usar umas das "+ajudas+" ajudas \n                          se desejar usar ajuda, responda a pergunta com \"ajuda\")        \n3 - Jackie Chan \n4 - Shigeru Miyamoto");
   resposta1=leitor.next();

    if(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich"))){
     System.out.println("Parabéns, "+jogador1+"! Você acertou a questão 1");
    
      resposta1="correta";
       pontuacao=500;
        corretas=1;
         incorretas=0;
         valor=500; //Valor correspondente à pergunta
         valor_total=valor_total+valor;
         valor=0; //Para evitar a criação de várias outras variáveis, a variável "valor" recebeu o valor 0 após ter sido somada com a variável "valor_total"
         
         
        
          }else if(resposta1.equals("Ajuda") || (resposta1.equals("ajuda")) || (resposta1.equals("help")) || (resposta1.equals("Help")) || (resposta1.equals("Ajudas")) || (resposta1.equals("ajudas"))){
              
              System.out.println("\nQual ajuda deseja receber? \n\nUniversitários = 3 universitários irão dar a resposta que eles acreditam ser a verdadeira e cabe à você confiar nelas ou não. \n\nPular = Você pode pular esta questão (Pode usar 3 vezes) . \n\nCartas = Você escolhe uma das 4 cartas e uma delas terá a resposta correta.");
              resposta_ajuda=leitor.next();
              ajudas=ajudas-1;
              resposta1=null;
               
               if(resposta_ajuda.equals("Universitários") || (resposta_ajuda.equals("universitários")) || (resposta_ajuda.equals("Universitarios")) || (resposta_ajuda.equals("universitarios")) || (resposta_ajuda.equals("Universitário")) || (resposta_ajuda.equals("universitário")) || (resposta_ajuda.equals("Universitario")) || (resposta_ajuda.equals("universitario"))){
                 
                 System.out.println("Aguardando as respostas dos universitários...");
                   
                   
                   if(n_rodrigo==1){
                       
                       
                       System.out.println("A resposta que o universitário Rodrigo acredita ser correta é a alternativa (1) - Bill Gates ");
                               
                         try{
                             
                         Thread.sleep(1000);
                             
                         }catch(InterruptedException goku){
                             
               
                         }
    
                   }else if(n_rodrigo==2){
                       
                       System.out.println("A resposta que o universitário Rodrigo acredita ser correta é a alternativa ("+n_rodrigo+") - Brendan Eich");
                       
                       try{
                           
                           Thread.sleep(1000);

                       }catch(InterruptedException goku){
                           
  
                       }
                       
  
                   }else if(n_rodrigo==3){
                       
                       System.out.println("A resposta que o universitário Rodrigo acredita ser correta é a alternativa ("+n_rodrigo+") - Jackie Chan");
                      
                      try{
                          
                          Thread.sleep(1000);
                          
                      }catch(InterruptedException goku){
                          

                      }
                      
                      
                   }else if(n_rodrigo==4){
                       
                       System.out.println("A resposta que o universitário Rodrigo acredita ser correta é a alternativa ("+n_rodrigo+") - Shigeru Miyamoto");
                   
                       try{
                           
                           Thread.sleep(1000);
                    
                       }catch(InterruptedException goku){
                           
                       }
                       
                       
                   }
                   
                   
                   if(n_patrick==1){
                       
                       
                       System.out.println("A resposta que o universitário Patrick acredita ser correta é a alternativa ("+n_patrick+") - Bill Gates ");
                      
                      try{
                          
                          Thread.sleep(1000);
                          
                      }catch(InterruptedException goku){
                          
                      }
                      
              
                   }else if(n_patrick==2){
                       
                        System.out.println("A resposta que o universitário Patrick acredita ser correta é a alternativa ("+n_patrick+") - Brendan Eich");
                    
                    try{
                        
                        Thread.sleep(1000);
                        
                    }catch(InterruptedException goku){
                        
                        
                    }
                    
          
                   }else if(n_patrick==3){
                       
            System.out.println("A resposta que o universitário Patrick acredita ser correta é a alternativa ("+n_patrick+") - Jackie Chan");

                    try{
                        
                        Thread.sleep(1000);
                        
                    }catch(InterruptedException goku){
                        
                        
                    }
                         
    
                   }else if(n_patrick==4){
                       
             System.out.println("A resposta que o universitário Patrick acredita ser correta é a alternativa ("+n_patrick+") - Shigeru Miyamoto");

                       try{
                           
                           Thread.sleep(1000);
                           
                       }catch(InterruptedException goku){
                           
                           
                       }
                       
                   }
                   
                   if(n_ryan==1){
                       
                   System.out.println("A resposta que o universitário Ryan acredita ser correta é a alternativa ("+n_ryan+") - Bill Gates ");

                  
                   }else if(n_ryan==2){
                       
                   System.out.println("A resposta que o universitário Ryan acredita ser correta é a alternativa ("+n_ryan+") - Brendan Eich");

                       
                       
                   }else if(n_ryan==3){
                       
                  System.out.println("A resposta que o universitário Ryan acredita ser correta é a alternativa ("+n_ryan+") - Jackie Chan");

                       
                   }else if(n_ryan==4){
                       
                System.out.println("A resposta que o universitário Ryan acredita ser correta é a alternativa ("+n_ryan+") - Shigeru Miyamoto");

                       
                   }
                   
                   System.out.println("\npergunta valendo $500 Reais: Quem é o criador da linguagem \"JavaScript\"? \n1 - Bill Gates \n2 - Brendan Eich  \n3 - Jackie Chan \n4 - Shigeru Miyamoto");
                   resposta1=leitor.next();
                   
                  
                   while(resposta1.equals("Ajuda") || (resposta1.equals("ajuda")) || (resposta1.equals("Ajudas")) || (resposta1.equals("ajudas")) || (resposta1.equals("help")) || (resposta1.equals("Help"))){
                    
                    System.out.println("Você já usou uma ajuda para esta pergunta!");
                    
                    
                       
                    System.out.println("\npergunta valendo $500 Reais: Quem é o criador da linguagem \"JavaScript\"? \n1 - Bill Gates \n2 - Brendan Eich  \n3 - Jackie Chan \n4 - Shigeru Miyamoto");
                    resposta1=leitor.next();
                    
                               
                    if(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich"))){
                   System.out.println("Parabéns, "+jogador1+"! Você acertou a questão 1");
    
                   resposta1="correta";
                    pontuacao=500;
                   corretas=1;
                    incorretas=0;
                    valor=500; //Valor correspondente à pergunta
                   valor_total=valor_total+valor;
                    valor=0; //Para evitar a criação de várias outras variáveis, a variável "valor" recebeu o valor 0 após ter sido somada com a variável "valor_total"
          
                   
                   
                 }else if(!(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich")))){
                     
                     System.out.println("Infelizmente você errou a primeira questão. A alternativa correta era a alternativa: 2 - Brendan Nike");
                     
                     
                     
                 }
                    
                   }
                
                
               }else if(resposta_ajuda.equals("Pular") || (resposta_ajuda.equals("pular")) || (resposta_ajuda.equals("Pula")) || (resposta_ajuda.equals("pula"))){
                   
                   
                   System.out.println("Ok, voce decidiu pular a questão.");
                   
                 
        resposta1="correta";
       pontuacao=500;
        corretas=1;
         incorretas=0;
         valor=500; //Valor correspondente à pergunta
         valor_total=valor_total+valor;
         valor=0; // Foi dado o valor 0 para a variável "valor" para que ela possa ser utilizada outras vezes e evitando assim a criação de uma variável "valor" para cada pergunta.
          pulos=pulos-1;        
                   
                   
                   
                   
                   
                   
               }else if(resposta_ajuda.equals("Cartas") || (resposta_ajuda.equals("cartas")) || (resposta_ajuda.equals("Carta")) || (resposta_ajuda.equals("carta")) || (resposta_ajuda.equals("Cards")) || (resposta_ajuda.equals("card"))){
                   
                   System.out.println("\nCartas: Quatro cartas de baralho são viradas e o participante escolhe uma. \nSe tirar o Rei, nenhuma alternativa errada é eliminada. \nÁs elimina uma alternativa, 2 elimina duas alternativas e 3 elimina todas as três alternativas erradas, restando apenas a correta.");
	               System.out.println("\n                                            ------------ CARTAS ------------- \n                                           |                                 | \n                                           |   ___     ___     ___     ___   |\n                                           |  |   |   |   |   |   |   |   |  |\n                                           |  | 1 |   | 2 |   | 3 |   | 4 |  |\n                                           |  |___|   |___|   |___|   |___|  |\n                                           ___________________________________");
                   System.out.println("\n\n                                                 Escolha uma das cartas");
                   cartas=leitor.next();
                   
                   //Aleatoriamente, uma carta vai ser gerada
                   
                   if (cartas.equals("1") || (cartas.equals("Um")) || (cartas.equals("um")) || (cartas.equals("Carta Um")) || (cartas.equals("Carta um")) || (cartas.equals("carta Um")) || (cartas.equals("carta um")) || (cartas.equals("Carta 1")) || (cartas.equals("carta 1"))){

                     
                     System.out.println("Você escolheu virar a carta um.");
                     
                           if (resposta_cartas==1){
                         
                              System.out.println("Voce tirou o Rei. Nenhuma alternativa foi eliminada.");
                              
                               
                              System.out.println("\nQuem é o criador da linguagem \"JavaScript\"? \n1 - Bill Gates \n2 - Brendan Eich  \n3 - Jackie Chan \n4 - Shigery Miyamoto");
                             resposta1=leitor.next();
                             
                             
                               if(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich"))){
                              
                              System.out.println("Voce acertou.");
                              
                              
                              resposta1="correta";
                              pontuacao=500;
                              corretas=1;
                              incorretas=0;
                              valor=500; //Valor correspondente à pergunta
                              valor_total=valor_total+valor;
                              valor=0; //Para evitar a criação de várias outras variáveis, a variável "valor" recebeu o valor 0 após ter sido somada com a variável "valor_total"
                             
                               }else if(!(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich")))){
                     
                                System.out.println("\nInfelizmente você errou a primeira questão. A alternativa correta era a alternativa: 2 - Brendan Nike");
                      
                                resposta1="incorreta";
                                pontuacao=0;
                                corretas=0;
                                incorretas=1;
                                valor=0;
                                valor_total=valor_total+valor_total;
                              
                                   
                               }
                                    
                              
                           
                          
                    
                               
                           }else if (resposta_cartas==2){
                         
                              System.out.println("Você tirou o Ás. Uma alternativa foi eliminada.");
                              
                             System.out.println("\nQuem é o criador da linguagem \"JavaScript\"? \n1 - Bill Gates \n2 - Brendan Eich  \n3 - Jackie Chan");
                             resposta1=leitor.next();
                             
                              
                             
                    
                          
               
                              System.out.println("\npergunta valendo $500 Reais: Quem é o criador da linguagem \"JavaScript\"? \n1 - Bill Gates \n2 - Brendan Eich  \n3 - Jackie Chan \n4 - Shigeru Miyamoto");
                             resposta1=leitor.next();
                             
                              
                              if(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich"))){
                              
                              resposta1="correta";
                              pontuacao=500;
                              corretas=1;
                              incorretas=0;
                              valor=500; //Valor correspondente à pergunta
                              valor_total=valor_total+valor;
                              valor=0; //Para evitar a criação de várias outras variáveis, a variável "valor" recebeu o valor 0 após ter sido somada com a variável "valor_total"
                             
                               }else if(!(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich")))){
                     
                                System.out.println("\nInfelizmente você errou a primeira questão. A alternativa correta era a alternativa: 2 - Brendan Nike");
                      
                                resposta1="incorreta";
                                pontuacao=0;
                                corretas=0;
                                incorretas=1;
                                valor=0;
                                valor_total=valor_total+valor_total;
                              }
         
                           
                         
                        
                    }else if (resposta_cartas==3){
                             
                             System.out.println("Você tirou os 2 coraçõess. 2 alternativas foram eliminadas.");
                              
                             System.out.println("\nQuem é o criador da linguagem \"JavaScript\"?  \n2 - Brendan Eich  \n3 - Jackie Chan");
                             resposta1=leitor.next();
                             
                              
     
                              if(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich"))){
                              
                              resposta1="correta";
                              pontuacao=500;
                              corretas=1;
                              incorretas=0;
                              valor=500; //Valor correspondente à pergunta
                              valor_total=valor_total+valor;
                              valor=0; //Para evitar a criação de várias outras variáveis, a variável "valor" recebeu o valor 0 após ter sido somada com a variável "valor_total"
                             
                               }else if(!(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich")))){
                     
                                System.out.println("\nInfelizmente você errou a primeira questão. A alternativa correta era a alternativa: 2 - Brendan Nike");
                      
                                resposta1="incorreta";
                                pontuacao=0;
                                corretas=0;
                                incorretas=1;
                                valor=0;
                                valor_total=valor_total+valor_total;
                              }
         
                        
                    
                              }else if (resposta_cartas==4){
                                 
                              System.out.println("Você tirou os 3 corações. 3 alternativas foram eliminadas.");
                              
                               System.out.println("\nQuem é o criador da linguagem \"JavaScript\"?  \n2 - Brendan Eich");
                             resposta1=leitor.next();
                             
                             
                    
                              
                               if(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich"))){
                              
                              resposta1="correta";
                              pontuacao=500;
                              corretas=1;
                              incorretas=0;
                              valor=500; //Valor correspondente à pergunta
                              valor_total=valor_total+valor;
                              valor=0; //Para evitar a criação de várias outras variáveis, a variável "valor" recebeu o valor 0 após ter sido somada com a variável "valor_total"
                             
                               }else if(!(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich")))){
                     
                                System.out.println("\nInfelizmente você errou a primeira questão. A alternativa correta era a alternativa: 2 - Brendan Nike");
                      
                                resposta1="incorreta";
                                pontuacao=0;
                                corretas=0;
                                incorretas=1;
                                valor=0;
                                valor_total=valor_total+valor_total;
                              
                                   
                               }
         
                              
                                 
                             }     
                         
  
                     
                     
                     
                     
                   }else if(cartas.equals("2") || (cartas.equals("Dois")) || (cartas.equals("dois")) || (cartas.equals("Carta Dois")) || (cartas.equals("carta Dois")) || (cartas.equals("Carta 2")) || (cartas.equals("carta 2"))){
                         
                            System.out.println("Você escolheu a carta número 2.");
                            
                            if (resposta_cartas==1){
                         
                             System.out.println("Voce tirou o Rei. Nenhuma alternativa foi eliminada.");
                              
                               
                              System.out.println("\nQuem é o criador da linguagem \"JavaScript\"? \n1 - Bill Gates \n2 - Brendan Eich  \n3 - Jackie Chan \n4 - Shigery Miyamoto");
                             resposta1=leitor.next();
                             
                             
                               if(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich"))){
                              
                              resposta1="correta";
                              pontuacao=500;
                              corretas=1;
                              incorretas=0;
                              valor=500; //Valor correspondente à pergunta
                              valor_total=valor_total+valor;
                              valor=0; //Para evitar a criação de várias outras variáveis, a variável "valor" recebeu o valor 0 após ter sido somada com a variável "valor_total"
                             
                               }else if(!(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich")))){
                     
                                System.out.println("\nInfelizmente você errou a primeira questão. A alternativa correta era a alternativa: 2 - Brendan Nike");
                      
                                resposta1="incorreta";
                                pontuacao=0;
                                corretas=0;
                                incorretas=1;
                                valor=0;
                                valor_total=valor_total+valor_total;
                              
                                   
                               }
         
                             
                              while(resposta1.equals("Ajuda") || (resposta1.equals("ajuda")) || (resposta1.equals("help")) || (resposta1.equals("Help"))){
                    
                              
                              System.out.println("Você já usou uma ajuda para esta pergunta!");
               
               
                              System.out.println("\npergunta valendo $500 Reais: Quem é o criador da linguagem \"JavaScript\"? \n1 - Bill Gates \n2 - Brendan Eich  \n3 - Jackie Chan \n4 - Shigeru Miyamoto");
                             resposta1=leitor.next();
                    
                              
                          
                    }
                             
                              
                    
                     
                           
                           
                              }else if (resposta_cartas==2){
                         
                             System.out.println("Você tirou o Ás. Uma alternativa foi eliminada.");
                              
                             System.out.println("\nQuem é o criador da linguagem \"JavaScript\"? \n1 - Bill Gates \n2 - Brendan Eich  \n3 - Jackie Chan");
                             resposta1=leitor.next();
                         
                             
                              
                              if(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich"))){
                              
                              resposta1="correta";
                              pontuacao=500;
                              corretas=1;
                              incorretas=0;
                              valor=500; //Valor correspondente à pergunta
                              valor_total=valor_total+valor;
                              valor=0; //Para evitar a criação de várias outras variáveis, a variável "valor" recebeu o valor 0 após ter sido somada com a variável "valor_total"
                             
                               }else if(!(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich")))){
                     
                                System.out.println("\nInfelizmente você errou a primeira questão. A alternativa correta era a alternativa: 2 - Brendan Nike");
                      
                                resposta1="incorreta";
                                pontuacao=0;
                                corretas=0;
                                incorretas=1;
                                valor=0;
                                valor_total=valor_total+valor_total;
                              }
         
                        
                    
                         
                         
                    }else if (resposta_cartas==3){
                             
                             System.out.println("Você tirou os 2 coraçõess. 2 alternativas foram eliminadas.");
                              
                             System.out.println("\nQuem é o criador da linguagem \"JavaScript\"?  \n2 - Brendan Eich  \n3 - Jackie Chan");
                             resposta1=leitor.next();
                             
                              
                             
               
                              System.out.println("\npergunta valendo $500 Reais: Quem é o criador da linguagem \"JavaScript\"? \n1 - Bill Gates \n2 - Brendan Eich ");
                             resposta1=leitor.next();
                             
                              
                              if(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich"))){
                              
                              System.out.println("Você acertou a pergunta!");
                              
                              resposta1="correta";
                              pontuacao=500;
                              corretas=1;
                              incorretas=0;
                              valor=500; //Valor correspondente à pergunta
                              valor_total=valor_total+valor;
                              valor=0; //Para evitar a criação de várias outras variáveis, a variável "valor" recebeu o valor 0 após ter sido somada com a variável "valor_total"
                             
                               }else if(!(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich")))){
                     
                                System.out.println("\nInfelizmente você errou a primeira questão. A alternativa correta era a alternativa: 2 - Brendan Nike");
                      
                                resposta1="incorreta";
                                pontuacao=0;
                                corretas=0;
                                incorretas=1;
                                valor=0;
                                valor_total=valor_total+valor_total;
                              }
         
                        
                    
                                  
                    }else if (resposta_cartas==4){
                                 
                             
                             System.out.println("Você tirou os 3 corações. 3 alternativas foram eliminadas.");
                              
                               System.out.println("\nQuem é o criador da linguagem \"JavaScript\"?  \n2 - Brendan Eich");
                             resposta1=leitor.next();
                             
                             
                              
                              System.out.println("Você já usou uma ajuda para esta pergunta!");
               
               
                              System.out.println("\npergunta valendo $500 Reais: Quem é o criador da linguagem \"JavaScript\"? \n2 - Brendan Eich");
                             resposta1=leitor.next();
                    
                              
                               if(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich"))){
                              
                              resposta1="correta";
                              pontuacao=500;
                              corretas=1;
                              incorretas=0;
                              valor=500; //Valor correspondente à pergunta
                              valor_total=valor_total+valor;
                              valor=0; //Para evitar a criação de várias outras variáveis, a variável "valor" recebeu o valor 0 após ter sido somada com a variável "valor_total"
                             
                               }else if(!(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich")))){
                     
                                System.out.println("\nInfelizmente você errou a primeira questão. A alternativa correta era a alternativa: 2 - Brendan Nike");
                      
                                resposta1="incorreta";
                                pontuacao=0;
                                corretas=0;
                                incorretas=1;
                                valor=0;
                                valor_total=valor_total+valor_total;
                              
                                   
                               }
         
                             
                             
                             
                             
                             
                                 
                             }              
                             
                
            
                
          
               }else if(cartas.equals("3") || (cartas.equals("Três")) || (cartas.equals("Tres")) || (cartas.equals("três")) || (cartas.equals("tres"))  || (cartas.equals("Carta Três")) || (cartas.equals("carta três")) || (cartas.equals("Carta 3")) || (cartas.equals("carta tres")) || (cartas.equals("carta três"))){

                    
                           if (resposta_cartas==1){
                         
                        System.out.println("Voce tirou o Rei. Nenhuma alternativa foi eliminada.");
                              
                               
                              System.out.println("\nQuem é o criador da linguagem \"JavaScript\"? \n1 - Bill Gates \n2 - Brendan Eich  \n3 - Jackie Chan \n4 - Shigery Miyamoto");
                             resposta1=leitor.next();
                             
                             
               
               
                              
                               if(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich"))){
                              
                              resposta1="correta";
                              pontuacao=500;
                              corretas=1;
                              incorretas=0;
                              valor=500; //Valor correspondente à pergunta
                              valor_total=valor_total+valor;
                              valor=0; //Para evitar a criação de várias outras variáveis, a variável "valor" recebeu o valor 0 após ter sido somada com a variável "valor_total"
                             
                               }else if(!(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich")))){
                     
                                System.out.println("\nInfelizmente você errou a primeira questão. A alternativa correta era a alternativa: 2 - Brendan Nike");
                      
                                resposta1="incorreta";
                                pontuacao=0;
                                corretas=0;
                                incorretas=1;
                                valor=0;
                                valor_total=valor_total+valor_total;
                              
                                   
                               }
                             
                             
                             
                          
                    
                              
                           
                          
                    }else if (resposta_cartas==2){
                         
                         System.out.println("Você tirou o Ás. Uma alternativa foi eliminada.");
                              
                             System.out.println("\nQuem é o criador da linguagem \"JavaScript\"? \n1 - Bill Gates \n2 - Brendan Eich  \n3 - Jackie Chan");
                             resposta1=leitor.next();
                             
                              
               
               
                              System.out.println("\npergunta valendo $500 Reais: Quem é o criador da linguagem \"JavaScript\"? \n1 - Bill Gates \n2 - Brendan Eich  \n3 - Jackie Chan \n4 - Shigeru Miyamoto");
                             resposta1=leitor.next();
                             
                              
                              if(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich"))){
                              
                              resposta1="correta";
                              pontuacao=500;
                              corretas=1;
                              incorretas=0;
                              valor=500; //Valor correspondente à pergunta
                              valor_total=valor_total+valor;
                              valor=0; //Para evitar a criação de várias outras variáveis, a variável "valor" recebeu o valor 0 após ter sido somada com a variável "valor_total"
                             
                               }else if(!(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich")))){
                     
                                System.out.println("\nInfelizmente você errou a primeira questão. A alternativa correta era a alternativa: 2 - Brendan Nike");
                      
                                resposta1="incorreta";
                                pontuacao=0;
                                corretas=0;
                                incorretas=1;
                                valor=0;
                                valor_total=valor_total+valor_total;
                              }
         
                        
                    
                         
                    }else if (resposta_cartas==3){
                             
                            System.out.println("Você tirou os 2 coraçõess. 2 alternativas foram eliminadas.");
                              
                             System.out.println("\nQuem é o criador da linguagem \"JavaScript\"? \n2 - Brendan Eich  \n3 - Jackie Chan");
                             resposta1=leitor.next();
                             
                              
                              
                              
                              if(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich"))){
                              
                              resposta1="correta";
                              pontuacao=500;
                              corretas=1;
                              incorretas=0;
                              valor=500; //Valor correspondente à pergunta
                              valor_total=valor_total+valor;
                              valor=0; //Para evitar a criação de várias outras variáveis, a variável "valor" recebeu o valor 0 após ter sido somada com a variável "valor_total"
                             
                               }else if(!(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich")))){
                     
                                System.out.println("\nInfelizmente você errou a primeira questão. A alternativa correta era a alternativa: 2 - Brendan Nike");
                      
                                resposta1="incorreta";
                                pontuacao=0;
                                corretas=0;
                                incorretas=1;
                                valor=0;
                                valor_total=valor_total+valor_total;
                              }
         
                        
                   
                                  
                    }else if (resposta_cartas==4){
                                 
                         System.out.println("Você tirou os 3 corações. 3 alternativas foram eliminadas.");
                              
                               System.out.println("\nQuem é o criador da linguagem \"JavaScript\"?  \n2 - Brendan Eich");
                             resposta1=leitor.next();
                             
                              
                    
                              
                               if(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich"))){
                              
                              resposta1="correta";
                              pontuacao=500;
                              corretas=1;
                              incorretas=0;
                              valor=500; //Valor correspondente à pergunta
                              valor_total=valor_total+valor;
                              valor=0; //Para evitar a criação de várias outras variáveis, a variável "valor" recebeu o valor 0 após ter sido somada com a variável "valor_total"
                             
                               }else if(!(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich")))){
                     
                                System.out.println("\nInfelizmente você errou a primeira questão. A alternativa correta era a alternativa: 2 - Brendan Nike");
                      
                                resposta1="incorreta";
                                pontuacao=0;
                                corretas=0;
                                incorretas=1;
                                valor=0;
                                valor_total=valor_total+valor_total;
                              
                                   
                               }
         
                              
                                 
                             }     
                         
                     
                     
                     
                    
                                 
                                

               
                    }else if(cartas.equals("4") || (cartas.equals("Quatro")) || (cartas.equals("quatro"))){
                        
                        System.out.println("Você escolheu virar a carta 4.");
                       
                           if (resposta_cartas==1){
                         
                              System.out.println("Voce tirou o Rei. Nenhuma alternativa foi eliminada.");
                              
                               
                              System.out.println("\nQuem é o criador da linguagem \"JavaScript\"? \n1 - Bill Gates \n2 - Brendan Eich  \n3 - Jackie Chan \n4 - Shigery Miyamoto");
                             resposta1=leitor.next();
                             
                              
                    
                              
                               if(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich"))){
                              
                              resposta1="correta";
                              pontuacao=500;
                              corretas=1;
                              incorretas=0;
                              valor=500; //Valor correspondente à pergunta
                              valor_total=valor_total+valor;
                              valor=0; //Para evitar a criação de várias outras variáveis, a variável "valor" recebeu o valor 0 após ter sido somada com a variável "valor_total"
                             
                               }else if(!(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich")))){
                     
                                System.out.println("\nInfelizmente você errou a primeira questão. A alternativa correta era a alternativa: 2 - Brendan Nike");
                      
                                resposta1="incorreta";
                                pontuacao=0;
                                corretas=0;
                                incorretas=1;
                                valor=0;
                                valor_total=valor_total+valor_total;
                              
                                   
                              }
                         
              
                    
                         
                              
                           
                           }else if (resposta_cartas==2){
                         
                         System.out.println("Você tirou o Ás. Uma alternativa foi eliminada.");
                         
                         
                    }else if (resposta_cartas==3){
                             
                             
                             System.out.println("Você tirou os 2 coraçõess. 2 alternativas foram eliminadas.");
                              
                             System.out.println("\nQuem é o criador da linguagem \"JavaScript\"? \n2 - Brendan Eich  \n3 - Jackie Chan");
                             resposta1=leitor.next();
                             
                              
                              
                              
                              if(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich"))){
                              
                              resposta1="correta";
                              pontuacao=500;
                              corretas=1;
                              incorretas=0;
                              valor=500; //Valor correspondente à pergunta
                              valor_total=valor_total+valor;
                              valor=0; //Para evitar a criação de várias outras variáveis, a variável "valor" recebeu o valor 0 após ter sido somada com a variável "valor_total"
                             
                               }else if(!(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich")))){
                     
                                System.out.println("\nInfelizmente você errou a primeira questão. A alternativa correta era a alternativa: 2 - Brendan Nike");
                      
                                resposta1="incorreta";
                                pontuacao=0;
                                corretas=0;
                                incorretas=1;
                                valor=0;
                                valor_total=valor_total+valor_total;
                              }
         
                        
                    }
                             
                                  
                    }else if (resposta_cartas==4){
                                 
                                System.out.println("Você tirou os 3 corações. 3 alternativas foram eliminadas.");
                              
                               System.out.println("\nQuem é o criador da linguagem \"JavaScript\"?  \n2 - Brendan Eich");
                             resposta1=leitor.next();
                             
                             
                    
                              
                               if(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich"))){
                              
                              resposta1="correta";
                              pontuacao=500;
                              corretas=1;
                              incorretas=0;
                              valor=500; //Valor correspondente à pergunta
                              valor_total=valor_total+valor;
                              valor=0; //Para evitar a criação de várias outras variáveis, a variável "valor" recebeu o valor 0 após ter sido somada com a variável "valor_total"
                             
                               }else if(!(resposta1.equals("brendaneich") || (resposta1.equals("BrendanEich")) || (resposta1.equals("1")) || (resposta1.equals("um")) || (resposta1.equals("Um")) || (resposta1.equals("Brendan Eich")) || (resposta1.equals("brendan eich")))){
                     
                                System.out.println("\nInfelizmente você errou a primeira questão. A alternativa correta era a alternativa: 2 - Brendan Nike");
                      
                                resposta1="incorreta";
                                pontuacao=0;
                                corretas=0;
                                incorretas=1;
                                valor=0;
                                valor_total=valor_total+valor_total;
                              
                                   
                               }
         
                              
                                 
                             }     
             
                     }
                                 
                             }              
 
          
                    }
             
               
               if(ajudas==0){
                   
                   System.out.println("Voce não tem mais ajudas!");
                   
               }
              
              
        
          
          
        
             
                 System.out.println("Qual o navegador mais usado?: ");
                  resposta2=leitor.next();
             
                   if(resposta2.equals("Chrome") || (resposta2.equals("chrome"))){
            
                    System.out.println("Você acertou a questão 2!");
          
                   resposta2="correta";
                  pontuacao=pontuacao+1;
                 corretas=corretas+1;
                incorretas=incorretas;
               
                       
               }else if(!(resposta2.equals("Chrome") || (resposta2.equals("chrome")))){
              
              System.out.println("Você errou a primeira questão.");
             
             resposta2="incorreta";
            pontuacao=pontuacao;
           corretas=corretas;
          incorretas=incorretas+1;
         
                   
         }
        
        System.out.println("Qual o nome da linguagem padronizada do JavaScript?: ");
       resposta3=leitor.next();
     
      if(resposta3.equals("EcmaScript") || (resposta3.equals("ecmascript"))){
    
     System.out.println("Você acertou a questão 3!");
   
    resposta3="correta";
   pontuacao=pontuacao+1;
  corretas=corretas+1;
 incorretas=incorretas;

          
}else if(!(resposta3.equals("EcmaScript") || (resposta3.equals("ecmascript")))){
 
 System.out.println("Você errou a questão 3.");
 
  resposta4="incorreta";
   pontuacao=pontuacao;
    corretas=corretas;
     incorretas=incorretas+1;
  
      }
      
       System.out.println("Cite um dos nomes que seriam colocados no lugar de \"JavaScript\"");
        resposta4=leitor.next();
        
         if(resposta4.equals("moca") || (resposta4.equals("Moca")) || (resposta4.equals("LiveScript")) || (resposta4.equals("livescript"))){
      
          System.out.println("Você acertou a questão 4!");
       
           resposta4="correta";
            pontuacao=pontuacao+1;
             corretas=corretas+1;
              incorretas=incorretas;
               
             
             
         }else if(!(resposta4.equals("moca") || (resposta4.equals("Moca")) || (resposta4.equals("LiveScript")) || (resposta4.equals("livescript")))){
             
             System.out.println("Você errou a 4 questão.");
             resposta4="incorreta";
             pontuacao=pontuacao;
             corretas=corretas;
             incorretas=incorretas+1;
             
             
         }
               
              
               
               
               
               
System.out.println("Qual o nome do programa que permite emular o JavaScript fora do navegador?: ");
resposta5=leitor.next();
                 
                 
if(resposta5.equals("NodeJs") || (resposta5.equals("nodejs")) || (resposta5.equals("node js"))){
                
                System.out.println("Você acertou a 5 questão!");
                resposta5="correta";
                pontuacao=pontuacao+1;
                corretas=corretas+1;
                incorretas=incorretas;
            
        
    }else if(!(resposta5.equals("NodeJs") || (resposta5.equals("nodejs")) || (resposta5.equals("node js")))){
        
        
        
        
        
        
        
    }



/*
     else if (n_jogador.equals("2") || (n_jogador.equals("dois")) || (n_jogador.equals("Dois")) || (n_jogador.equals("dois jogadores")) || (n_jogador.equals("Dois jogadores")) || (n_jogador.equals("Dois Jogadores"))){
         
         
         System.out.println("Informe o nome do primeiro jogador: ");
         jogador1=leitor.next();
         System.out.println("Informe o nome do segundo jogador: ");
         jogador2=leitor.next();
         
         
         
         
         
         
         
         
     }
 
 */
	}
}


    
	
