import java.io.*;
import java.util.*;

public class Save extends Value
{
	public void loadSave(File loadPath) throws Exception
	{
		Scanner loadScanner = new Scanner(loadPath);
		
		while(loadScanner.hasNext())
		{
			for(int y=0;y<Screen.room.block.length;y++)
			{
				for(int x=0;x<Screen.room.block[0].length;x++)
				{
					Screen.room.block[y][x].groundID = loadScanner.nextInt();
				}
			}
			
			for(int y=0;y<Screen.room.block.length;y++)
			{
				for(int x=0;x<Screen.room.block[0].length;x++)
				{
					Screen.room.block[y][x].airID = loadScanner.nextInt();
				}
			}
		}
		
		loadScanner.close();
	}
}
