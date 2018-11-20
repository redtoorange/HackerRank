import java.util.Scanner;


public class ChristmasTree {
    public static void main( String[] args ) {
        System.out.println(printTree( new Scanner( System.in ).nextInt() ));
    }

    static String printTree( int levels ) {
        StringBuilder treeStr = new StringBuilder(  );

        if( levels > 0 ) {
            for( int i = 1; i <= levels; i++ )
                treeStr.append( printLevel( i, levels ) );
            treeStr.append( printLevel( 1, levels ) );
        }

        return treeStr.toString();
    }


    static String printLevel( int level, int max ) {
        StringBuilder levelStr = new StringBuilder(  );

        if( level <= max){
            int spaces = max - level;
            int stars = level * 2 - 1;

            while( spaces-- > 0 )
                levelStr.append( " " );
            while( stars-- > 0 )
                levelStr.append( "*" );

            levelStr.append("\n");
        }


        return levelStr.toString();
    }
}
