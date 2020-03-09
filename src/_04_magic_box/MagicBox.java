package _04_magic_box;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MagicBox extends JPanel implements Runnable, MouseListener {

	/*
	 * We are going to hide secrets within the magic box. 
	 * When the user clicks on a secret place, stuff will happen.
	 * 
	 * 1. Make the frame respond to mouse clicks.
	 *
	 * 2. When the mouse is clicked, use the Media Palace (read the code in the magic_box package) to play sounds, 
	 *    show images or speak.
	 * 
	 * 3. Choose 3 different locations on the background image.You can either use the mouse position, 
	 *    or the color of the image, then decide what action the Media Palace should take in each case. 
	 *     backgroundImage.getRGB(e.getX(), e.getY()) will give you the color of the current pixel.
	 */
	JFrame frame = new JFrame();
	JFrame frame2 = new JFrame();
	MagicBox(){
	}

	BufferedImage backgroundImage;


	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}

	private void createUI() {
		frame = new JFrame("The Magic Box contains many secrets...");
		frame.add(this);
		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame2.setVisible(true);
		frame.addMouseListener(this);
	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "src/_04_magic_box/magic-box.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JFrame mouseClicked = (JFrame) e.getSource();
		int color=0;
		if(mouseClicked == frame) {
			color = backgroundImage.getRGB(e.getX(), e.getY());
			System.out.println(color);
		}
		if(mouseClicked == frame && color==-9911626) {
			MediaPalace mediaPalace = new MediaPalace();
			try {
				frame2=new JFrame();
				frame2.setVisible(true);
				frame2.add(mediaPalace.loadImageFromTheInternet("http://clipart-library.com/images/8TEb9p4ec.jpg"));
				frame2.pack();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(mouseClicked == frame && color==-69429) {
			MediaPalace mediaPalace = new MediaPalace();
			try {
				frame2=new JFrame();
				frame2.setVisible(true);
				frame2.add(mediaPalace.loadImageFromTheInternet("https://imageresizer.static9.net.au/2mliheqNI8i764-GSkG_MWeCaCg=/1200x0/https%3A%2F%2Fprod.static9.net.au%2F_%2Fmedia%2F2018%2F06%2F12%2F15%2F16%2FTop-10-most-expensive-beaches-in-the-world.jpg"));
				frame2.pack();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(mouseClicked == frame && color==-332601) {
			MediaPalace mediaPalace = new MediaPalace();
			try {
				frame2=new JFrame();
				frame2.setVisible(true);
				frame2.add(mediaPalace.loadImageFromTheInternet("https://wolf-wallpapers.pro/images/cool-wolf-wallpapers-wallpapersafari-1-wolf-wallpapers.pro.jpg"));
				frame2.pack();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}


