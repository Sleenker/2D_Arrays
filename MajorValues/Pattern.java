import java.util.Scanner;
import java.util.Random;

/**
* Engineered and developed by Jhonny Trejos Barrios.
* Technology: Java.
* Version: Java Development Kit 1.8.0_31, Standard Edition.
* Development Environment: VIM 7.3
* 
* Additional Info.
*
* Source Code Target:
*
*               [FROM A GIVEN MATRIX EXTRACT MAJORS VALUES BY ROWS, COLUMNS, PRIMARY DIAGONAL, SECONDARY DIAGONAL AND WHOLE ARRAY]
*
* Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
* Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
* Mobile: --
*/

public class Pattern
{
    int[][] array;
    int[] byRows, byCols;
    int maxRow = 0, maxCol = 0, maxDiag1 = 0, maxDiag2 = 0, biggest;

    public static void main( String[] args )
    {
        System.out.print( "Array size: " );

        new Pattern().printMatrix( new Scanner( System.in ).nextInt() );
    }

    public void printMatrix( int size )
    {
        array = new int[ size ][ size ];

        for( int i = 0; i < array.length; i++ )
        {
            System.out.println( "" );

            for( int j = 0; j < array.length; j++ )
            {
                array[ i ][ j ] = 1 + new Random().nextInt( 100 );
                System.out.print( array[ i ][ j ] + "\t" );
            }
        }

        extractValues();
    }

    public void extractValues()
    {
        byRows = new int[ array.length ];
        byCols = new int[ array.length ];

        for( int i = 0; i < array.length; i++ )
        {
            for( int j = 0; j < array.length; j++ )
            {
                if( array[ i ][ j ] > biggest )
                {
                    biggest = array[ i ][ j ];
                }

                if( array[ i ][ j ] > maxRow )
                {
                    maxRow = array[ i ][ j ];
                }

                if( array[ j ][ i ] > maxCol )
                {
                    maxCol = array[ j ][ i ];
                }

                if( i == j )
                {
                    if( array[ i ][ j ] > maxDiag1 )
                    {
                        maxDiag1 = array[ i ][ j ];
                    }
                }

                if( i + j == array.length - 1 )
                {
                    if( array[ i ][ j ] > maxDiag2 )
                    {
                        maxDiag2 = array[ i ][ j ];
                    }
                }
            }

            byRows[ i ] = maxRow;
            byCols[ i ] = maxCol;
            maxRow = 0;
            maxCol = 0;
        }
    
        System.out.println( "\n\nMajors values by row:" );

        for( int i = 0; i < byRows.length; i++ )
        {
            System.out.print( byRows[ i ] + "  " );
        }

        System.out.println( "\n\nMajors values by column:" );

        for( int i = 0; i < byCols.length; i++ )
        {
            System.out.print( byCols[ i ] + "  " );
        }

        System.out.println( "\n\nMajor value in primary diagonal:\n" + maxDiag1 );

        System.out.println( "\nMajor value in secondary diagonal:\n" + maxDiag2 );

        System.out.println( "\nBiggest data value:\n" + biggest );
    }
}
