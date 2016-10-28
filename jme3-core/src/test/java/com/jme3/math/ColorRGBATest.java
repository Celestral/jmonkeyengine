package com.jme3.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColorRGBATest {
	
	@Test
	public void testColors()
	{
		float red = ColorRGBA.Black.getRed();
		
		assertEquals(0f, red, 0f);
	}
	
	@Test
	public void testAddition()
	{
		float mRed = ColorRGBA.Magenta.getRed();
		float rRed = ColorRGBA.Red.getRed();
		
		ColorRGBA newColor = new ColorRGBA(ColorRGBA.Red.add(ColorRGBA.Magenta));
		float newRed = newColor.getRed();
		
		assertEquals(1f, newRed, 0f);
	}

}
