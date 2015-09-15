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
 *			BIDIMENSIONAL ARRAY, SPIRAL PATTERN BUILD. TYPE 2: OUT-IN.
 *
 * Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
 * Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
 * Mobile: --.
 */

//-------------------------------------------------------------------------------------------------------------------------------------------------

public class Pattern2
{
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public static void main( String[] args )
	{
		System.out.print( "Array Size: " );

		new Pattern2().printPattern( new Scanner( System.in ).nextInt() );
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public void printPattern( int size )
	{
		int[][] array = new int[ size ][ size ];
		int x = 0, y = -1;
		boolean left = false, right = true, down = false;
		
		for( int k = 1; k <= Math.pow( array.length, 2 ); k++ )
		{
			if( left )
			{
				y --;
				
				if( y == -1 )
				{
					y = 0;
					x --;
					left = false;
				}
				else
				{
					if( array[ x ][ y ] != 0 )
					{
						y ++;
						x --;
						left = false;
					}
				}
			
			}
			else
			{
				if( right )
				{
					y ++;
					
					if( y == array.length )
					{
						y = array.length - 1;
						x ++;
						right = false;
						down = true;
					}
					else
					{
						if( array[ x ][ y ] != 0 )
						{
							y --;
							x ++;
							right = false;
							down = true;
						}
					}
					
				}
				else
				{
					if( down )
					{
						x ++;
						
						if( x == array.length )
						{
							x = array.length - 1;
							y --;
							down = false;
							left = true;
						}
						else
						{
							if( array[ x ][ y ] != 0 )
							{
								y --;
								x --;
								down = false;
								left = true;
							}
						}
						
					}
					else
					{
						x --;
						
						if( x == -1 )
						{
							x ++;
							y ++;
							right = true;
						}
						else
						{
							if( array[ x ][ y ] != 0 )
							{
								x ++;
								y ++;
								right = true;
							}
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