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
 *			BIDIMENSIONAL ARRAY, SPIRAL PATTERN BUILD. TYPE 1: IN-OUT.
 *
 * Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
 * Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
 * Mobile: --.
 */

//-------------------------------------------------------------------------------------------------------------------------------------------------

public class Pattern1
{
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public static void main( String[] args )
	{
		System.out.print( "Array Size: " );

		new Pattern1().printPath( new Scanner( System.in ).nextInt() );
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public void printPath( int size )
	{
		int[][] array = new int[ size ][ size ];
		int x = array.length / 2, y = x - 1, top = 1;
		boolean up = true, right = false, down = false;

		if( size % 2 != 0 )
		{
			y ++;
			x ++;
			top = 0;
		}
		
		for( int k = 1; k <= array.length * array.length; k++ )
		{
			if( up )
			{
				if( x == y )
				{
					up = false;
					right = true;
					y ++;
				}
				else
				{
					x --;
				}
				
			}
			else
			{
				if( right )
				{
					// if( x + y == array.length - 1 )
					if( x + y == ( array.length - top ) )
					{
						right = false;
						down = true;
						x ++;
					}
					else
					{
						y ++;
					}
				}
				else
				{
					if( down )
					{
						if( x == y )
						{
							down = false;
							y --;
						}
						else
						{
							x ++;
						}
					}
					else
					{
						// if( x + y == array.length - 1 )
						if( x + y == ( array.length - top ) )
						{
							up = true;
							y --;
						}
						else
						{
							y --;
						}
					}
				}
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