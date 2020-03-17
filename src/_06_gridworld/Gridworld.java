package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(10);
		int y = rand.nextInt(10);
		int x2 = rand.nextInt(10);
		int y2 = rand.nextInt(10);
		World world = new World();
		world.show();
		Bug bug = new Bug();
		Bug bug2 = new Bug();
		Location loc = new Location(x, y);
		Location loc2 = new Location(x2, y2);
		world.add(loc, bug);
		bug2.setColor(Color.blue);
		bug2.turn();
		bug2.turn();
		System.out.println();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if((i != x && j != y) || (i != x2 && j != y2)) {
					Flower flower = new Flower();
					Location loc3 = new Location(i, j);
					world.add(loc3, flower);
				}
			}
		}
		
	}
}
