import java.util.Scanner;


public class ChristmasTree {
    public static void main( String[] args ) {
        printTree( new Scanner( System.in ).nextInt() );
    }

    static void printTree( int levels ) {
        if( levels > 0 ) {
            for( int i = 1; i <= levels; i++ )
                printLevel( i, levels );
            printLevel( 1, levels );
        }
    }


    static void printLevel( int level, int max ) {
        int spaces = max - level;
        int stars = level * 2 - 1;

        while( spaces-- > 0 )
            System.out.print( " " );
        while( stars-- > 0 )
            System.out.print( "*" );

        System.out.println();
    }
}
