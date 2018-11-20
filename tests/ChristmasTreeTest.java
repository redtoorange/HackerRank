import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasTreeTest {

    @Test
    void printTree() {
        assertTrue( ChristmasTree.printTree( 0 ).equals(
                "") );

        assertTrue( ChristmasTree.printTree( 1 ).equals(
                "*\n"+
                "*\n") );

        assertTrue( ChristmasTree.printTree( 3 ).equals(
                "  *\n"+
                " ***\n"+
                "*****\n"+
                "  *\n") );

        assertTrue( ChristmasTree.printTree( 6 ).equals(
                "     *\n"+
                "    ***\n"+
                "   *****\n"+
                "  *******\n"+
                " *********\n"+
                "***********\n"+
                "     *\n") );
    }

    @Test
    void printLevel() {
        assertTrue( ChristmasTree.printLevel( 0, 1 ).equals( " \n" ) );
        assertTrue( ChristmasTree.printLevel( 1, 1 ).equals( "*\n" ) );

        assertTrue( ChristmasTree.printLevel( 0, 2 ).equals( "  \n" ) );
        assertTrue( ChristmasTree.printLevel( 1, 2 ).equals( " *\n" ) );
        assertTrue( ChristmasTree.printLevel( 2, 2 ).equals( "***\n" ) );

        assertTrue( ChristmasTree.printLevel( 1, 0 ).equals( "" ) );
    }
}