package com.infosys.GymManagementSystem.diao;

import java.util.List;

import com.infosys.GymManagementSystem.bean.GymItem;

public interface GymItemDiao {
	public void saveNewItem(GymItem gymItem);
	public List<GymItem> displayAllItems();
	public GymItem findItemsById(Long id);
	public Long generateItemId();
}