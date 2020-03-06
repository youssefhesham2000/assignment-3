package eg.edu.alexu.csd.datastructure.iceHockey.cs95;

import java.awt.Point;

public class FindPlayer {
	static int Min_x=1000,Max_x=0,Min_y=1000,Max_y=0,NumOfElements=0;
	static boolean arr [][]=new boolean[50][50];
	public static void checkingAvailability(int x,int y,int xBounds,int yBounds) {
		NumOfElements++;
		arr[y][x]=false;
		if(x>Max_x) {
			Max_x=x;
		}
		 if(x<Min_x) {
			Min_x=x;
		}
		if(y>Max_y) {
			Max_y=y;
		}
		 if(y<Min_y) {
			Min_y=y;
		}
		
		if(x-1<0||y-1<0) {
			if(arr[y][x+1]==true) {
				arr[y][x+1]=false;
				checkingAvailability(x+1,y,xBounds,yBounds);
			}
			if(arr[y+1][x]==true) {
				arr[y+1][x]=false;
				checkingAvailability(x,y+1,xBounds,yBounds);
			}
			if(!(x-1<0)&&arr[y][x-1]==true) {
				arr[y][x-1]=false;
				checkingAvailability(x-1,y,xBounds, yBounds);
			}
			else if(!(y-1<0)&&arr[y-1][x]) {
				arr[y-1][x]=false;
				checkingAvailability(x,y-1,xBounds,yBounds);
			}
			
		}
		else if(x+1>xBounds||y+1>yBounds) {
			if(arr[y][x-1]==true) {
				arr[y][x-1]=false;
				checkingAvailability(x-1,y,xBounds,yBounds);
			}
			if(arr[y-1][x]==true) {
				arr[y-1][x]=false;
				checkingAvailability(x,y-1,xBounds,yBounds);
			}
			if(!(x+1>xBounds)&&arr[y][x+1]==true) {
				arr[y][x+1]=false;
				checkingAvailability(x+1,y,xBounds, yBounds);
			}
			else if(!(y+1>yBounds)&&arr[y+1][x]) {
				arr[y+1][x]=false;
				checkingAvailability(x,y+1,xBounds,yBounds);
			}
			
		}
		else if(x-1<0&&y+1>yBounds) {
			if(arr[y][x+1]==true) {
				arr[y][x+1]=false;
				checkingAvailability(x+1,y,xBounds,yBounds);
			}
			if(arr[y-1][x]==true) {
				arr[y-1][x]=false;
				checkingAvailability(x,y-1,xBounds,yBounds);
			}
			
		}
		else if(x+1>xBounds&&y-1<0) {
			if(arr[y][x-1]==true) {
				arr[y][x-1]=false;
				checkingAvailability(x-1,y,xBounds,yBounds);
			}
			if(arr[y+1][x]==true) {
				arr[y+1][x]=false;
				checkingAvailability(x,y+1,xBounds,yBounds);
			}
			
		}
		//main case
		if(x+1<=xBounds&&x-1>=0&&y+1<=yBounds&&y-1>=0) {
			if(arr[y][x+1]==true) {
				arr[y][x+1]=false;
				checkingAvailability(x+1,y,xBounds,yBounds);
			}
			if(arr[y][x-1]==true) {
				arr[y][x-1]=false;
				checkingAvailability(x-1,y,xBounds,yBounds);
			}
			if(arr[y-1][x]==true) {
				arr[y-1][x]=false;
				checkingAvailability(x,y-1,xBounds,yBounds);
			}
			if(arr[y+1][x]==true) {
				arr[y+1][x]=false;
				checkingAvailability(x,y+1,xBounds,yBounds);
			}
		}
		
		
		
	}
	public static java.awt.Point[] findPlayers(String[] photo, int team, int threshold){
		Point[]Ans=new Point[50];
		int count =0;
		if(photo[0]==null) {
			throw new NullPointerException("empty image");
		}
		else {
		for(int i=0;i<photo.length;i++) {
			for(int k=0;k<photo[0].length();k++) {
				if(photo[i].charAt(k)==team+48) {
					arr[i][k]=true;
				}
			}
		}
		int xB=photo[0].length()-1;
		int yB=photo.length-1;
		for(int i=0;i<photo.length;i++) {
			for(int k=0;k<photo[0].length();k++) {
				if(arr[i][k]==true) {
					//reseting values
				Min_x=1000;Max_x=0;Min_y=1000;Max_y=0;NumOfElements=0;
				checkingAvailability(k,i,xB,yB);
				if(NumOfElements*4>=threshold) {
					int x=(Min_x*2+Max_x*2+2)/2;
					int y=(Min_y*2+Max_y*2+2)/2;
					Ans[count]=new Point(x,y);
					count++;
				}
				}
			}
		}
		Point[] temp=new Point[1];
	        for (int i = 0; i < count; i++) { 
	            for (int j = 0; j < count-1; j++) {
	                if (Ans[j].x > Ans[j+1].x) 
	                { 
	                     temp[0] = Ans[j]; 
	                    Ans[j] = Ans[j+1]; 
	                    Ans[j+1] = temp[0]; 
	                }
	            }
	}
	        for(int i=0;i<count;i++) {
	        	System.out.println(Ans[i].getLocation());
	        }
	return Ans;
	}
	}
}
