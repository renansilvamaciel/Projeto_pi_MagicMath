/**
 *
 * Autores:
 * Marcos vinicius Santos Souza
 * Renan Maciel
 * Matheus Caetano
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


public class magic_math 
{
        static int opcoesMenu(int op){ // opções ao escolher uma das alternativas do menu inicial
        
        
        switch(op){
            case 1:  //AQUI VAI ACONTECER TODO O JOGO
                System.out.println("                                             _______________________\n" +
"   _______________________-------------------                       `\\\n" +
" /:--__                                                              |\n" +
"||< > |                                   ___________________________/\n" +
"| \\__/_________________-------------------                         |\n" +
"|                                                                  |\n" +
" |                             MAGIC MATH                          |\n" +
" |                                                                  |\n" +
" |      \"Assim como toda historia tem um começo está não            |\n" +
"  |        seria diferente, A nossa historia se passa em algum       |\n" +
"  |      seculo jás perdido em meio as ruinas do tempo,              |\n" +
"  |      em uma terra média chamada Eldia quando a magia e o irreal  |\n" +
"  |      ainda coexistiam, a partir deste ponto temos                 |\n" +
"   |      um jovem rapaz chamado ..., que em poucos dias ele          |\n" +
"   |       começaria uma jornada que mudaria a sua vida,              |\n" +
"   |     a vida neste seculo não é nada facil, toda Eldia está       |\n" +
"  |                                                                   |\n" +
" |                                                                  |\n" +
" |      \"destruida há seculos, a historia e todo o conhecimento    |\n" +
"  |        contido em nosso mundo está escasso, a busca por uma      |\n" +
"  |      coordenada que levara até a verdade sobre o nosso mundo é   |\n" +
"  |       constante e no meio disto a nação soberana de Marven quer  |\n" +
"  |      impedir que alguem consiga obter tais conhecimentos,         |\n" +
"   |      somente obetendo tais informações poderá reconstruir o      |\n" +
"   |      mundo novamente e você é o escolhido para restaurar a paz   |\n" +
"   |         e a ordem em nosso mundo, você aceita continuar?        |\n" +
"  |                                              ____________________|_ \n" +
"  |  ___________________-------------------------                      `\\\n" +
"  |/`--_                ╔═════•ೋೋ•═════╗                   |\n" +
"  ||[ ]||                   1- [Sim]   || 2- [Não]   ___________________/\n" +
"   \\===/___________________--------------------------");
             
                //COMEÇO DO JOGO A PARTIR DA DECISÃO SIM
                
                int dados = entrarDadosInt(); // variavel criada para capturar a escolha a cima
                
                if (dados == 1){
                    System.out.println("╔════•ೋೋ•════╗ \n" +
                                       "    Informe o seu nome:\n" +
                                       "╚════•ೋೋ•════╝");
                  String nome =  entrarDadosStr(); // variavel criada para capturar o nome do usuario
                    System.out.println("                                   ....\n" +
"                                .'' .'''\n" +
".                             .'   :\n" +
"\\\\                          .:    :\n" +
" \\\\                        _:    :       ..----.._\n" +
"  \\\\                    .:::.....:::.. .'         ''.\n" +
"   \\\\                 .'  #-. .-######'     #        '.\n" +
"    \\\\                 '.##'/ ' ################       :\n" +
"     \\\\                  #####################         :\n" +
"      \\\\               ..##.-.#### .''''###'.._        :\n" +
"       \\\\             :--:########:            '.    .' :\n" +
"        \\\\..__...--.. :--:#######.'   '.         '.     :\n" +
"        :     :  : : '':'-:'':'::        .         '.  .'\n" +
"        '---'''..: :    ':    '..'''.      '.        :'\n" +
"           \\\\  :: : :     '      ''''''.     '.      .:\n" +
"            \\\\ ::  : :     '            '.      '      :\n" +
"             \\\\::   : :           ....' ..:       '     '.\n" +
"              \\\\::  : :    .....####\\\\ .~~.:.             :\n" +
"               \\\\':.:.:.:'#########.===. ~ |.'-.   . '''.. :\n" +
"                \\\\    .'  ########## \\ \\ _.' '. '-.       '''.\n" +
"                :\\\\  :     ########   \\ \\      '.  '-.        :\n" +
"               :  \\\\'    '   #### :    \\ \\      :.    '-.      :\n" +
"              :  .'\\\\   :'  :     :     \\ \\       :      '-.    :\n" +
"             : .'  .\\\\  '  :      :     :\\ \\       :        '.   :\n" +
"             ::   :  \\\\'  :.      :     : \\ \\      :          '. :\n" +
"             ::. :    \\\\  : :      :    ;  \\ \\     :           '.:\n" +
"              : ':    '\\\\ :  :     :     :  \\:\\     :        ..'\n" +
"                 :    ' \\\\ :        :     ;  \\|      :   .'''\n" +
"                 '.   '  \\\\:                         :.''\n" +
"                  .:..... \\\\:       :            ..''\n" +
"                 '._____|'.\\\\......'''''''.:..'''\n" +
"                            \\\\ ");
                    
                    System.out.println("olá, caro jovem " +nome+ ", eu sou o 13º mago celestial o ultimo de todos, seu pai foi um grande mago, um excelente matematico,\n" +
" amigo e professor e ele confiou a mim a missão de guia-lo em seu destino, sua jornada se passara nas ruínas do mundo desconhecido\n" +
" onde caso você consiga passar pelos 10 desafios divinos você obtera o conhecimento supremo para enfim restaurar o nosso mundo,\n" +
" o povo de Eldia conta com você, salve o mundo e construa o seu destino...");    
                    
                    System.out.println("");
                    System.out.println("chegando nas ruinas do mundo desconhecido o jovem se depara com o 1º problema,\n" +
" para ele entrar dentro das ruínas ele terá que resolver o enigma de raciocinio");        
              
                    
                    System.out.println("  |||            _.'   _      _.-. |        | |--\n" +
" \\|||         _.'    -    _.-'  _|-|       -| |__\n" +
"  ||;-,    _.'   '-  _.-'' _.-''|  |-'      | `._\n" +
" -'| / \\_,' _    _.-'   _.' |   |  |    -|  |\n" +
" ----|,`   |  _.'   _.-' | ,| ,'| _| |      |_   \n" +
"    _:  _   ,'   .-'    _|/ \\ | | -|  _|_   | '\n" +
"   | |    ,'  .-'     , )|)-( |_|  |-       |    -\n" +
" -   |  ,'  ,'(   `  /_\\||`.'   |- |   -|_  |\n" +
" ___-| /  ,'   )     `.'||.-| _ | ||        | '-'\n" +
" __( |;  /    / ,-    | ||  |/ \\|_ | _|    -|    \n" +
"   | :  ; ,-.-)       | ||  || ||  |   |_   |    _\n" +
"  _| | :/` _..\\  `-.  | ||__||_|;--;--------:  ,'`\n" +
"   | | |,-'  _/       |,-/\\_|  /__/__________\\::::\n" +
"   |-| |   ,' \\, ` ___|||||-|  |  |  _|_     ||___\n" +
" _ | | | ,'   (   ;   :'''' /| ||_|       _  ||---\n" +
" - | | |/     ;  /     :   : | |  |   _|_    ||---\n" +
"   | | |      |,'______|-..| | |_||      |  _||---\n" +
"   | | |      ||_      |   | | |_ |  -      -|----   \n" +
" _|| | |      ;|-:  _  |   | |,|- |-   _|  _ |--,'\n" +
"   | | |______\\| |,' `.|`-.| |:|  | _|    |  |,','\n" +
"   |-| | ~   ~|| ||__|||! !| | ;--;----__---,','|\n" +
"   | | |,._,~_|:.||-'|||! !| |/__/____/\\_\\,','|\\|\n" +
" -.| | ;     _.-'|| - ||`.!| ||  |    ||_|,'| | |,\n" +
"  || ;'|_,-''    -    - `.`| ||  | ___|| ||\\| |,',\n" +
" , | | |    -     -     -  ) '|__||\\  || | \\|,','\n" +
"   ; | | -     -      -      |\\    \\\\ || |_,',' \n" +
"  /| | ;    -     -           \\\\    \\\\|| |','\n" +
" / | |/                        \\\\    \\|| |'");
                    
                    
                    System.out.println("");
                    
                    int dados1;// Variavel criada para armazenar escolha do desafio e fazer looping do DO WHILE
                    System.out.println("╔════•ೋೋ•════╗ \n" +
                                       "         1º Desafio\n" +
                                       "╚════•ೋೋ•════╝");
                    do{
                    System.out.println("O qué é que de manhã tem 4 pernas, a tarde tem 2 e a noite tem 3?");
                    System.out.println("[1]- Uma sombra de uma cadeira sobre diferetes posições do sol");
                    System.out.println("[2]- Um animal");
                    System.out.println("[3]- A passagem da vida de um homem");
                    System.out.println("[4]- Uma sombra de uma cama sobre diferetes posições do sol");
                    dados1 = entrarDadosInt();
                    switch(dados1){
                        case 1:
                            System.out.println("Você errou, tente novamente!");
                            break;
                        
                        case 2:
                            System.out.println("Você errou, tente novamente!");
                            break;
                            
                       case 3:
                            System.out.println("");
                            break;
                            
                        case 4:
                            System.out.println("Você errou, tente novamente!");
                            break;
                        default:
                            System.out.println("Opção invalida!");
                            break;
                    }
                    }while(dados1 != 3); // fim do looping DO WHILE
                    switch(dados1){// Resposta correta
                        case 3:
                            System.out.println("Parabéns você acertou!");
                            System.out.println("");
                            System.out.println("Deusa divina: ");
                            System.out.println("");
                            System.out.println(""+ "          .;;;,.,\n" +
"         ;sXs=SV2;\n" +
"        ;;Y; _ ^_;\n" +
"        :LS  a (a(\n" +
"       ;;;;   .. ;\n" +
"       ;';)'. ==/;\n" +
"     _.-';   '-';-;_\n" +
"    /\\\\  ;;    ;; //'. \n" +
"   | ,\\\\_;_____; '/,  \\\n" +
"   | | ';;--- ;;-' |   \\\n" +
"   F |  ;     ;    |\\   \\\n" +
"  J  .\\';    ;     | ;--t\n" +
"  |__/ )      ;   / .'';|\n" +
"  j  '-,__   __.---;    (\n" +
"   )  ( =r'-| ' .  \\  '; )\n" +
"   | : \"-s=-|   '  |   ; |\n" +
"   | : ; \\  |   |  |     |\n" +
"    L; :  L |      ;     |\n" +
"   J ;    | |   :  ;     |\n" +
"   | ;    J |   :   ;    |\n" +
"   L.'     L|       (    |\n" +
"  J ;  :   ||  '    ;    |\n" +
"  | ;      ||  :    ;    |\n" +
"  |,/  ;   ||       ;    \\\n" +
"  |(   :   ||   __.'     |\n" +
"  | >  |   ||,-'         |\n" +
"  |/   ;   |Z_,          |\n" +
"  (,  _L---J   '.        |\n" +
"   '-'|       |  '--._   |\n" +
"      |       :     ; '-r\n" +
"      |   ;   |     |; ||-._____\n" +
"    __/ | ;   '|    |; ;(-'.--' ';\n" +
"  ,'_'/;  ',   ; \\ ( _L_.'-._'---,;\n" +
" '-----L___;--.,__;-' --''-.'---'");
                            
                            System.out.println("parabens jovem aventureiro, porem este foi apenas o 1º teste, a partir daqui as coisas ficarão mais dificeis,\n" +
                            " muitos tentaram e nenhum até hoje conseguiu, se você não deseja perecer onde outros sucumbiram é a chance de voltar, você deseja continuar?");
                            System.out.println("╔════•ೋೋ•════╗ \n" +
                                               "  1- [Sim]  ||  2- [Não]\n" +
                                               "╚════•ೋೋ•════╝");
                            
                            dados1 = entrarDadosInt();//entrada de dados para a decisão acima
                            switch(dados1){
                                case 1:
                                    System.out.println("A partir daqui não se pode mais desistir e a morte será certa porém caso consiga você obtera algo de valor inestimavel...");
                                    System.out.println("");
                                    System.out.println("( finalmente agora dentro das ruinas o héroi se depara com um lago vermelho como sangue\n" +
                                    "e na beira deste lago tem um barqueiro chamado Aqueronte e para atravessar este lago Aqueronte propoe o seguinte enigma ) ");
                                    System.out.println("                      `-.\n" +
"              -._ `. `-.`-. `-.\n" +
"             _._ `-._`.   .--.  `.\n" +
"          .-'   '-.  `-|\\/    \\|   `-.\n" +
"        .'         '-._\\   (o)O) `-.\n" +
"       /         /         _.--.\\ '. `-. `-.\n" +
"      /|    (    |  /  -. ( -._( -._ '. '.\n" +
"     /  \\    \\-.__\\ \\_.-'`.`.__'.   `-, '. .'\n" +
"     |  /\\    |  / \\ \\     `--')/  .-'.'.'\n" +
" .._/  /  /  /  / / \\ \\          .' . .' .'\n" +
"/  ___/  |  /   \\ \\  \\ \\__       '.'. . .\n" +
"\\  \\___  \\ (     \\ \\  `._ `.     .' . ' .'\n" +
" \\ `-._\\ (  `-.__ | \\    )//   .'  .' .-'\n" +
"  \\_-._\\  \\  `-._\\)//    \"\"_.-' .-' .' .'\n" +
"    `-'    \\ -._\\ \"\"_..--''  .-' .'\n" +
"            \\/    .' .-'.-'  .-' .-'\n" +
"                .-'.' .'  .' .-'");
                                    
                                    System.out.println("");
                                    System.out.println("╔════•ೋೋ•════╗ \n" +
                                                       "         2º Desafio\n" +
                                                       "╚════•ೋೋ•════╝");
                                    System.out.println("Dentro de uma vila temos uma tribo cujo existem 35 seres mitologicos formado de minotauros e centauros,\n" +
                                                       " os quais juntos soma 100 pés, qual o numero respectivamente de minotaruros e centauros?\n" +
                                                       " ( use o sistema numerico M+C = 35 | 2M + 4C = 100 \" )");
                                    break;// FIM CASE 1
                                case 2:
                                    System.out.println("Voltando para a casa, fim da jornada...");
                                    break;
                                default :
                                    System.out.println("Opção invalida!");
                            }
                            break;// fim break case 3 do switch do primeiro desafio
                            
                        
                    }// FIM SWITCH
                    
               }//FIM DO IF
                    
                    
                else 
                    System.out.println("Saindo do jogo...");
                break; //FIM BREAK CASE 1
                
                
                
            case 2:
                System.out.println("╔════•ೋೋ•════╗ \n" +
                                   "         Historias\n" +
                                   "╚════•ೋೋ•════╝");
                break;
                
                
                
                
                
            case 3:
                System.out.println("╔════•ೋೋ•════╗ \n" +
                                   "         Créditos\n" +
                                   "╚════•ೋೋ•════╝");
                
                System.out.println("Trabalho Projeto Integrador (P.I)");
                System.out.println("Turma 1ºA TADS - Noturno, 1º Semestre, 2019");
                System.out.println("Desenvolvido por Marcos vinicius Santos Souza, Renan Maciel e Matheus Caetano");
                break;
                
                
                
                
            case 4:
                System.out.println("Saindo do jogo...");
                break;
                
        } //FIM SWITCH PRINCIPAL
        
        return op;
    }// FIM STATIC OPCOESMENU
    
     
     
     
     
   static int entrarDadosInt(){ // captura os dados de numeros inteiros para salvar em variaveis
      Scanner entrar = new Scanner(System.in);
      int dados = entrar.nextInt();
      return dados;
   }
   
   static String entrarDadosStr(){ // captura os dados tipo Strings para salvar em variaveis
      Scanner entrar = new Scanner(System.in);
      String dados = entrar.next();
      return dados;
   }
    
   
   
   
    
    public static void main(String[] args) { // Corpo do programa
        
        Scanner entrar = new Scanner(System.in);
        
        int opcao;
        
        System.out.println("                           ╔════•ೋೋ•════╗ \n" +
                           "                                     Magic Math\n" +
                           "                           ╚════•ೋೋ•════╝");
         System.out.println("                                   ︻雷魔▅▆▇◤");
         System.out.println("");
         System.out.println("                        /\\\n" +
"                        ||\n" +
"                        ||\n" +
"                        ||\n" +
"                        ||                                               ~-----~\n" +
"                        ||                                            /===--  ---~~~\n" +
"                        ||                   ;'                 /==~- --   -    ---~~~\n" +
"                        ||                (/ ('              /=----         ~~_  --(  '\n" +
"                        ||             ' / ;'             /=----               \\__~\n" +
"     '                ~==_=~          '('             ~-~~      ~~~~        ~~~--\\~'\n" +
"     \\\\                (c_\\_        .i.             /~--    ~~~--   -~     (     '\n" +
"      `\\               (}| /       / : \\           / ~~------~     ~~\\   (\n" +
"      \\ '               ||/ \\      |===|          /~/             ~~~ \\ \\(\n" +
"      ``~\\              ~~\\  )~.~_ >._.< _~-~     |`_          ~~-~     )\\\n" +
"       '-~                 {  /  ) \\___/ (   \\   |` ` _       ~~         '\n" +
"       \\ -~\\                -<__/  -   -  L~ -;   \\\\    \\ _ _/\n" +
"       `` ~~=\\                  {    :    }\\ ,\\    ||   _ :(\n" +
"        \\  ~~=\\__                \\ _/ \\_ /  )  } _//   ( `|'\n" +
"        ``    , ~\\--~=\\           \\     /  / _/ / '    (   '\n" +
"         \\`    } ~ ~~ -~=\\   _~_  / \\ / \\ )^ ( // :_  / '\n" +
"         |    ,          _~-'   '~~__-_  / - |/     \\ (\n" +
"          \\  ,_--_     _/              \\_'---', -~ .   \\\n" +
"           )/      /\\ / /\\   ,~,         \\__ _}     \\_  \"~_\n" +
"           ,      { ( _ )'} ~ - \\_    ~\\  (-:-)       \"\\   ~ \n" +
"                  /'' ''  )~ \\~_ ~\\   )->  \\ :|    _,       \" \n" +
"                 (\\  _/)''} | \\~_ ~  /~(   | :)   /          }\n" +
"                <``  >;,,/  )= \\~__ {{{ '  \\ =(  ,   ,       ;\n" +
"               {o_o }_/     |v  '~__  _    )-v|  \"  :       ,\"\n" +
"               {/\"\\_)       {_/'  \\~__ ~\\_ \\\\_} '  {        /~\\\n" +
"               ,/!          '_/    '~__ _-~ \\_' :  '      ,\"  ~ \n" +
"              (''`                  /,'~___~    | /     ,\"  \\ ~' \n" +
"             '/, )                 (-)  '~____~\";     ,\"     , }\n" +
"           /,')                    / \\         /  ,~-\"       '~'\n" +
"       (  ''/                     / ( '       /  /          '~'\n" +
"    ~ ~  ,, /) ,                 (/( \\)      ( -)          /~'\n" +
"  (  ~~ )`  ~}                   '  \\)'     _/ /           ~'\n" +
" { |) /`,--.(  }'                    '     (  /          /~'\n" +
"(` ~ ( c|~~| `}   )                        '/:\\         ,'\n" +
" ~ )/``) )) '|),                          (/ | \\)                     \n" +
"  (` (-~(( `~`'  )                        ' (/ '\n" +
"   `~'    )'`')                              '\n" +
"     ` ``");
         
         
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
            
            
            
       opcao = entrar.nextInt(); // capturando dados
       
       int opMenu = opcoesMenu(opcao); // criando variavel que recebera os dados coletados e passara para a função switch "opcoesMenu"
                    
    }
    
}

    
