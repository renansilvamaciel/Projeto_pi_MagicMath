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

import java.util.Random;
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
    
    static void jogar(){
       String nome = null, nomeFunc;
       int pontuacao = 0, pontuacaoFunc;
        
        
       nomeFunc = historiaJogo_1(nome);
       nomeFunc = historiaJogo_2(nomeFunc);
       pontuacaoFunc = desafio1(pontuacao);
       historiaJogo_3();
       pontuacaoFunc = desafio2(pontuacaoFunc);
       pontuacaoFunc = desafio3(pontuacaoFunc);
       pontuacaoFunc = desafio4(pontuacaoFunc);
       nomeFunc = historiaJogo_4(nomeFunc);
       nomeFunc = historiaJogo_5(nomeFunc);
       pontuacaoFunc = desafio5(pontuacaoFunc);
       nomeFunc = historiaJogo_6(nomeFunc);
       historiaJogo_7();
       pontuacaoFunc = desafio6(pontuacaoFunc);
       historiaJogo_8(nomeFunc);
       historiaJogo_9(nomeFunc);
       pontuacaoFunc = desafio7(pontuacaoFunc);
       
       
      fimJogo(pontuacaoFunc, nomeFunc);
    }
    
    static void historia(){
        System.out.println("");
        System.out.println("╔════•ೋೋ•════╗ \n" +
                           "     Historia do Jogo\n" +
                           "╚════•ೋೋ•════╝");
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
        System.exit(0);
        
        
    }
    
    static int desafio1(int pontuacao){
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
                            pontuacao = pontuacao - 10;
                            System.err.println("Pontuação: " +pontuacao);
                            System.out.println("");
                            break;
                        
                        case 2:
                            System.out.println("Você errou, tente novamente!");
                            pontuacao = pontuacao - 10;
                            System.err.println("Pontuação: " +pontuacao);
                            System.out.println("");
                            break;
                            
                       case 3:
                            System.out.println("Parabéns Você Acertou!");
                            pontuacao = pontuacao + 10;
                            System.err.println("Pontuação: " +pontuacao);
                            System.out.println("");
                            break;
                            
                        case 4:
                            System.out.println("Você errou, tente novamente!");
                            pontuacao = pontuacao - 10;
                            System.err.println("Pontuação: " +pontuacao);
                            System.out.println("");
                            break;
                        default:
                            System.out.println("Opção invalida!");
                            break;
                    }
                    }while(opcao != 3); // fim do looping DO WHILE
        
       return pontuacao;
    }
    
    static int desafio2(int pontuacao){
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
                                    System.out.println("Dentro de um vilarejo, temos uma tribo que possui existem 35 seres mitologicos, formado de minotauros e centauros,\n" +
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
                                            pontuacao = pontuacao - 10;
                                            System.err.println("Pontuação: " +pontuacao);
                                            System.out.println("");
                                            break;
                                            
                                        case 2:
                                            System.out.println("Parabens você acertou!");
                                            pontuacao = pontuacao + 10;
                                            System.err.println("Pontuação: " +pontuacao);
                                            System.out.println("");
                                            break;
                                            
                                        case 3:
                                            System.out.println("Você errou, tente novamente!");
                                            pontuacao = pontuacao - 10;
                                            System.err.println("Pontuação: " +pontuacao);
                                            System.out.println("");
                                            break;
                                            
                                        case 4:
                                           System.out.println("Você errou, tente novamente!");
                                           pontuacao = pontuacao - 10;
                                            System.err.println("Pontuação: " +pontuacao);
                                            System.out.println("");
                                           break; 
                                           
                                        default:
                                            System.out.println("Opção invalida!");
                                            break;
                                    }//FIM SWITCH DESAFIO 2
                                    }while(opcao != 2); 
        
        return pontuacao;
    }
    
    static int desafio3(int pontuacao){
        byte opcao;
        Scanner entrar = new Scanner(System.in);
        
        System.out.println("( agora já no outro lado do lago, o nosso heroi se depara com uma porta, e entrando nessa porta, ele encontra um grande alquimista louco desaparecido há decadas\n" +
" chamado Nicolas flamel. Nicolas diz que a partir dali as coisas ficarão mais dificeis e que não bastara apenas ter um coração, e sim 3.\n" +
" Nicolas desenvolveu após anos de pesquisa, o elixir da vida junto com base na famosa pedra filosofal, e propoe para  o nosso heroi toma- ló.\n" +
" Porém para isso ele terá que dar a quantidade exata da formula para o Nicolas, porque uma dosagem errada o levará a morte certa.)");
        
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
                                            pontuacao = pontuacao + 10;
                                            System.err.println("Pontuação: " +pontuacao);
                                            System.out.println("");
                                            break;
                                            
                                        case 2:
                                            System.out.println("");
                                            System.err.println("Você errou, Fim de jogo você morreu, alta dosagem!");
                                            System.out.println("");
                                            main(null);
                                            
                                            break;
                                            
                                        case 3:
                                            System.out.println("");
                                            System.err.println("Você errou, Fim de jogo você morreu, alta dosagem!");
                                            System.out.println("");
                                            main(null);
                                            break;
                                            
                                        case 4:
                                           System.out.println("");
                                            System.err.println("Você errou, Fim de jogo você morreu, alta dosagem!");
                                            System.out.println("");
                                            main(null);
                                           break; 
                                           
                                        default:
                                            System.out.println("Opção invalida!");
                                            break;
                                    }//FIM SWITCH DESAFIO 2
                                    
        
                                    
        
        
          return pontuacao;
    }
    
    static int desafio4(int pontuacao){
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
                                           pontuacao = pontuacao - 10;
                                           System.err.println("Pontuação: " +pontuacao);
                                           System.out.println("Coração " +coracaoCont+ " / 3");
                                           if(coracaoCont == 0){
                                                System.out.println("");
                                                System.err.println("Suas vidas acabaram, você morreu!");
                                                System.out.println("");
                                                main(null);
                                                break;
                                            }
                                           break;
                                            
                                        case 2:
                                           System.out.println("Você errou, tente novamente!");
                                           coracaoCont--;
                                           pontuacao = pontuacao - 10;
                                           System.err.println("Pontuação: " +pontuacao);
                                           System.out.println("Coração " +coracaoCont+ " / 3");
                                           if(coracaoCont == 0){
                                                System.out.println("");
                                                System.err.println("Suas vidas acabaram, você morreu!");
                                                System.out.println("");
                                                main(null);
                                                break;
                                            }
                                           break;
                                            
                                        case 3:
                                            System.out.println("Você Acertou parabens!");
                                            pontuacao = pontuacao + 10;
                                            System.err.println("Pontuação: " +pontuacao);
                                            break;
                                            
                                        case 4:
                                           System.out.println("Você errou, tente novamente!");
                                           coracaoCont--;
                                           pontuacao = pontuacao - 10;
                                           System.err.println("Pontuação: " +pontuacao);
                                           System.out.println("Coração " +coracaoCont+ " / 3");
                                           if(coracaoCont == 0){
                                                System.out.println("");
                                                System.err.println("Suas vidas acabaram, você morreu!");
                                                System.out.println("");
                                                main(null);
                                                break;
                                            }
                                           break; 
                                           
                                        
                                        default:
                                            System.out.println("Opção invalida!");
                                            break;
                                    }//FIM SWITCH DESAFIO 2

                            
                                    }while(opcao != 3);
        
       
       
   
       
       
       return pontuacao;
    }
    
    static int desafio5(int pontuacao){
        
         byte opcao, coracaoCont = 3;
    
    
     Scanner entrar = new Scanner(System.in);   
        
        System.out.println("Para entrar dentro do grande castelo do rei louco ele terá que"
                + " abrir a porta com uma especie de chave que parece um triângulo porém sempre que errar o castelo irá ataca-lo com suas defesas");
        
       
        
        System.out.println("");
        System.out.println("╔════•ೋೋ•════╗ \n" +
                           "        5º Desafio\n" +
                           "╚════•ೋೋ•════╝");
        System.out.println("Para construir um triângulo não podemos utilizar qualquer medida, tem que seguir a condição de existência:\n" +
                         "Para construir um triângulo é necessário que a medida de qualquer um dos lados seja"
                + " menor que a soma das medidas dos outros dois e maior que o valor absoluto da diferença entre essas medidas.\n"
                + "| b - c | < a < b + c\n" +
                  "| a - c | < b < a + c\n" +
                  "| a - b | < c < a + b");
        System.out.println("Dado tal informação a cima, qual dessas alternativas é um triângulo?");
        
        do{
                                    
                                    System.out.println("[1]- A = 10, B = 2, C = 12");
                                    System.out.println("[2]- A = 10, B = 4, C = 14");
                                    System.out.println("[3]- A = 12, B = 2, C = 10");
                                    System.out.println("[4]- A = 10, B = 4, C = 12");
                                    opcao = entrar.nextByte();
                                    
                                    switch(opcao){
                                        case 1:
                                           System.out.println("Você errou, tente novamente!");
                                           coracaoCont--;
                                           pontuacao = pontuacao - 10;
                                           System.err.println("Pontuação: " +pontuacao);
                                           System.out.println("Coração " +coracaoCont+ " / 3");
                                           if(coracaoCont == 0){
                                                System.out.println("");
                                                System.err.println("Suas vidas acabaram, você morreu!");
                                                System.out.println("");
                                                main(null);
                                                break;
                                            }
                                           break;
                                            
                                        case 2:
                                           System.out.println("Você errou, tente novamente!");
                                           coracaoCont--;
                                           pontuacao = pontuacao - 10;
                                           System.err.println("Pontuação: " +pontuacao);
                                           System.out.println("Coração " +coracaoCont+ " / 3");
                                           if(coracaoCont == 0){
                                                System.out.println("");
                                                System.err.println("Suas vidas acabaram, você morreu!");
                                                System.out.println("");
                                                main(null);
                                                break;
                                            }
                                           break;
                                            
                                        case 3:
                                            System.out.println("Você errou, tente novamente!");
                                           coracaoCont--;
                                           pontuacao = pontuacao - 10;
                                           System.err.println("Pontuação: " +pontuacao);
                                           System.out.println("Coração " +coracaoCont+ " / 3");
                                           if(coracaoCont == 0){
                                                System.out.println("");
                                                System.err.println("Suas vidas acabaram, você morreu!");
                                                System.out.println("");
                                                main(null);
                                                break;
                                            }
                                           break;
                                            
                                        case 4:
                                           System.out.println("Você Acertou parabens!");
                                            pontuacao = pontuacao + 10;
                                            System.err.println("Pontuação: " +pontuacao);
                                            break;
                                           
                                        
                                        default:
                                            System.out.println("Opção invalida!");
                                            break;
                                    }//FIM SWITCH DESAFIO 2

                            
                                    }while(opcao != 4);
        
       
       
   
       
       
       return pontuacao;
    }
    
    static int desafio6(int pontuacao){
        byte opcao, coracaoCont = 3;
        Scanner entrar = new Scanner(System.in);
        
        System.out.println("Finalmente o nosso héroi pode subir na torre principal, e ele de depara com um telescopio,\n"
                + " o antigo rei amava olhar as estrelas, dizia que elas eram um sinal de luz e esperança,\n"
                + " porém o nosso héroi não conseguia entender como onde está a pista para a cordenada final até que ele olhou no telescopio e percebeu um padrão nas estrelas.");
        
        System.out.println("");
        System.out.print("            *          .\n" +
"                   *       '\n" +
"              *                *\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"   *   '*\n" +
"           *\n" +
"                *\n" +
"                       *\n" +
"               *\n" +
"                     *\n" +
"\n" +
"         .                      .\n" +
"         .                      ;\n" +
"         :                  - --+- -\n" +
"         !           .          !\n" +
"         |        .             .\n" +
"         |_         +\n" +
"      ,  | `.\n" +
"--- --+-<#>-+- ---  --  -\n" +
"      `._|_,'\n" +
"         T\n" +
"         |\n" +
"         !\n" +
"         :         . : \n" +
"         .       *");System.out.print("  .       . \n" +
" +  :      .\n" +
"           :       _\n" +
"       .   !   '  (_)\n" +
"          ,|.' \n" +
"-  -- ---(-O-`--- --  -\n" +
"         ,`|'`.\n" +
"       ,   !    .\n" +
"           :       :  \" \n" +
"           .     --+--\n" +
" .:        .       !");System.out.print(" ` : | | | |:  ||  :     `  :  |  |+|: | : : :|   .        `              .\n" +
"      ` : | :|  ||  |:  :    `  |  | :| : | : |:   |  .                    :\n" +
"         .' ':  ||  |:  |  '       ` || | : | |: : |   .  `           .   :.\n" +
"                `'  ||  |  ' |   *    ` : | | :| |*|  :   :               :|\n" +
"        *    *       `  |  : :  |  .      ` ' :| | :| . : :         *   :.||\n" +
"             .`            | |  |  : .:|       ` | || | : |: |          | ||\n" +
"      '          .         + `  |  :  .: .         '| | : :| :    .   |:| ||\n" +
"         .                 .    ` *|  || :       `    | | :| | :      |:| |\n" +
" .                .          .        || |.: *          | || : :     :|||\n" +
"        .            .   . *    .   .  ` |||.  +        + '| |||  .  ||`\n" +
"     .             *              .     +:`|!             . ||||  :.||`\n" +
" +                      .                ..!|*          . | :`||+ |||`\n" +
"     .                         +      : |||`        .| :| | | |.| ||`     .\n" +
"       *     +   '               +  :|| |`     :.+. || || | |:`|| `\n" +
"                            .      .||` .    ..|| | |: '` `| | |`  +\n" +
"  .       +++                      ||        !|!: `       :| |\n" +
"              +         .      .    | .      `|||.:      .||    .      .    `\n" +
"          '                           `|.   .  `:|||   + ||'     `");
        
        System.out.println("");
        System.out.println("╔════•ೋೋ•════╗ \n" +
                           "        6º Desafio\n" +
                           "╚════•ೋೋ•════╝");
        
        System.out.println("Considere a sequência de estrelas infinita: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, ...  Qual é o milésimo termo dessa sequência? ");
        
        do{
                                    
                                    System.out.println("[1]- 45");
                                    System.out.println("[2]- 47");
                                    System.out.println("[3]- 44");
                                    System.out.println("[4]- 46");
                                    opcao = entrar.nextByte();
                                    
                                    switch(opcao){
                                        case 1:
                                           System.out.println("Você Acertou parabens!");
                                            pontuacao = pontuacao + 10;
                                            System.err.println("Pontuação: " +pontuacao);
                                            break;
                                            
                                        case 2:
                                           System.out.println("Você errou, tente novamente!");
                                           coracaoCont--;
                                           pontuacao = pontuacao - 10;
                                           System.err.println("Pontuação: " +pontuacao);
                                           System.out.println("Coração " +coracaoCont+ " / 3");
                                           if(coracaoCont == 0){
                                                System.out.println("");
                                                System.err.println("Suas vidas acabaram, você morreu!");
                                                System.out.println("");
                                                main(null);
                                                break;
                                            }
                                           break;
                                            
                                        case 3:
                                            System.out.println("Você errou, tente novamente!");
                                           coracaoCont--;
                                           pontuacao = pontuacao - 10;
                                           System.err.println("Pontuação: " +pontuacao);
                                           System.out.println("Coração " +coracaoCont+ " / 3");
                                           if(coracaoCont == 0){
                                                System.out.println("");
                                                System.err.println("Suas vidas acabaram, você morreu!");
                                                System.out.println("");
                                                main(null);
                                                break;
                                            }
                                           break;
                                            
                                        case 4:
                                           System.out.println("Você errou, tente novamente!");
                                           coracaoCont--;
                                           pontuacao = pontuacao - 10;
                                           System.err.println("Pontuação: " +pontuacao);
                                           System.out.println("Coração " +coracaoCont+ " / 3");
                                           if(coracaoCont == 0){
                                                System.out.println("");
                                                System.err.println("Suas vidas acabaram, você morreu!");
                                                System.out.println("");
                                                main(null);
                                                break;
                                            }
                                           break; 
                                           
                                        
                                        default:
                                            System.out.println("Opção invalida!");
                                            break;
                                    }//FIM SWITCH DESAFIO 2

                            
                                    }while(opcao != 1);
        
        
        return pontuacao;
    }
    
    static int desafio7(int pontuacao){
        Scanner entrar = new Scanner(System.in);
        byte opcao;
        int coracaoCont = 3;
        int dadosVida, opcaoVida, dado = 1;
        Random aleatorio = new Random();
        dadosVida = aleatorio.nextInt(6) + 1;
        
        System.out.println("");
        System.out.println("╔════•ೋೋ•════╗ \n" +
                           "   7º Desafio Final 1/3\n" +
                           "╚════•ೋೋ•════╝");
        System.out.println(""); 
        System.out.println("Dado está equação 13x-23-45=-7x+12, qual a sua respectiva resposta?");
        
        do{
                                    
                                    System.out.println("[1]- 2");
                                    System.out.println("[2]- 4");
                                    System.out.println("[3]- 5");
                                    System.out.println("[4]- 1");
                                    opcao = entrar.nextByte();
                                    
                                    switch(opcao){
                                        case 1:
                                           System.out.println("Você errou, tente novamente!");
                                           coracaoCont--;
                                           pontuacao = pontuacao - 15;
                                           System.err.println("Pontuação: " +pontuacao);
                                           System.out.println("Coração " +coracaoCont+ " / 3");
                                           if(coracaoCont == 0){
                                                System.out.println("");
                                                System.err.println("Suas vidas acabaram!");
                                                System.out.println("");
                                                if(dado == 1){
                                                do{
                                                System.out.println("Aperte [1] para usar o item Dado da vida,caso o numero for maior que 4 você ganha mais um coração");
                                                opcaoVida = entrar.nextInt();
                                                }while(opcaoVida != 1);
                                                if(opcaoVida == 1 && dado == 1){
                                                    if(dadosVida > 4){
                                                        dado--;
                                                        coracaoCont++;
                                                        System.out.println("Parabéns você conseguiu mais uma vida!");    
                                                    System.out.println("Coração " +coracaoCont+ " / 3");}
                                                    else{
                                                    System.out.println("");
                                                    System.err.println("Suas vidas acabaram o valor do dado da vida foi menor do que 5, fim de jogo!");
                                                    System.out.println("");
                                                    main(null);
                                                    break;}
                                                }else{
                                                    System.err.println("Suas vidas acabaram, fim de jogo!");
                                                    main(null);
                                                    break;}
                                                }
                                                else{
                                                    System.err.println("Fim de jogo!");
                                                    main(null);
                                                    break;}
                                            }
                                           break;
                                            
                                        case 2:
                                           System.out.println("Você Acertou parabens!");
                                            pontuacao = pontuacao + 20;
                                            System.err.println("Pontuação: " +pontuacao);
                                            break;
                                            
                                        case 3:
                                           System.out.println("Você errou, tente novamente!");
                                           coracaoCont--;
                                           pontuacao = pontuacao - 15;
                                           System.err.println("Pontuação: " +pontuacao);
                                           System.out.println("Coração " +coracaoCont+ " / 3");
                                           if(coracaoCont == 0){
                                                System.out.println("");
                                                System.err.println("Suas vidas acabaram!");
                                                System.out.println("");
                                                if(dado == 1){
                                                do{
                                                System.out.println("Aperte [1] para usar o item Dado da vida,caso o numero for maior que 4 você ganha mais um coração");
                                                opcaoVida = entrar.nextInt();
                                                }while(opcaoVida != 1);
                                                if(opcaoVida == 1 && dado == 1){
                                                    if(dadosVida > 4){
                                                        dado--;
                                                        coracaoCont++;
                                                        System.out.println("Parabéns você conseguiu mais uma vida!");    
                                                    System.out.println("Coração " +coracaoCont+ " / 3");}
                                                    else{
                                                    System.out.println("");
                                                    System.err.println("Suas vidas acabaram o valor do dado da vida foi menor do que 5, fim de jogo!");
                                                    System.out.println("");
                                                    main(null);
                                                    break;}
                                                }else{
                                                    System.err.println("Suas vidas acabaram, fim de jogo!");
                                                    main(null);
                                                    break;}
                                                }
                                                else{
                                                    System.err.println("Fim de jogo!");
                                                    main(null);
                                                    break;}
                                            }
                                           break;
                                            
                                        case 4:
                                           System.out.println("Você errou, tente novamente!");
                                           coracaoCont--;
                                           pontuacao = pontuacao - 15;
                                           System.err.println("Pontuação: " +pontuacao);
                                           System.out.println("Coração " +coracaoCont+ " / 3");
                                           if(coracaoCont == 0){
                                                System.out.println("");
                                                System.err.println("Suas vidas acabaram!");
                                                System.out.println("");
                                                if(dado == 1){
                                                do{
                                                System.out.println("Aperte [1] para usar o item Dado da vida,caso o numero for maior que 4 você ganha mais um coração");
                                                opcaoVida = entrar.nextInt();
                                                }while(opcaoVida != 1);
                                                if(opcaoVida == 1 && dado == 1){
                                                    if(dadosVida > 4){
                                                        dado--;
                                                        coracaoCont++;
                                                        System.out.println("Parabéns você conseguiu mais uma vida!");    
                                                    System.out.println("Coração " +coracaoCont+ " / 3");}
                                                    else{
                                                    System.out.println("");
                                                    System.err.println("Suas vidas acabaram o valor do dado da vida foi menor do que 5, fim de jogo!");
                                                    System.out.println("");
                                                    main(null);
                                                    break;}
                                                }else{
                                                    System.err.println("Suas vidas acabaram, fim de jogo!");
                                                    main(null);
                                                    break;}
                                                }
                                                else{
                                                    System.err.println("Fim de jogo!");
                                                    main(null);
                                                    break;}
                                            }
                                           break;
                                           
                                        
                                        default:
                                            System.out.println("Opção invalida!");
                                            break;
                                    }//FIM SWITCH DESAFIO

                            
                                    }while(opcao != 2);
        
        
        System.out.println("");
        System.out.println("╔════•ೋೋ•════╗ \n" +
                           "   7º Desafio Final 2/3\n" +
                           "╚════•ೋೋ•════╝");
        System.out.println(""); 
        System.out.println("Dado está equação 4x²-x+1=x+3x² , qual a sua respectiva resposta?");
        
        do{
                                    
                                    System.out.println("[1]- 2");
                                    System.out.println("[2]- 0");
                                    System.out.println("[3]- 3");
                                    System.out.println("[4]- 1");
                                    opcao = entrar.nextByte();
                                    
                                    switch(opcao){
                                        case 1:
                                           System.out.println("Você errou, tente novamente!");
                                           coracaoCont--;
                                           pontuacao = pontuacao - 15;
                                           System.err.println("Pontuação: " +pontuacao);
                                           System.out.println("Coração " +coracaoCont+ " / 3");
                                           if(coracaoCont == 0){
                                                System.out.println("");
                                                System.err.println("Suas vidas acabaram!");
                                                System.out.println("");
                                                if(dado == 1){
                                                do{
                                                System.out.println("Aperte [1] para usar o item Dado da vida,caso o numero for maior que 4 você ganha mais um coração");
                                                opcaoVida = entrar.nextInt();
                                                }while(opcaoVida != 1);
                                                if(opcaoVida == 1 && dado == 1){
                                                    if(dadosVida > 4){
                                                        dado--;
                                                        coracaoCont++;
                                                        System.out.println("Parabéns você conseguiu mais uma vida!");    
                                                    System.out.println("Coração " +coracaoCont+ " / 3");}
                                                    else{
                                                    System.out.println("");
                                                    System.err.println("Suas vidas acabaram o valor do dado da vida foi menor do que 5, fim de jogo!");
                                                    System.out.println("");
                                                    main(null);
                                                    break;}
                                                }else{
                                                    System.err.println("Suas vidas acabaram, fim de jogo!");
                                                    main(null);
                                                    break;}
                                                }
                                                else{
                                                    System.err.println("Fim de jogo!");
                                                    main(null);
                                                    break;}
                                            }
                                           break;
                                            
                                        case 2:
                                           System.out.println("Você errou, tente novamente!");
                                           coracaoCont--;
                                           pontuacao = pontuacao - 15;
                                           System.err.println("Pontuação: " +pontuacao);
                                           System.out.println("Coração " +coracaoCont+ " / 3");
                                           if(coracaoCont == 0){
                                                System.out.println("");
                                                System.err.println("Suas vidas acabaram!");
                                                System.out.println("");
                                                if(dado == 1){
                                                do{
                                                System.out.println("Aperte [1] para usar o item Dado da vida,caso o numero for maior que 4 você ganha mais um coração");
                                                opcaoVida = entrar.nextInt();
                                                }while(opcaoVida != 1);
                                                if(opcaoVida == 1 && dado == 1){
                                                    if(dadosVida > 4){
                                                        dado--;
                                                        coracaoCont++;
                                                        System.out.println("Parabéns você conseguiu mais uma vida!");    
                                                    System.out.println("Coração " +coracaoCont+ " / 3");}
                                                    else{
                                                    System.out.println("");
                                                    System.err.println("Suas vidas acabaram o valor do dado da vida foi menor do que 5, fim de jogo!");
                                                    System.out.println("");
                                                    main(null);
                                                    break;}
                                                }else{
                                                    System.err.println("Suas vidas acabaram, fim de jogo!");
                                                    main(null);
                                                    break;}
                                                }
                                                else{
                                                    System.err.println("Fim de jogo!");
                                                    main(null);
                                                    break;}
                                            }
                                           break;
                                            
                                        case 3:
                                           System.out.println("Você errou, tente novamente!");
                                           coracaoCont--;
                                           pontuacao = pontuacao - 15;
                                           System.err.println("Pontuação: " +pontuacao);
                                           System.out.println("Coração " +coracaoCont+ " / 3");
                                           if(coracaoCont == 0){
                                                System.out.println("");
                                                System.err.println("Suas vidas acabaram!");
                                                System.out.println("");
                                                if(dado == 1){
                                                do{
                                                System.out.println("Aperte [1] para usar o item Dado da vida,caso o numero for maior que 4 você ganha mais um coração");
                                                opcaoVida = entrar.nextInt();
                                                }while(opcaoVida != 1);
                                                if(opcaoVida == 1 && dado == 1){
                                                    if(dadosVida > 4){
                                                        dado--;
                                                        coracaoCont++;
                                                        System.out.println("Parabéns você conseguiu mais uma vida!");    
                                                    System.out.println("Coração " +coracaoCont+ " / 3");}
                                                    else{
                                                    System.out.println("");
                                                    System.err.println("Suas vidas acabaram o valor do dado da vida foi menor do que 5, fim de jogo!");
                                                    System.out.println("");
                                                    main(null);
                                                    break;}
                                                }else{
                                                    System.err.println("Suas vidas acabaram, fim de jogo!");
                                                    main(null);
                                                    break;}
                                                }
                                                else{
                                                    System.err.println("Fim de jogo!");
                                                    main(null);
                                                    break;}
                                            }
                                           break;
                                            
                                        case 4:
                                           System.out.println("Você Acertou parabens!");
                                            pontuacao = pontuacao + 25;
                                            System.err.println("Pontuação: " +pontuacao);
                                            break; 
                                           
                                        
                                        default:
                                            System.out.println("Opção invalida!");
                                            break;
                                    }//FIM SWITCH DESAFIO

                            
                                    }while(opcao != 4);
        
        
        
        System.out.println("");
        System.out.println("╔════•ೋೋ•════╗ \n" +
                           "   7º Desafio Final 3/3\n" +
                           "╚════•ೋೋ•════╝");
        System.out.println(""); 
        System.out.println("Dado está equação 3x²+5x=-x–9+2x , qual a sua respectiva resposta?");
        
        do{
                                    
                                    System.out.println("[1]- -1 e 0");
                                    System.out.println("[2]- 3");
                                    System.out.println("[3]- -3");
                                    System.out.println("[4]- 2 e -1");
                                    opcao = entrar.nextByte();
                                    
                                    switch(opcao){
                                        case 1:
                                           System.out.println("Você errou, tente novamente!");
                                           coracaoCont--;
                                           pontuacao = pontuacao - 20;
                                           System.err.println("Pontuação: " +pontuacao);
                                           System.out.println("Coração " +coracaoCont+ " / 3");
                                           if(coracaoCont == 0){
                                                System.out.println("");
                                                System.err.println("Suas vidas acabaram!");
                                                System.out.println("");
                                                if(dado == 1){
                                                do{
                                                System.out.println("Aperte [1] para usar o item Dado da vida,caso o numero for maior que 4 você ganha mais um coração");
                                                opcaoVida = entrar.nextInt();
                                                }while(opcaoVida != 1);
                                                if(opcaoVida == 1 && dado == 1){
                                                    if(dadosVida > 4){
                                                        dado--;
                                                        coracaoCont++;
                                                        System.out.println("Parabéns você conseguiu mais uma vida!");    
                                                    System.out.println("Coração " +coracaoCont+ " / 3");}
                                                    else{
                                                    System.out.println("");
                                                    System.err.println("Suas vidas acabaram o valor do dado da vida foi menor do que 5, fim de jogo!");
                                                    System.out.println("");
                                                    main(null);
                                                    break;}
                                                }else{
                                                    System.err.println("Suas vidas acabaram, fim de jogo!");
                                                    main(null);
                                                    break;}
                                                }
                                                else{
                                                    System.err.println("Fim de jogo!");
                                                    main(null);
                                                    break;}
                                            }
                                           break;
                                            
                                        case 2:
                                           System.out.println("Você errou, tente novamente!");
                                           coracaoCont--;
                                           pontuacao = pontuacao - 20;
                                           System.err.println("Pontuação: " +pontuacao);
                                           System.out.println("Coração " +coracaoCont+ " / 3");
                                           if(coracaoCont == 0){
                                                System.out.println("");
                                                System.err.println("Suas vidas acabaram!");
                                                System.out.println("");
                                                if(dado == 1){
                                                do{
                                                System.out.println("Aperte [1] para usar o item Dado da vida,caso o numero for maior que 4 você ganha mais um coração");
                                                opcaoVida = entrar.nextInt();
                                                }while(opcaoVida != 1);
                                                if(opcaoVida == 1 && dado == 1){
                                                    if(dadosVida > 4){
                                                        dado--;
                                                        coracaoCont++;
                                                        System.out.println("Parabéns você conseguiu mais uma vida!");    
                                                    System.out.println("Coração " +coracaoCont+ " / 3");}
                                                    else{
                                                    System.out.println("");
                                                    System.err.println("Suas vidas acabaram o valor do dado da vida foi menor do que 5, fim de jogo!");
                                                    System.out.println("");
                                                    main(null);
                                                    break;}
                                                }else{
                                                    System.err.println("Suas vidas acabaram, fim de jogo!");
                                                    main(null);
                                                    break;}
                                                }
                                                else{
                                                    System.err.println("Fim de jogo!");
                                                    main(null);
                                                    break;}
                                            }
                                           break;
                                            
                                        case 3:
                                           System.out.println("Você Acertou parabens!");
                                            pontuacao = pontuacao + 30;
                                            System.err.println("Pontuação: " +pontuacao);
                                            break;
                                            
                                        case 4:
                                           System.out.println("Você errou, tente novamente!");
                                           coracaoCont--;
                                           pontuacao = pontuacao - 20;
                                           System.err.println("Pontuação: " +pontuacao);
                                           System.out.println("Coração " +coracaoCont+ " / 3");
                                           if(coracaoCont == 0){
                                                System.out.println("");
                                                System.err.println("Suas vidas acabaram!");
                                                System.out.println("");
                                                if(dado == 1){
                                                do{
                                                System.out.println("Aperte [1] para usar o item Dado da vida,caso o numero for maior que 4 você ganha mais um coração");
                                                opcaoVida = entrar.nextInt();
                                                }while(opcaoVida != 1);
                                                if(opcaoVida == 1 && dado == 1){
                                                    if(dadosVida > 4){
                                                        dado--;
                                                        coracaoCont++;
                                                        System.out.println("Parabéns você conseguiu mais uma vida!");    
                                                    System.out.println("Coração " +coracaoCont+ " / 3");}
                                                    else{
                                                    System.out.println("");
                                                    System.err.println("Suas vidas acabaram o valor do dado da vida foi menor do que 5, fim de jogo!");
                                                    System.out.println("");
                                                    main(null);
                                                    break;}
                                                }else{
                                                    System.err.println("Suas vidas acabaram, fim de jogo!");
                                                    main(null);
                                                    break;}
                                                }
                                                else{
                                                    System.err.println("Fim de jogo!");
                                                    main(null);
                                                    break;}
                                            }
                                           break;
                                           
                                        
                                        default:
                                            System.out.println("Opção invalida!");
                                            break;
                                    }//FIM SWITCH DESAFIO

                            
                                    }while(opcao != 3);
        
        
        
        return pontuacao;
    }
    
    static void fimJogo(int pontuacao, String nome){
        System.out.println("");
        System.out.println(" ______________     _             _,-----------._        ___\n" +
"|              |   (_,.-      _,-'_,-----------._`-._    _)_)\n" +
"|              |      |     ,'_,-'  ___________  `-._`.\n" +
"|      \\     \\ |     `'   ,','  _,-'___________`-._  `.`.\n" +
"|    \\    \\    |        ,','  ,'_,-'     .     `-._`.  `.`.\n" +
"|              |       /,'  ,','        >|<        `.`.  `.\\\n" +
"|              |      //  ,','      ><  ,^.  ><      `.`.  \\\\\n" +
"|      \\       |     //  /,'      ><   / | \\   ><      `.\\  \\\\\n" +
"|   \\    \\     |    //  //      ><    \\/\\^/\\/    ><      \\\\  \\\\\n" +
"|______________|   ;;  ;;              `---'              ::  ::\n" +
"                   ||  ||              (____              ||  ||\n" +
"                  _||__||_            ,'----.            _||__||_\n" +
"                 (o.____.o)____        `---'        ____(o.____.o)\n" +
"                   |    | /,--.)                   (,--.\\ |    |\n" +
"                   |    |((  -`___               ___`   ))|    |\n" +
"                   |    | \\\\,'',  `.           .'  .``.// |    |\n" +
"                   |    |  // (___,'.         .'.___) \\\\  |    |\n" +
"                  /|    | ;;))  ____) .     . (____  ((\\\\ |    |\\\n" +
"                  \\|.__ | ||/ .'.--.\\/       `/,--.`. \\;: | __,|;\n" +
"                   |`-,`;.| :/ /,'  `)-'   `-('  `.\\ \\: |.;',-'|\n" +
"                   |   `..  ' / \\__.'         `.__/ \\ `  ,.'   |\n" +
"                   |    |,\\  /,                     ,\\  /,|    |\n" +
"                   |    ||: : )          .          ( : :||    |\n" +
"                  /|    |:; |/  .      ./|\\,      ,  \\| :;|    |\\\n" +
"                  \\|.__ |/  :  ,/-    <--:-->    ,\\.  ;  \\| __,|;\n" +
"                   |`-.``:   `'/-.     '\\|/`     ,-\\`;   ;'',-'|\n" +
"                   |   `..   ,' `'       '       `  `.   ,.'   |\n" +
"                   |    ||  :                         :  ||    |\n" +
"                   |    ||  |                         |  ||    |\n" +
"                   |    ||  |                         |  ||    |\n" +
"                   |    |'  |            _            |  `|    |\n" +
"                   |    |   |          '|))           |   |    |\n" +
"                   ;____:   `._        `'           _,'   ;____:\n" +
"                  {______}     \\___________________/     {______}\n" +
"                  |______|_______________________________|______|");
        System.out.println("Parabéns "+nome+", você conseguiu finalizar a sua jornada, graças a você a localização do portal da cordenada foi descoberto o reino de Eldia foi salvo, porém isso é só o começo...");
        
        System.out.println("");
        System.err.println("  Sua pontuação");
        System.err.println("  foi de: "+pontuacao);
        System.out.println("");
        
        
    }
    
    static String historiaJogo_1(String nome){
        
        String nomePersonagem = nome;
        int opcao;
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
"  |        seria diferente, a nossa historia se passa em algum       |\n" +
"  |      seculo já perdido, em meio as ruinas do tempo em uma terra   |\n" +
"  |      média chamada Eldia, quando a magia e o irreal                |\n" +
"  |      ainda coexistiam. A partir deste ponto temos                 |\n" +
"   |     um jovem rapaz, que, em poucos dias começaria uma jornada     |\n" +
"   |     que mudaria a sua vida.                                       |\n" +
" |                                                                  |\n" +
" |      \"a vida neste seculo não é nada facil, toda Eldia está     |\n" +
" |      \"destruida há seculos, a historia e todo o conhecimento    |\n" +
"  |        contido em nosso mundo está escasso, a busca por uma      |\n" +
"  |      coordenada que levara até a verdade sobre o nosso mundo é   |\n" +
"  |       constante, e no meio disto, a nação soberana de Marven quer |\n" +
"  |      impedir que qualquer um consiga obter tais conhecimentos,    |\n" +
"   |      somente obetendo tais informações poderá reconstruir o      |\n" +
"   |      mundo novamente. E você, é o escolhido para restaurar a paz   |\n" +
"   |         e a ordem em nosso mundo.                                   |\n" +
"   |                                                                    |\n" +
"   |                        você aceita continuar?                      |\n" +
"  |                                              ____________________|_ \n" +
"  |  ___________________-------------------------                      `\\\n" +
"  |/`--_                 ╔═════•ೋೋ•═════╗                 |\n" +
"  ||[ ]||                    1- [Sim]  || 2- [Não]    __________________/\n" +
"   \\===/___________________--------------------------");
        
        opcao = entrar.nextInt();
        
        if(opcao == 1){
            System.out.println("╔═══════•ೋೋ•═══════╗ \n" +
                               "         Informe o seu nome:\n" +
                               "╚═══════•ೋೋ•═══════╝");
          nomePersonagem = entrar.next();}
        else{
             System.out.println("");
             System.err.println("Voltando ao menu, Fim de jogo...");
             System.out.println("");
             main(null);
            }
        
        return nomePersonagem;
    }
    
    static String historiaJogo_2(String nome){
        
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
                    
                    System.out.println(" olá, jovem " +nome+ ", eu sou o 13º mago celestial o ultimo de todos, seu pai foi um grande mago e um excelente matematico,\n" +
" amigo e professor enconfiou a mim a missão de guia-lo em seu destino. "
+ "Sua jornada se passara nas ruínas do mundo desconhecido,\n" +
" onde caso você consiga passar pelos 10 desafios divinos, você obterá o conhecimento supremo para enfim restaurar o nosso mundo,\n" +
" o povo de Eldia conta com você. Salve o mundo e construa o seu destino...");    
                    
                    System.out.println("");
                    System.out.println("chegando nas ruinas do mundo desconhecido, o jovem se depara com o 1º problema.\n" +
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
                    
       return nome;             
    } 
    
    static void historiaJogo_3(){
        Scanner entrar = new Scanner(System.in);
        int opcao;
        
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
                            " muitos tentaram e nenhum até hoje conseguiu, se você não deseja perecer onde outros sucumbiram é a chance de voltar."
                                    + ""
                                    + "               você deseja continuar?");
                            System.out.println("╔═══════•ೋೋ•═══════╗ \n" +
                                               "        1- [Sim]  ||  2- [Não]\n" +
                                               "╚═══════•ೋೋ•═══════╝");
                            opcao = entrar.nextInt();
                            if(opcao == 1){
                                System.out.println("A partir daqui não se pode mais desistir e a morte será certa, porém caso consiga você obterá algo de valor inestimavel...");
                            }else{
                                    System.out.println("");
                                    System.err.println("Voltando para casa, fim da jornada...");
                                    System.out.println("");
                                    main(null);
                            }
                            
                            
    }
    
    static String historiaJogo_4(String nome){
        
        
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
                            
            System.out.println("Muito bem " +nome+ " porém sua jornada ainda está na metade, você deverá seguir ao norte,"
                    + " lá estará um grande castelo e a partir dali você terá cordenadas cruciais para o fim de sua jornada");
            System.out.println("");
            
            
            return nome;
    }
    
    static String historiaJogo_5(String nome){
        
        System.out.println("(Chegando ao norte " +nome+ " finalmente chega ao grande castelo das ruínas perdidas,"
                    + " um castelo de um antigo rei louco que deixou um grande segredo em sua torre principal,"
                + " o héroi precisa-ra chegar até ela porém talvez não seja tão facil assim");
        
        System.out.println("                                                                               .-,-}|\n" +
"                                                                                   \"|\n" +
"                                                                                   '|\n" +
"                                                                                    ;\n" +
"                                                                                   ;;;\n" +
"                                                                                  .;;;.\n" +
"                                                                                   [[[\n" +
"                                                                                  /@@@\\\n" +
"                                                                                  |[[[|\n" +
"                                                                                  ;\"\"\";\n" +
"                                                                                  ' ' '                                              .;;,        ,.\n" +
"                                                                                 '; ;  '                                  ..-.,.;'';'    '..,..;'  ',\n" +
"                                                                               .'.' ;   '.                              ,'    ;'         ;'   '      .\n" +
"                                                                               ;_.-----._;                          ,-.;'                          .  '  .\n" +
"                                                                               |  . . .  |                       .-'                                       .\n" +
"                                                                               |; ; ; ; ;|                     .'\n" +
"                                                                               |'_,...,_'|                   .-;,.-.\n" +
"    . ; .                                                                    ;-'\"  _.   \"'-;              .;'    '\n" +
" .        '.                                                               ./|    '\"|    -\"|\\.          ;'\n" +
",          ';..,.,                                                    -}|.'/.o.;   /o\\   ;.o.\\'}|    ;''\n" +
"            .''   ';                                                    | / | d    b d    b | \\ |  .;'\n" +
"           .        ';                                                  |/  -\"  ,,,___,,,  \"-  \\| .                      ...\n" +
"                   ,'';.                                                ;  _,.==\"\"\"   \"\"\"==.,_  ;                      ;''''';.\n" +
"                 ;,    ;,                                               |=;-', _ , /\\ , _  \"'-;=|                    ;'     '  ';.;';,      .-.,\n" +
"       .                ';;..                                           |, /( ) | || | | ( )\\ , |                 .;'                ';. ,;;'  ;'';.\n" +
"                         . '';.                                         | ||| ||| ||_| ||| ||| ;|                ;;                   ,;''          ;.\n" +
"                              ';                                        | ||| |.+ '--' +.| ||| ||              .;''                  ,'              ;;,\n" +
"             .                  ';,                                     | |-  __...---...__ \"' ;|             ;'                                      ;;\n" +
"                                '  ;.                                   |_.-'\"__...---...__\"'-._|           ;';.                                        '.\n" +
"                     .             .;                                   |_.-'\"  . . ; . .  \"'-._|          '                                              .\n" +
"                                  ' ';.                                  \\ \\.' \\  '   '  / './ /        ,;';.\n" +
"                                     ;'                                   \\_.,;;;''''''';;;,._/       .;'\n" +
"            , -.                    ;;.                                    |''      ||     ''|\n" +
"          .     '.                   ';.                                   |||               |\n" +
"         '        ;;';.      ,.        '.                                  |                 |\n" +
"                 '    '; ..;'  ';.                                         |          ||     |\n" +
"                        ' '      ';.          ,            ,,,,....---;;;;;|  ||             |;;;;;---....,,,,\n" +
"                                   '        '   '. ....;;;;;;;;;;;;;;;;;'''|                 |''';;;;;;;;;;;;;;;;;....\n" +
"                                     .-.    ...-;;;''''    _________..---\"\"|            ||   |\"\"---.._________    '''';;;-...\n" +
"                                    '   ;.;;''''  ,,..--'''                |    ||           |                '''--..,,  '''';;.,\n" +
"                                     .;;''  .- '     ;.                    |                 |                          ' -.  '';;.\n" +
"                           ,..    ,,;;' . \";,         ';                   |              || |                               \" . ';;,,\n" +
"                          '  ''.,;;', '       '.       ';                  |      ||         |                                   ' ,';;,.\n" +
"                              .;;''.,                   '                  |                 |                                         ';;.\n" +
"                            .;;' .' ''.                                    |                ||                                        '. ';;.\n" +
"                           ;;'  '       '..-.                              |        ||       |                                          '  ';;\n" +
"                         ,;'  '        ,;'   ';,                           |||               |                                            '  ';,\n" +
"                        ;;' \"                                              |                 |                                              \" ';;\n" +
"                      .;' ,'                                               |          ||     |                                               ', ';.\n" +
"                     ,;  /                                                 |  ||             |                                                 \\  ;,\n" +
"                    ,; .'                                                  |                 |                                                  '. ;,\n" +
"                   ,;                                                      |            ||   |                                                      ;,\n" +
"                  ;; '                                                     |     .     .     |                                                     ' ;;\n" +
"                 ;; '                                                 __.  |   .;|.=|.;|     |__.                                                   ' ;;\n" +
"                ;'                                                     '| \";}|  .|. | .|.;}| | '|                                                      ';\n" +
"               ;' '                                                    ,|, | |  ;;;;;;;;;  | | ,|,                                                    ' ';\n" +
"              ,'                                                \";}|   ;;; |;;;'| .;;;. |';;;| ;;;\";}|                                                   ',\n" +
"             ;; '       |                                          |  '|'|'.;;;.| || || |.;;;.'| |'  |                                          |       ' ;;\n" +
"            ;;   _._,;;)|                                         ;;;  | |/|| |/| || || |\\| ||\\| |  ;;;                                  _._,;;)|          ;;\n" +
"           ,;;     \"    |                                        .;;;./| | || | | || || | | || | |\\.;;;.                                   \"    |          ;;\n" +
"           ;' .         |                                         | |//| | || | | || || | | || | |\\\\| |                                         |         . ';\n" +
"          ;;;           |                                         | |/ | | || |--\"\"| |\"\"--| || | | \\| |                                         |           ;;;\n" +
"         ,;;           |||                                        | |  | |.'| | __.| |.__ | |'.| |  | |                                        |||           ;;,\n" +
"         ;.  .        ,;;;,                                       | |  | / _| |\"   | |   \"| |_ \\ |  | |                                       ,;;;,         . .;\n" +
"        ;              [.]                                        | |  |;-\" | |; ' | | ' ;| | \"-;|  | |                                        [.]             ;;\n" +
"     .-. .-\"-,       /'   '\\                                      | |  ||; '| |_.-\\| |/-._| |' ;||  | |                                      /'   '\\         ' ';,\n" +
"  .-'   \".  _.\".     |_____|                                      | |  .| _.| |/\"| | | |\"\\| |._ |.  | |                                      |_____|          . ;;.\n" +
"-'\"-.         \"-.    [Phils]                                      | ;-/.\\|  | |  | | | |  | |  |/.\\-; |                                      [ascii]             ;;\n" +
"     '           '. '       ' .                                   ||/| ;.|  | |  | | | |  | |  |.; |\\||                                   . '       ' .        . ;;,\n" +
"                ,' /         \\ ',                                 ||I||\"||  | |  | | | |  | |  ||\"||I||                                 ,' /         \\ ',        ';;\n" +
"             | '  |   ,.;.,   |  ' |                              || || ||  | |  | | | |  | |  || || ||                              | '  |   ,.;.,   |  ' |      ;;,\n" +
"             ;'_.-||=========||-._'|                              || || ||  | |  | | | |  | |  || || ||                              |'_.-||=========||-._';    .  ;;\n" +
"             |' ,,||,, ,, ,, ||,  ||                              || || ||  | |__|_|_|_|__| |  || || ||                              ||  ,|| ,, ,, ,,||,, '|       ;;,\n" +
"             |;;''|| '  '  ' ||';.||                              || ||_||-_[;;-----------;;]_-||_|| ||                              ||.;'|| '  '  ' ||'';;|        ;;\n" +
"             |    || #  #  # ||  '||                            __|-[;;--\\\" __,.---------.,__  /--;;_-|__                            ||'  || #  #  # ||    |     .  ;;.\n" +
"           I/|# I/|| #  #  # ||\\I ||                           ;--\\\" _,.--;\"[ ' ' ';I)' ' ' ]\";--.,_ \"/--;                           || I/|| #  #  # ||\\I #|\\I      ;;;\n" +
"           I |# I || #  #  # || I ||\\I                         \\.--'\"[ '          (;';)          ' ]\"'--./                         I/|| I || #  #  # || I #| I      ;;;\n" +
"         ,_I_|__I_||_________||,I_|| I                          |[ '     |       ,;;;;;,       |        |                          I ||_I ||_________||_I__|_I_,    ';;,\n" +
"        ;/_____________________\\;_''-I..\\|                      |        ;,.,.,;'       ';..,.,;        |                      |/..I-''_;/_____________________\\; .  ;;;\n" +
"     ,  | _   _   _   _   _   _ | ''--.._|    ;    ,_.    ;     |      ,;'`'`;'     .     ';'`'';,      |     ;    ._,    ;    |_..--'' | _   _   _   _   _   _ |  , ;;;\n" +
"     ;__|((| ((| ((| ((| ((| ((||   /\"/'\\|    P     j     P     |  . ,;'    ;'    ,;'; ,   ';    ';, .  |     I     (     I    |/'\\\"\\   ||)) |)) |)) |)) |)) |))|__; ;;;\n" +
"  |__/  | ..  ..  ..  ..  ..  ..|  / / /\"\"\"\"\"\"/\"\"\"\"\"/\"\"\"\"\"/\"\"\"\"\"/\\ |;'     ';;;;;;'.-.';;;;;;'     ';| /\\\"\"\"\"\"\\\"\"\"\"\"\\\"\"\"\"\"\\\"\"\"\"\"\"\\ \\ \\  |..  ..  ..  ..  ..  .. |  \\__|.\n" +
" /  /   | ''  ''_.=;=,_'  ''  ''| / / /      /     /     /     /  '(======= [____]'   `[____] =======)   \\     \\     \\     \\      \\ \\ \\ |''  ''  '_,='=._''  '' |   \\  \\\n" +
"/ ,/    | ;;_,-;-','-;-;=,_;  ;;|/_/ /____.-;___.-;___.-;___.-;____[--------\\____|_____|____/--------]____;-.___;-.___;-.___;-.____\\ \\_\\|;;  ;_,=;-;-','-;-,_;; |    \\, \\\n" +
"\\#/     |,-',-'__(_;'_'-,'=;-,_ |  | |\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|.-. .-./|.--.|-----|.--.|\\.-. .-.|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"| |  | _,-;=',-'_';_)__'-,'-,|     \\#/\n" +
"|\"|#####|\\(/ (/)/ (/) (/\\) _|| ||  | |'' '' '' '' '' '' '' '' '' ''||'| |\"||||II||,'|`,||ii||||\"| |`||'' '' '' '' '' '' '' '' '' ''| |  || ||_ (/\\) (\\) \\(\\) \\)/|#####|\"|\n" +
"|\"|H H H|| |=|#|=|#|=|#|=|#||| ||  | |;; ;; ;; ;; ;; ;; ;; ;; ;; ;;|========| ## |;=|=;| ## |========|;; ;; ;; ;; ;; ;; ;; ;; ;; ;;| |  || |||#|=|#|=|#|=|#|=| ||H H H|\"|\n" +
"|\"|H H H|| | |#| |#| |#| |#||| ||  | |,, ,, ,, ,, ,, ,, ,, ,, ,, ,,|;;  ;; ;| ## || | || ## |; ;;  ;;|,, ,, ,, ,, ,, ,, ,, ,, ,, ,,| |  || |||#| |#| |#| |#| | ||H H H|\"|\n" +
"|_|H H H|| | |'| |'| |'| |'||| ||  | |============================r|,,  ,, ,| ## ||=|=|| ## |, ,,  ,,|?============================| |  || |||'| |'| |'| |'| | ||H H H|_|\n" +
"  |_____||,===-===-===-===,|.'\"\"'--'\" \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"||''  '' ()    || | ||    () ''  ''||\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" \"'--'\"\"'.|,===-===-===-===,||_____|\n" +
"-\"    _.-\"            _-\"_;'                                     ;||''  '' ,;    ||=|=||    ;, ''  ''||;                                     ';_\"-_            \"-._    \"-\n" +
"     '---------------'-''                                      *' ||=======II----'-----'----II=======|| '*                                      ''-'---------------'\n" +
"                                                               ]  |;/     ,;'               ';,     \\;|  [\n" +
"                                                               '--'()----//                   \\\\----()'__'\n" +
"                                                                   ii  ,;'                     ';,  ii            \\)     '-\n" +
"                                                                   []'\"'                         '\"'[]             \\)()\\),()_\n" +
"                                                                     \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"    ");
        
        return nome;
    }
    
    static String historiaJogo_6(String nome){
        System.out.println("");
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
                            
            System.out.println("Olá " +nome+ " a partir daqui eu não vou mais poder te acompanhar e tudo dependera apenas de você,"
                    + " dentro deste castelo encontra-se a cordenada para salvar o nosso reino, que a benção dos deuses caia sobre você)");
            
            return nome;
    }
    
    static void historiaJogo_7(){
    Scanner entrar = new Scanner(System.in);
    int resposta, coracao = 3;
    int vetor[] = {0, 0, 0};
    Random aleatorio = new Random();
    
    
    
    
        System.out.println("");
        System.out.println("Agora finalmente dentro do castelo o objetivo de nosso heroi está mais perto\n"
                + " do que nunca porém a presença de um grande mal se aproximando tambem,\n"
                + " o objetivo dele neste momento é chegar na torre principal mas o castelo é extremamente grande a ponto dele poder se perder dentro");
        
        System.out.println("....................");
        
        System.out.println("                                    .\"\"--..__\n" +
"                     _                     []       ``-.._\n" +
"                  .'` `'.                  ||__           `-._\n" +
"                 /    ,-.\\                 ||_ ```---..__     `-.\n" +
"                /    /:::\\\\               /|//}          ``--._  `.\n" +
"                |    |:::||              |////}                `-. \\\n" +
"                |    |:::||             //'///                    `.\\\n" +
"                |    |:::||            //  ||'                      `|\n" +
"                /    |:::|/        _,-//\\  ||\n" +
"               /`    |:::|`-,__,-'`  |/  \\ ||\n" +
"             /`  |   |'' ||           \\   |||\n" +
"           /`    \\   |   ||            |  /||\n" +
"         |`       |  |   |)            \\ | ||\n" +
"        |          \\ |   /      ,.__    \\| ||\n" +
"        /           `         /`    `\\   | ||\n" +
"       |                     /        \\  / ||\n" +
"       |                     |        | /  ||\n" +
"       /         /           |        `(   ||\n" +
"      /          .           /          )  ||\n" +
"     |            \\          |     ________||\n" +
"    /             |          /     `-------.|\n" +
"   |\\            /          |              ||\n" +
"   \\/`-._       |           /              ||\n" +
"    //   `.    /`           |              ||\n" +
"   //`.    `. |             \\              ||\n" +
"  ///\\ `-._  )/             |              ||\n" +
" //// )   .(/               |              ||\n" +
" ||||   ,'` )               /              //\n" +
" ||||  /                    /             || \n" +
" `\\\\` /`                    |             // \n" +
"     |`                     \\            ||  \n" +
"    /                        |           //  \n" +
"  /`                          \\         //   \n" +
"/`                            |        ||    \n" +
"`-.___,-.      .-.        ___,'        (/    \n" +
"         `---'`   `'----'`");
        
        System.out.println("Olá humano eu posso ajuda-lo, eu sou a Morte a contrario da deusa da divina que não pode entrar neste castelo eu estou aprisionado aqui, \n"
                + "quando o antigo rei enlouqueceu e começou a atacar o seu proprio povo eu estava observando a final eu sou onisciente e onipresente \n"
                + "eu sabia quando o fim do rei iria chegar porém não imaginaria que em seu ultimo suspiro ele iria conjurar uma poderosa magia de aprisionamento em mim, \n"
                + "tudo que eu quero é poder ver a Deusa divina mais uma vez e se você chegar na torre principal esta magia será desfeita, \n"
                + "existem 3 portas a sua frente, apenas uma ira te levar a escada que sobre até a torre principal e as outras duas irão te matar, escolha sabiamente, porém essas portas mudam aleatoriamente, boa sorte.");
        
        
        
        do{
        int valorAleatorio = aleatorio.nextInt(3);    
        for(int i = 0; i < vetor.length; i++){
        vetor[i] = valorAleatorio;
        }   
            
        System.out.println("");
        System.out.println("Escolha sabiamente a sua porta, 1ºPorta[0], 2ºPorta[1], 3ºPorta[2]?");
        resposta = entrar.nextInt();
        
        if(vetor[valorAleatorio] == resposta){
            System.out.println("Parabéns você escolheu a porta certa!");
            System.out.println("");
            break;
            
        }else{
            coracao--;
            System.out.println("");
            System.err.println("Você escolheu a porta errado, tente novamente!");
            System.err.println("Coração "+coracao+" / 3");
            System.out.println("");
           
        }
        }while(coracao != 0);
        
        if(coracao == 0){
        System.out.println("");
        System.err.println("Suas chances acabaram, você morreu!");
        System.out.println("");
        main(null);}
        
        
}
    
    static void historiaJogo_8(String nome){
        
        System.out.println("Morte: ");
        System.out.println("                                    .\"\"--..__\n" +
"                     _                     []       ``-.._\n" +
"                  .'` `'.                  ||__           `-._\n" +
"                 /    ,-.\\                 ||_ ```---..__     `-.\n" +
"                /    /:::\\\\               /|//}          ``--._  `.\n" +
"                |    |:::||              |////}                `-. \\\n" +
"                |    |:::||             //'///                    `.\\\n" +
"                |    |:::||            //  ||'                      `|\n" +
"                /    |:::|/        _,-//\\  ||\n" +
"               /`    |:::|`-,__,-'`  |/  \\ ||\n" +
"             /`  |   |'' ||           \\   |||\n" +
"           /`    \\   |   ||            |  /||\n" +
"         |`       |  |   |)            \\ | ||\n" +
"        |          \\ |   /      ,.__    \\| ||\n" +
"        /           `         /`    `\\   | ||\n" +
"       |                     /        \\  / ||\n" +
"       |                     |        | /  ||\n" +
"       /         /           |        `(   ||\n" +
"      /          .           /          )  ||\n" +
"     |            \\          |     ________||\n" +
"    /             |          /     `-------.|\n" +
"   |\\            /          |              ||\n" +
"   \\/`-._       |           /              ||\n" +
"    //   `.    /`           |              ||\n" +
"   //`.    `. |             \\              ||\n" +
"  ///\\ `-._  )/             |              ||\n" +
" //// )   .(/               |              ||\n" +
" ||||   ,'` )               /              //\n" +
" ||||  /                    /             || \n" +
" `\\\\` /`                    |             // \n" +
"     |`                     \\            ||  \n" +
"    /                        |           //  \n" +
"  /`                          \\         //   \n" +
"/`                            |        ||    \n" +
"`-.___,-.      .-.        ___,'        (/    \n" +
"         `---'`   `'----'`");
        
        System.out.println("Muito obrigado "+nome+", você me libertou de minha prisão de seculos e graças a você eu poderei ver a Deusa divina novamente ou como eu a conheço,\n"
                + " Eldia a Deusa da vida, você ira encontrar o seu destino em breve, permita-me ajuda-lo irei te dar um item chamado dados da vida,\n"
                + " caso você morra você podera rola-los e isso poderá te dar mais uma chance mas você só pode usar uma unica vez, salve o seu povo e cumpra o seu destino.");
        System.out.println("");
    }
    
    static void historiaJogo_9(String nome){
        
        System.out.println("");
        System.out.println("Após "+nome+" conseguir as cordenadas finais na torre e obter o item 'Dados da vida' ele se dirige para o local final de sua jornada, \n"
                + "porém ali ele já começava a sentir um grande mal, ele sabia que algo estava por vir e sentia cada vez mais isso chegando perto");
        System.out.println("");
        System.out.println("...............");
        System.out.println("");
        System.out.println("..................................");
        System.out.println("");
        System.out.println("Sauron o destruidor, Rei da nação de Marven: ");
        System.out.println("          _\n" +
"                              ==(W{==========-      /===-\n" +
"                                ||  (.--.)         /===-_---~~~~~~~----__\n" +
"                                | \\_,|**|,__      |===-~___            _,-'`\n" +
"                   -==\\\\        `\\ ' `--'   ),    `//~\\\\   ~~~~`--._.-~\n" +
"               ______-==|        /`\\_. .__/\\ \\    | |  \\\\          _-~`\n" +
"         __--~~~  ,-/-==\\\\      (   | .  |~~~~|   | |   `\\       ,'\n" +
"      _-~       /'    |  \\\\     )__/==0==-\\<>/   / /      \\     /\n" +
"    .'        /       |   \\\\      /~\\___/~~\\/  /' /        \\   /\n" +
"   /  ____  /         |    \\`\\.__/-~~   \\  |_/'  /          \\/'\n" +
"  /-'~    ~~~~~---__  |     ~-/~         ( )   /'        _--~`\n" +
"                    \\_|      /        _) | ;  ),   __--~~\n" +
"                      '~~--_/      _-~/- |/ \\   '-~ \\\n" +
"                     {\\__--_/}    / \\\\_>-|)<__\\      \\\n" +
"                     /'   (_/  _-~  | |__>--<__|      |\n" +
"                    |   _/) )-~     | |__>--<__|      |\n" +
"                    / /~ ,_/       / /__>---<__/      |\n" +
"                   o-o _//        /-~_>---<__-~      /\n" +
"                   (^(~          /~_>---<__-      _-~\n" +
"                  ,/|           /__>--<__/     _-~\n" +
"               ,//('(          |__>--<__|     /                  .--_\n" +
"              ( ( '))          |__>--<__|    |                 /' _-_~\\\n" +
"           `-)) )) (           |__>--<__|    |               /'  /   ~\\`\\\n" +
"          ,/,'//( (             \\__>--<__\\    \\            /'  //      ||\n" +
"        ,( ( ((, ))              ~-__>--<_~-_  ~--__---~'/'/  /'       VV\n" +
"      `~/  )` ) ,/|                 ~-_~>--<_/-__      __-~ _/\n" +
"    ._-~//( )/ )) `                    ~~-'_/_/ /~~~~~__--~\n" +
"     ;'( ')/ ,)(                              ~~~~~~~~\n" +
"    ' ') '( (/");
        
        System.out.println("Olá " +nome+ " muito obrigado por me levar a cordenada, eu estava te observando de longe a muito tempo,\n"
                + " uma de minhas videntes profetizou a minha morte pelas mãos de um jovem héroi do reino de Eldia, porém não irei perder,"
                + " você irá conhecer o despero e terror de verdade!");
        
    }
    
    
    //FIM
}