package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gildedrose.GildedRose;
import com.gildedrose.Item;

public class GildedRoseTest {

	@Test
	public void should_be_nothing_when_no_item(){
		// given (arrange)
		Item[] items = new Item[]{};
		GildedRose gildedRose = new GildedRose(items);
		
		// when (act)
		gildedRose.updateQuality();
		
		// then (assert)
		assertEquals(0, items.length);
	}
}
