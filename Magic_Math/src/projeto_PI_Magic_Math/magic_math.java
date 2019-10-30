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
         public static void main(String[] args) {
       
        
        Scanner entrar = new Scanner(System.in);
        int opcao; // VARIAVEL QUE IR CAPTURAR A OPÇÃO DO JOGADOR RELACIONADA AO MENU
        int corpoFuncao;
        
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
       corpoFuncao = opcaoMenu(opcao);
       
    }
    
    static int opcaoMenu(int opcoesMenu){
        
        
        switch(opcoesMenu){
            case 1:
                jogar();
                break;
                
            case 2:
                historia();
                break;
                
            case 3:
                creditos();
                break;
                
            case 4:
                sair();
                break;
                
            default :
                System.out.println("Opção invalida!");
                
        }
        
        return opcoesMenu;
    }
    
    //OPÇÃO MENU
    
    static int jogar(){
        byte jogo, desa1, desa2, desa3, desa4, desa5, desa6, desa7, desa8, desa9, desa10;
        String nome;
        Scanner entrar = new Scanner(System.in);
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
"  |/`--_                 ╔═════•ೋೋ•═════╗                 |\n" +
"  ||[ ]||                    1- [Sim]  || 2- [Não]    __________________/\n" +
"   \\===/___________________--------------------------");
        
        jogo = entrar.nextByte();
        
        if (jogo == 1){
            System.out.println("╔═══════•ೋೋ•═══════╗ \n" +
                               "         Informe o seu nome:\n" +
                               "╚═══════•ೋೋ•═══════╝");
            nome = entrar.next(); //CAPTURA DO NOME DO PERSONAGEM
        
        
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
                    desa1 = desafio1();
                    if(desa1 == 3){  //CHAMADA DAS FUNÇÕES DESAFIOS
                        
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
                            
                            System.out.println("Parabens jovem aventureiro, porem este foi apenas o 1º teste, a partir daqui as coisas ficarão mais dificeis,\n" +
                            " muitos tentaram e nenhum até hoje conseguiu, se você não deseja perecer onde outros sucumbiram é a chance de voltar, você deseja continuar?");
                            System.out.println("╔═══════•ೋೋ•═══════╗ \n" +
                                               "        1- [Sim]  ||  2- [Não]\n" +
                                               "╚═══════•ೋೋ•═══════╝");
                            jogo = entrar.nextByte();
                            
                            switch(jogo){
                                case 1:
                                    System.out.println("A partir daqui não se pode mais desistir e a morte será certa porém caso consiga você obtera algo de valor inestimavel...");
                                    
                                    desa2 =desafio2();
                                    if (desa2 == 2){
                                      desa3 = desafio3();
                                      if (desa3 == 2 || desa3 == 3 || desa3 == 4){
                                          System.err.println("Fim de jogo você morreu, alta dosagem! ");
                                          main(null);
                                        }
                                        
                                        else if(desa3 == 1){
                                            System.out.println("A partir de agora você tem 3 corações não perca todos ou morrerá!");
                                            System.out.println("");
                                            
                                            
                                            desa4 = desafio4();
                                            
                                            if(desa4 == 3)
                                                    System.out.println("(Após entrar nesta porta, "+nome+" acaba entrando em uma sala onde a concepção de temperatura\n" +
                                                      " não existe e para deixar a sala adquada para que ele possa atravessar\n" +
                                                        " ele terá que ajustar adquadamente a temperatura)");
                                            
                                            
                                            if (desa4 == 0){
                                            System.err.println("Você morreu, fim de jogo...");
                                            System.out.println("");
                                            main(null);
                                            
                                            
                                            }      
                                            
                                            
                                            
                                            
                                        } //FIM ELSE IF DESAFIO 3
                                        
                                    }
                                break;
                                
                                case 2:
                                    System.err.println("Voltando para casa, fim da jornada...");
                                    System.out.println("");
                                    main(null);
                                    
                                    break;
                            }
                            
                    }// FIM CHAMADA DESAFIOS
                        
        
        }// FIM IF DECISÃO DE COMEÇAR A JORNADA OU NÃO
        else{
            System.err.println("Voltando ao menu, Fim de jogo...");
            System.out.println("");
            main(null);
        }
        
        return jogo;
    }
    
    static void historia(){
        
        
        
        
    }
    
    static void creditos(){
        byte credi = 0;
        Scanner voltar = new Scanner(System.in);
        
        do{
        System.out.println("");
        System.out.println("╔════•ೋೋ•════╗ \n" +
                           "          Créditos\n" +
                           "╚════•ೋೋ•════╝");
        System.out.println(""); 
        
                System.out.println("Trabalho Projeto Integrador (P.I)");
                System.out.println("Turma 1ºA TADS - Noturno, 1º Semestre, 2019");
                System.out.println("Desenvolvido por Marcos vinicius Santos Souza, Renan Maciel, Matheus Caetano");
                System.out.println("");
                System.out.println("Digite [1] Para voltar ao menu inicial: ");
                credi = voltar.nextByte();
        }while(credi != 1);
        main(null);
        
    }
    
    static void sair(){
        
        System.err.println("Saindo do jogo...");
    }
    
    static byte desafio1(){
        byte opcao;
        Scanner entrar = new Scanner(System.in);
        System.out.println("╔════•ೋೋ•════╗ \n" +
                           "       1º Desafio\n" +
                           "╚════•ೋೋ•════╝");
                    do{
                    System.out.println("O qué é que de manhã tem 4 pernas, a tarde tem 2 e a noite tem 3?");
                    System.out.println("[1]- Uma sombra de uma cadeira sobre diferetes posições do sol");
                    System.out.println("[2]- Um animal");
                    System.out.println("[3]- A passagem da vida de um homem");
                    System.out.println("[4]- Uma sombra de uma cama sobre diferetes posições do sol");
                    opcao = entrar.nextByte();
                    switch(opcao){
                        case 1:
                            System.out.println("Você errou, tente novamente!");
                            break;
                        
                        case 2:
                            System.out.println("Você errou, tente novamente!");
                            break;
                            
                       case 3:
                            System.out.println("Parabéns Você Acertou!");
                            break;
                            
                        case 4:
                            System.out.println("Você errou, tente novamente!");
                            break;
                        default:
                            System.out.println("Opção invalida!");
                            break;
                    }
                    }while(opcao != 3); // fim do looping DO WHILE
        
        return opcao;
    }
    
    static byte desafio2(){
        byte opcao;
        Scanner entrar = new Scanner(System.in);
        
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
                                                       "        2º Desafio\n" +
                                                       "╚════•ೋೋ•════╝");
                                    do{
                                    System.out.println("Dentro de uma vila temos uma tribo cujo existem 35 seres mitologicos formado de minotauros e centauros,\n" +
                                                       " os quais juntos soma 100 pés, qual o numero respectivamente de minotaruros e centauros?\n" +
                                                       " ( use o sistema numerico M+C = 35 | 2M + 4C = 100 \" )");
                                    System.out.println("[1]- 20 Centauros e 15 Minotauros");
                                    System.out.println("[2]- 15 Centauros e 20 Minotauros");
                                    System.out.println("[3]- 10 Centauros e 25 Minotauros");
                                    System.out.println("[4]- 17 Centauros e 18 Minotauros");
                                    opcao = entrar.nextByte();
                                    
                                    switch(opcao){
                                        case 1:
                                            System.out.println("Você errou, tente novamente!");
                                            break;
                                            
                                        case 2:
                                            System.out.println("Parabens você acertou!");
                                            break;
                                            
                                        case 3:
                                            System.out.println("Você errou, tente novamente!");
                                            break;
                                            
                                        case 4:
                                           System.out.println("Você errou, tente novamente!");
                                           break; 
                                           
                                        default:
                                            System.out.println("Opção invalida!");
                                            break;
                                    }//FIM SWITCH DESAFIO 2
                                    }while(opcao != 2); 
        
        return opcao;
    }
    
    static byte desafio3(){
        byte opcao;
        Scanner entrar = new Scanner(System.in);
        
        System.out.println("( agora já no outro lado do largo o nosso heroi se depara com uma porta e entrando nessa porta ele encontra um grande alquimista louco desaparecido há decadas\n" +
" chamado Nicolas flamel, Nicolas diz que a partir dali as coisas ficarão mais dificeis e que não bastara apenas ter um coração e sim 3,\n" +
" Nicolas desenvolvel após anos de pesquisa o elixir da vida junto com base na famosa pedra filosofal e propoe toma- ló\n" +
" porém para isso ele terá que dar a quantidade exata da formula para o Nicolas porque uma dosagem errado o levará a morte certa)");
        
        System.out.println("                 .\n" +
"\n" +
"                   .\n" +
"         /^\\     .\n" +
"    /\\   \"V\"\n" +
"   /__\\   I      O  o\n" +
"  //..\\\\  I     .\n" +
"  \\].`[/  I\n" +
"  /l\\/j\\  (]    .  O\n" +
" /. ~~ ,\\/I          .\n" +
" \\\\L__j^\\/I       o\n" +
"  \\/--v}  I     o   .\n" +
"  |    |  I   _________\n" +
"  |    |  I c(`       ')o\n" +
"  |    l  I   \\.     ,/\n" +
"_/j  L l\\_!  _//^---^\\\\_ ");
        
        System.out.println("");
        System.out.println("╔════•ೋೋ•════╗ \n" +
                           "        3º Desafio\n" +
                           "╚════•ೋೋ•════╝");
        
        
        do{
                                    System.out.println("");
        System.out.println("Nicolas: se com 37,5 ml desta poção é a quantidade exata para um ser que possui 3/8 do seu tamanho,\n" +
                           " quantos ml serão necessarios para que obetenham efeito em você? ( considere que tem 1,80 metros)");
                                    System.out.println("[1]- 100 ML");
                                    System.out.println("[2]- 95 ML");
                                    System.out.println("[3]- 135 ML");
                                    System.out.println("[4]- 105 ML");
                                    opcao = entrar.nextByte();
                                    
                                    switch(opcao){
                                        case 1:
                                            System.out.println("Parabens você acertou!");
                                            break;
                                            
                                        case 2:
                                            System.out.println("Você errou!");
                                            break;
                                            
                                        case 3:
                                            System.out.println("Você errou!");
                                            break;
                                            
                                        case 4:
                                           System.out.println("Você errou!");
                                           break; 
                                           
                                        default:
                                            System.out.println("Opção invalida!");
                                            break;
                                    }//FIM SWITCH DESAFIO 2
                                    
        }while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4);//FIM DO WHILE
                                    
        
        return opcao;
        
          
    }
    
    static byte desafio4(){
    byte opcao, coracaoCont = 3;
    
    
     Scanner entrar = new Scanner(System.in);   
        
        System.out.println("(Após o jovem heroi conseguir passar por este desafio ele se sente mais forte e confiante sobre o seu destino porém\n" +
"como Nicolas disse a partir dali as coisas ficariam mais dificeis ou seja toda vez que errar ele terá 1/3 de sua vida drenada\n" +
"durante aquele determinado teste,\n" +
" finalmente no 4º desafio ele se depara com uma porta chamada porta da vida e para abrir está porta precisara responde-lá)");
        
        System.out.println("   ---   .    ____        -----      ______   -----        .\n" +
"  ___     / \\             .....................      ____   / \\\n" +
"        .'   '.  --  ..:::::''''''''''''''''':::::..      .'   '.\n" +
"  ---   | ^ ^ |    .::::''''          (_     ''''::::. -- | ^ ^ '\n" +
"        | ^ ^ |  .::''                       _)    ''::.  | ^ ^ | --\n" +
"____     '...'  .::'              .-.      (_        '::.  '...'\n" +
"        .-.!_  .::'       _)     /   \\                '::.   ! ____\n" +
"       / / `-`.:'                '-.-'            _)    ':..\"\"\".\n" +
" --    ' |  '.|:'      _)         .'.       (_          ':/' |  \\\n" +
"       | |   |'.               _/^---^\\_                  |     . --\n" +
" ___    \\ .  '|               \\-------../         (_      \\   '.'\n" +
"        ' :   '        _)      '.\\:::/.'       (_   )_    |'   || ___\n" +
"        | |  .|      _(         | | |'|                   / ' . |\n" +
"    --  | '. | \\                '.\\ /.'                   '.  | |--\n" +
"        |'.   '|                 |[ ]|           (_       | .'  |____\n" +
"__    .'\\ |  .'\\                 '.^.'                    \\ |.  .\n" +
"     .'-.\\'. | |        _)        (:)                     | ||| |\n" +
"   .'    \\'..' .             _..--'''--.._      (_       /'-._.-'| ---\n" +
"   |       `-..'.         .-'             '-.           |      .-'.\n" +
"    \\            `-.    .'  ..            .. '.        .'-._.-'    `.\n" +
"--   )              `-./    '::.        .::'   \\   _.-'             /\n" +
"     '._/-..          /       '::.    .::'      \\-'              .-'\n" +
"         ::.`-.      ''        '::   ::'        ''       _..-\\_.'\n" +
"         :::   '._   | \\         '   '         / |    .-'   .:: _____\n" +
"____     :::      `-.|  '  .----..___..----.  '  | .-'      :::\n" +
"         :::          \\ |  _..--.     .--.._  | /-'         ::: ---\n" +
"         :::   _)     | ' /     |     |     \\ ' |  (        :::\n" +
"   --    :::          )   |   _.'     '._   |   (   )_      :::____\n" +
"    ____ :::          /'. \\_.'   )\\ /(   '._/ .'\\     (_    :::\n" +
"         :::       .-'|  `-->-@ /     \\ @->--'  |-.         :::\n" +
"         :::    .-'   \\         | / \\ |         /  `-.      :::  ---\n" +
" ----    '' _.-'       |        )/   \\(        |      `-.   :::  _____\n" +
"  _.-=--..-'          . \\ /\\               /\\ /          `-. ''\n" +
" /.._    `.        .-'   .\\ '-.\\.\\\\.//./.-' /.`-.           `---.._\n" +
"|    `.    \\    .-'      | '.             .' |   `-.                \\ \n" +
" \\    _\\.   `.-'         |   '-././.\\.\\.-'   |      `.               |\n" +
"  `.-'  |   /::::::::::: \\                   /::::::::`.      ,-.    /\n" +
" - |   /   /        ----  '-.             .-'     ----  `.    |  \\_.'\n" +
"__ \\   | .'     _____        '-._._._._.-'     ____      |    |   |\n" +
"    `--'                                                 `-.  '._ / --\n" +
"                                                            `...-'");
        
        System.out.println("");
        System.out.println("╔════•ೋೋ•════╗ \n" +
                           "        4º Desafio\n" +
                           "╚════•ೋೋ•════╝");
        System.out.println("Porta: "); 
        System.out.println("Para passar daqui você irá ter que adivinhar quantas almas eu ja absorvi.\n" +
                           " Sendo que o Dobro do antecessor do número total, menos 3,\n" +
                           " é igual a 25! Quantas almas eu já drenei?");
        
        do{
                                    
                                    System.out.println("[1]- 10 Almas");
                                    System.out.println("[2]- 9 Almas");
                                    System.out.println("[3]- 11 Almas");
                                    System.out.println("[4]- 12 Almas");
                                    opcao = entrar.nextByte();
                                    
                                    switch(opcao){
                                        case 1:
                                            System.out.println("Você errou, tente novamente!");
                                            coracaoCont--;
                                            System.out.println("Coração " +coracaoCont+ " / 3");
                                            break;
                                            
                                        case 2:
                                            System.out.println("Você errou, tente novamente");
                                            coracaoCont--;
                                            System.out.println("Coração " +coracaoCont+ " / 3");
                                            break;
                                            
                                        case 3:
                                            System.out.println("Você Acertou parabens!");
                                            break;
                                            
                                        case 4:
                                           System.out.println("Você errou, tente novamente!");
                                           coracaoCont--;
                                           System.out.println("Coração " +coracaoCont+ " / 3");
                                           break; 
                                           
                                        case 0:  
                                            break;
                                            
                                        default:
                                            System.out.println("Opção invalida!");
                                            break;
                                    }//FIM SWITCH DESAFIO 2

                            
                                    }while(opcao != 3);
        
        
       
   
       return opcao;
       
    }
    
}