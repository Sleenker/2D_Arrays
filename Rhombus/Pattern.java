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
 *			BIDIMENSIONAL ARRAY, RHOMBUS PATH BULD.
 *
 * Licenses: GNU GPL v3.0, Eclipse Public License 1.0, personal not for commercial purposes.
 * Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com || jtrejosb@icloud.com
 * Mobile: (+57) 317 311 3223.
 */

//-------------------------------------------------------------------------------------------------------------------------------------------------

public class Pattern
{
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public static void main( String[] args )
	{
		int size;
		System.out.print( "Array Size (solo valores IMPARES): " );

		do
		{
			size = new Scanner( System.in ).nextInt();

			if( size % 2 == 0 )
			{
				System.out.print( "Error.\nHa ingresado un valor par, reingrese un valor impar: " );
			}
		}
		while( size % 2 == 0 );

		new Pattern().printPath( size );
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	public void printPath( int size )
	{
		int[][] array = new int[ size ][ size ];
		int x = -1, y = array.length / 2 - 1, counter = 0;
		boolean downR = true, downL = false, upL = false;
		
		for( int k = 1; k <= (array.length * array.length) / 2 + 1; k++ )
		{
			if( downR )
			{
				x ++;
				y ++;
				
				if( y == array.length - counter )
				{
					y -= 2;
					downR = false;
					downL = true;
				}
			}
			else
			{
				if( downL )
				{
					y --;
					x ++;
					
					if( x == array.length - counter )
					{
						x -= 2;
						downL = false;
						upL = true;
					}
				}
				else
				{
					if( upL )
					{
						x --;
						y --;
						
						if( y ==  -1 + counter )
						{
							y += 2;
							upL = false;
						}
						
						// if( ! array[ x ][ y ].equals( "" ) )
						if( array[ x ][ y ] != 0 )
						{
							x ++;
						}
					}
					else
					{
						x --;
						y ++;
						
						// if( ! array[ x ][ y ].equals( "" ) )
						if( array[ x ][ y ] != 0 )
						{
							x ++;
							downR = true;
							counter ++;
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
				if( array[ i ][ j ] == 0 )
				{
					System.out.print( "\t" );
				}
				else
				{
					System.out.print( array[ i ][ j ] + "\t" );
				}
			}
		}

		System.out.println( "\n" );
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------
}
//-------------------------------------------------------------------------------------------------------------------------------------------------