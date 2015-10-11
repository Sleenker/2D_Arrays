import java.util.Scanner;

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
*               [BIDIMENSIONAL ARRAY, MAGIC CUBE BUILD PATH]
*
* Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
* Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
* Mobile: --
*/

public class MagicCube
{
    public static void main( String[] args )
    {
        System.out.print( "Array size: " );
        new MagicCube().printPath( new Scanner( System.in ).nextInt() );
    }

    public void printPath( int size )
    {
        int[][] array = new int[ size ][ size ];
        int x = 1, y;

        if( size % 2 == 0 )
        {
            y = array.length / 2 - 2;
        }
        else
        {
            y = array.length / 2 - 1;
        }

        for( int i = 0; i < array.length * array.length; i++ )
        {
            x --;
            y ++;

            if( x == -1 && y == array.length )
            {
                x += 2;
                y --;
            }
            else
            {
                if( x == -1 )
                {
                    x = array.length - 1;
                }
                
                if( y == array.length )
                {
                    y = 0;

                    if( array[ x ][ y ] != 0 )
                    {
                        x ++;
                    }
                }

                if( array[ x ][ y ] != 0 )
                {
                    x += 2;
                    y --;
                }
            }

            array[ x ][ y ] = i + 1;
        }

        for( int i = 0; i < array.length; i++ )
        {
            System.out.println( "" );

            for( int j = 0; j < array.length; j++ )
            {
                System.out.print( array[ i ][ j ] + "\t" );
            }
        }
    }
}
