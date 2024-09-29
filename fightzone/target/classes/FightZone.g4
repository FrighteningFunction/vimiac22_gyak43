grammar FightZone;


start   :   command+ ;

command :   'create' NAME 'with strength' INT    # createCommand
        |   'make' NAME 'and' NAME 'fight'       # fightCommand
        ;

NAME    :   [a-zA-Z]+ ;
INT     :   [0-9]+ ;
WS      :   [ \t\r\n]+ -> skip ;