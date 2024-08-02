package com.infosys.GymManagementSystem.diao;

import java.util.List;
import java.util.Set;

import com.infosys.GymManagementSystem.bean.SlotItem;
import com.infosys.GymManagementSystem.bean.SlotItemEmbed;

public interface SlotItemDiao {
	public void save(SlotItem slotItem);
	public List<SlotItem> displayAllItem();
	public SlotItem findItemById(SlotItemEmbed id);
	public Integer findSeatBookedById(SlotItemEmbed id);
	public Set<SlotItemEmbed> findAllEmbeds();
	public void deleteSlotItemsBySlotId(Long slotId);
	public void deleteSlotItemsByItemId(Long itemId);

}