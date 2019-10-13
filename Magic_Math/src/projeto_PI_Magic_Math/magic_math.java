/**
 *
 * @author renan.smaciel
 * 
 *             ****** ATENCAO ******
 *  Sempre lembre de comentar o codgo, quando criar alguma cariavel ou funcao 
 * lembre-se sempre que tem que ser entendido por todos do grupo
 * se possivel faca uma breve descricao do que a funcao faz e quando 
 * criar variavel indique para que ela serve;
 * 
 */
package projeto_PI_Magic_Math;

import java.util.Scanner;

/**
 *
 * @author I
 */
public class magic_math 
{
     static Scanner entrar = new Scanner(System.in);//objeto criado para receber dados que serão armazenados em variaveis
     
     static void cabecalhoo()// cabeçalho do programa
     { 
         
         System.out.println("╔════•ೋೋ•════╗ \n" +
                            "         Magic Math\n" +
                            "╚════•ೋೋ•════╝");
         System.out.println("        ︻雷魔▅▆▇◤");
         System.out.println("");
         System.out.println("━━╮╰╮┊┊┊┊┊┊\n" +
                            "┊┊╰╮╰━▂▂▂▂┊┊┊┊┊┊\n" +
                            "┊▂╱▔╲▔╱┏┳╮╲┊┊ᶤ.╭╮\n" +
                            "▂╲▂▂╱╲╲╰┻┛╱▔▔▔▔┃\n" +
                            "╲▂▂╱╭╯╱▔▔╱▔▔▔▽▽╯\n" +
                            "┊╱╱╭╯╱▔▔▔╲▂▂△▂△╮\n" +
                            "━━━╯╱╱╭━━━━━━━━╯");
        
         
        
     }
     
     
     static int menuInicial(){ //tela(menu) inicial do jogo
        int opcaoEntrar;
        
        System.out.println("");
        System.out.println("╔════•ೋೋ•════╗ \n" +
                            "            Menu\n" +
                           "╚════•ೋೋ•════╝");
        
        
        System.out.println("1- Jogar: ");
        System.out.println("2- Historia: ");
        System.out.println("3- Créditos: ");
        System.out.println("4- Sair: ");
        System.out.println("");
        System.out.println("Escolha uma opção: ");
        
            System.out.println(""
                    + "     _\n" +
"            ,---.          U\n" +
"           ;     \\         ;\n" +
"       .==\\\"/==.  `-.___.-'\n" +
"      ((+) .  .:)\n" +
"      |`.-(o)-.'|\n" +
"      \\/  \\_/  \\/         ");
                    
        
        opcaoEntrar = entrar.nextInt();
        
        return opcaoEntrar;
    }
     
     
     
     static int opcoesMenu(int op){ // opções ao escolher uma das alternativas do menu inicial
        
        
        switch(op){
            case 1:
                System.out.println("                                             _________________________\n" +
"   _______________________-------------------                         `\\\n" +
" /:--__                                                                |\n" +
"||< > |                                     ___________________________/\n" +
"| \\__/_________________-------------------                           |\n" +
"|                                                                    |\n" +
" |                              Magic Math                           |\n" +
" |                                                                    |\n" +
" | \"Assim como toda historia tem um começo está não seria diferente,|\n" +
"  |  A nossa historia se passa em algum seculo jás perdido           |\n" +
"  | em meio as ruinas do tempo, em uma terra média chamada Eldia      |\n" +
"  | quando a magia e o irreal ainda coexistiam, a partir deste ponto   |\n" +
"  |  temos um jovem rapaz chamado ..., que em poucos dias ele começaria |\n" +
"   | uma jornada que mudaria a sua vida, a vida neste seculo não é nada |\n" +
"   | facil, toda Eldia está destruida há seculos, a historia e todo o   |\n" +
"   | conhecimento contido em nosso mundo está escasso, a busca por uma |\n" +
"  |  coordenada que levara até a verdade sobre o  ____________________|_\n" +
"  |  ___________________-------------------------                        `\\\n" +
"  |/`--_                                                                   |\n" +
"  ||[ ]||                                              ___________________/\n" +
"   \\===/___________________--------------------------");
                break;
                        
            case 2:
                System.out.println("Historia");
                break;
                
            case 3:
                System.out.println("╔════•ೋೋ•════╗ \n" +
                                   "         Créditos\n" +
                                   "╚════•ೋೋ•════╝");
                
                System.out.println("Trabalho Projeto Integrador (P.I)");
                System.out.println("Turma 1ºA TADS - Noturno, 1º Semestre");
                System.out.println("Desenvolvido por Marcos vinicius Santos Souza, Renan Maciel e Matheus");
                break;
                
            case 4:
                System.out.println("Saindo do jogo...");
                break;
                
        }
        
        return menuInicial();
    }
     
     
     public static void main(String[] args) 
    {
       cabecalhoo();
       int menu = menuInicial();  // criando variavel para receber a entrada dos dados (escolha) do menu
       
       int opM = opcoesMenu(menu);
    }
}

    
   

     
   
    

