package eg.edu.alexu.csd.datastructure.iceHockey.cs95;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;

import org.junit.jupiter.api.Test;

class Testing {

	@Test
	void test() {
		FindPlayer test=new FindPlayer();
		String[] photo= {
				"44444H44S4",
				"K444K4L444",
				"4LJ44T44XH",
				"444O4VIF44",
				"44C4D4U444",
				"4V4Y4KB4M4",
				"G4W4HP4O4W",
				"4444ZDQ4S4",
				"4BR4Y4A444",
				"4G4V4T4444"	
		};
		Point[] Ans=new Point[50];
		Ans[0]= new Point(3,8);
		Ans[1]= new Point(4,16);
		Ans[2]= new Point(5,4);
		Ans[3]= new Point(16,3);
		Ans[4]= new Point(16,17);
		Ans[5]= new Point(17,9);
		 Point [] out=FindPlayer.findPlayers(photo,4, 16);
		for(int i=0;i<50;i++) {
		 assertEquals(Ans[i],out[i]);
		}
		}
	@Test
	void test2() {
		FindPlayer test=new FindPlayer();
		String[] photo= {
				"8D88888J8L8E888",
				"88NKMG8N8E8JI88",
				"888NS8EU88HN8EO",
				"LUQ888A8TH8OIH8",
				"888QJ88R8SG88TY",
				"88ZQV88B88OUZ8O",
				"FQ88WF8Q8GG88B8",
				"8S888HGSB8FT8S8",
				"8MX88D88888T8K8",
				"8S8A88MGVDG8XK8",
				"M88S8B8I8M88J8N",
				"8W88X88ZT8KA8I8",
				"88SQGB8I8J88W88",
				"U88H8NI8CZB88B8",
				"8PK8H8T8888TQR8"
		};
		Point[] Ans=new Point[50];
		Ans[0]= new Point(1,17);
		Ans[1]= new Point(3,3);
		Ans[2]= new Point(3,10);
		Ans[3]= new Point(3,25);
		Ans[4]= new Point(5,21);
		Ans[5]= new Point(8,17);
		Ans[6]= new Point(9,2);
		Ans[7]= new Point(10,9);
		Ans[8]= new Point(12,23);
		Ans[9]= new Point(17,16);
		Ans[10]= new Point(18,3);
		Ans[11]= new Point(18,11);
		Ans[12]= new Point(18,28);
		Ans[13]= new Point(22,20);
		Ans[14]= new Point(23,26);
		Ans[15]= new Point(24,15);
		Ans[16]= new Point(27,2);
		Ans[17]= new Point(28,26);
		Ans[18]= new Point(29,16);
		 Point [] out=FindPlayer.findPlayers(photo,8, 9);
		for(int i=0;i<50;i++) {
		 assertEquals(Ans[i],out[i]);
		}
		}
}


