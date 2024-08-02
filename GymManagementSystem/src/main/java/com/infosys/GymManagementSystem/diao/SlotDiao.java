package com.infosys.GymManagementSystem.diao;

import java.util.List;

import com.infosys.GymManagementSystem.bean.Slot;
import com.infosys.GymManagementSystem.bean.SlotItem;

public interface SlotDiao {
	public void saveNewSlot(Slot slotItem);
	public List<Slot> displayAllSlot();
	public Slot findSlotById(Long id);
	public Long generateSlotId();
	public void deleteById(Long id);
	
	public void updateSlot(Slot slot);

	
}