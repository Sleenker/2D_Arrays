//-------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

//-------------------------------------------------------------------------------------------------------------------------------------------------

/**
 * Engineered and developed by Jhonny Trejos Barrios.
 * Technology: Java.
 * Version: Java Development Kit 1.8.0_31, Standard Edition.
 * Development Environment: Sublime Text 3.
 * ------------------------------------------------------------------------------------------------------------------------------------------------
 * ------------------------------------------------------------------------------------------------------------------------------------------------
 * Additional Info.
 *
 * Source Code Target:
 *
 *			BIDIMENSIONAL ARRAY ZIG-ZAG PATH BUILD.
 *
 * Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
 * Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
 * Mobile: --.
 */

//-------------------------------------------------------------------------------------------------------------------------------------------------

public class Pattern
{
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public static void main( String[] args )
	{
		System.out.print( "Array Size: " );

		new Pattern().printPath( new Scanner( System.in ).nextInt() );
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public void printPath( int size )
	{
		int[][] array = new int[ size ][ size ];
		int x = 1, y = -1;
		boolean up = true;

		for( int k = 1; k <= size * size; k++ )
		{
			if( up )
			{
				x --;
				y ++;
			}
			else
			{
				x ++;
				y --;
			}

			if( ( x == -1 ) && ( y == array.length ) )
			{
				x += 2;
				y --;
				up = false;
			}

			if( ( x == array.length ) && ( y == -1 ) )
			{
				x --;
				y += 2;
				up = true;
			}

			if( x == -1 )
			{
				x ++;
				up = false;
			}

			if( x == array.length )
			{
				x --;
				y += 2;
				up = true;
			}

			if( y == -1 )
			{
				y ++;
				up = true;
			}

			if( y == array.length )
			{
				x += 2;
				y --;
				up = false;
			}

			array[ x ][ y ] = k;
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
	//---------------------------------------------------------------------------------------------------------------------------------------------
}
//-------------------------------------------------------------------------------------------------------------------------------------------------