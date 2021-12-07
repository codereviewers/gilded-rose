package com.gildedrose;

class GildedRose {
<<<<<<< HEAD
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }
=======

	private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
	private static final String AGED_BRIE = "Aged Brie";
	static final int MAX_QUALITY = 50;
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}
	
	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			Item item = items[i];
			updateQuality(item);

			updateSellIn(item);
		}
	}

	protected void updateSellIn(Item item) {
		if (item.name.equals(SULFURAS)) {
		} else {
			item.sellIn = item.sellIn - 1;
		}
	}

	protected void updateQuality(Item item) {
		GildedRoseItem gildedRoseItem = createGildedRoseItem(item);
		gildedRoseItem.updateQuality();
	}

	protected GildedRoseItem createGildedRoseItem(Item item) {
		GildedRoseItem gildedRoseItem;
		if (item.name.equals(AGED_BRIE)) {
			gildedRoseItem = new AgedBrieItem(item);
		} else if (item.name.equals(BACKSTAGE_PASSES)) {
			gildedRoseItem = new BackstagePassItem(item);
		} else if (item.name.equals(SULFURAS)) {
			gildedRoseItem = new SulfurasItem(item);
		} else {
			gildedRoseItem = new NormalItem(item);
		}
		return gildedRoseItem;
	}
>>>>>>> 2adc276471f801d42ca1b29174e2d3abe631da74
}
